package com.hex.infraestructure.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hex.domain.model.Alumno;
import com.hex.domain.repository.AlumnoRepository;

public class JdbcAlumnoRepository implements AlumnoRepository{
    private final Connection connection;

    public JdbcAlumnoRepository(Connection connection){
        this.connection = connection;
    }

    @Override
    public void save(Alumno alumno) {
        
        try (var stm = connection.prepareCall("CALL Sp_InsertAlumno(?,?,?,?,?);")) {

            stm.setString(1, alumno.getMatricula());
            stm.setInt(2, alumno.getGrado());
            stm.setString(3, alumno.getNombre());
            stm.setString(4, alumno.getNumero());
            stm.setString(5, alumno.getMail());
            
            var succes = stm.execute();

            if(succes) System.out.println("Alumno Agregado");

        } catch (SQLException e) {
            System.out.println("Error de operacion: " + e.getSQLState());
            e.printStackTrace();
        }
        
    }

    @Override
    public Alumno findById(int id) {
        
        var item = new Alumno();

        try(var stm = connection.prepareCall("CALL Sp_AlumnoById(?)")){

            stm.setInt(1, id);

            var rset = stm.executeQuery();

            if(rset.next()){
                item.setIdAlumno(1);
                item.setMatricula(rset.getString(2));
                item.setGrado(rset.getInt(3));
                item.setNombre(rset.getString(4));
                item.setNumero(rset.getString(5));
                item.setMail(rset.getString(6));
                return item;
            }

            return item;

        }catch(SQLException e){
            e.printStackTrace();
            return item;
        }
        
    }

    @Override
    public List<Alumno> listAll() {
        
        var list = new ArrayList<Alumno>();

        try(var stm = connection.prepareCall("CALL Sp_ListAlumno();")){

            var rset = stm.executeQuery();

            while(rset.next()){
                var item = new Alumno();
                item.setIdAlumno(rset.getInt(1));
                item.setMatricula(rset.getString(2));
                item.setGrado(rset.getInt(3));
                item.setNombre(rset.getString(4));
                item.setNumero(rset.getString(5));
                item.setMail(rset.getString(6));
                list.add(item);
            }

            return list;

        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }        
    }


}
