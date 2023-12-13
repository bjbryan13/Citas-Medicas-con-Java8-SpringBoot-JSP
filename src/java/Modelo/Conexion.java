/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Anderson
 */
public class Conexion {

    private String jdbcURL;//guarda la cadena de coneccion a la base de datos
    private String jdbcUSERName;//nombre del usuario de del gestor de base de datos
    private String jdbcPassword;
    Connection con;

    public Conexion(String jdbcURL, String jdbcUSERName, String jdbcPassword) {
        this.jdbcURL = jdbcURL;// se instancia el url para hacer referencia a la direccion de la base de datos
        this.jdbcUSERName = jdbcUSERName; // se instancia el metodo al constructor, para hacer la referencia con el objeto nombre 
        this.jdbcPassword = jdbcPassword;//se instancia la contraseña se hace referencia a la contraseña pra ingresar a la base de datos 
    }

    public void connection() throws SQLException {
        if (con == null || con.isClosed()) {
            
                try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Conexion exitosa");//este mensaje indicara que el proyecto se conecto con la base
            } catch (ClassNotFoundException e) {
                System.out.println("Error");//este mensaje indicara que existe algun error al momento de conectar 
                throw new SQLException(e);
            }
            con = (Connection) DriverManager.getConnection(jdbcURL, jdbcUSERName, jdbcPassword);


        }
    }
      public void disconnec() throws SQLException {
        if (con != null && !con.isClosed()) //sirve para cerra la base 
        {
            con.close();
        }

    }

    //metodo permite trabajar con esta clase necesito de la conexion 
    public Connection getJdbcConnection() {
        return con;
    }

}
