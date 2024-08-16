package com.hex.infraestructure.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DataBaseConfig {

    static{

        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException er) {
			er.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al cargar controlador: " + er.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception er) {
			er.printStackTrace();
		}

    }
    
    /**
     * 
     * @param dbName
     * @return
     * @throws SQLException
     * @throws Exception
     */
    public static Connection stablishConnection(String dbName)throws SQLException, Exception{

        final String url = "jdbc:mysql://localhost:3306/" + dbName;
        final String user = "root";
        return DriverManager.getConnection(url, user, "1234");

    }

}
