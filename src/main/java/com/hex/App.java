package com.hex;

import java.sql.SQLException;

import com.hex.application.service.AlumnoService;
import com.hex.infraestructure.config.DataBaseConfig;
import com.hex.infraestructure.repository.JdbcAlumnoRepository;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        try(var cn = DataBaseConfig.stablishConnection("hex_example")){

            var alumnoRepository = new JdbcAlumnoRepository(cn);
            var alumnoService = new AlumnoService(alumnoRepository);

            var item = alumnoService.getAllAlumnos();
            
            item.forEach(System.out::println);

            var _a = alumnoService.getAlumno(3);
            System.out.println(_a.toString());
            

        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
