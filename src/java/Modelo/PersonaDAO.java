/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anderson
 */
public class PersonaDAO {

    private Conexion conecta;
    //Conexion conecta = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
     public PersonaDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new Conexion(jdbcURL, jdbcUSERName, jdbcPassword);
        //para probar imprimo datos de la conexion en el logo
        System.out.println(conecta.getJdbcConnection());

    }      

    //este metodo permite escribir en la BD, un objeto p de tipo Pais
    public boolean registrar(Persona p) {
        //zoan de variables      
        boolean estado = false;
        Statement stm;
        String sql = "insert into usuario values (NULL,'" + p.getUsu() + "','" + p.getContra() + "')";

        try {
            conecta.connection();//abro la base de datos
            stm = conecta.getJdbcConnection().createStatement();
            stm.executeUpdate(sql);
            estado = true;
            conecta.disconnec();
        } catch (SQLException e) {
            estado = false;
            e.printStackTrace();
        }
        return estado;
    }

    public Persona validar(String usu, String contra) {
        Persona p = new Persona();
        String sql = "select * from usuario where usu=? and contra=?";
        try {
            conecta.connection();
            ps = conecta.getJdbcConnection().prepareStatement(sql);
            ps.setString(1, usu);
            ps.setString(2, contra);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setUsu(rs.getString("usu"));
                p.setContra(rs.getString("contra"));

            }
        } catch (Exception e) {

        }
        return p;
    }

}
