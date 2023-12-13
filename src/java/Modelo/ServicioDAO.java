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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson
 */
public class ServicioDAO {

    Conexion conecta;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public ServicioDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new Conexion(jdbcURL, jdbcUSERName, jdbcPassword);
        //para probar imprimo datos de la conexion en el logo
        System.out.println(conecta.getJdbcConnection());

    }

    public ArrayList listar() {
        Servicio p = null;//declaro un objeto p de tipo pais;
        ArrayList<Servicio> paises = new ArrayList();//creo un arraylist de objetos
        Statement stm;//ejecutar la orden contra la base de datos 
        ResultSet resConsulta = null;// es para recivir la consulta de la base de datos 
        String sql = "select * from servicio";
       try 
        {
            conecta.connection();//abro la conexion
            stm=conecta.getJdbcConnection().createStatement();//
            resConsulta = stm.executeQuery(sql);
            while(resConsulta.next())//recorrer el resumtado(statement)
            {
                p = new Servicio(resConsulta.getInt("idservicio"),resConsulta.getString("nombre"),resConsulta.getString("descripcion"));//instanciar objeto pais
                paises.add(p);
            }
            stm.close();
            conecta.disconnec();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            
        }
        System.out.println(p.toString());
        return paises;
    }

   public boolean registrar(Servicio p) {
        //zoan de variables
        boolean estado = false;
        Statement stm;
        String sql = "insert into servicio values (NULL,'" + p.getNombre() + "','" + p.getDescripcion()+ "')";
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

    public Servicio listarId(int id) {
        Servicio s = new Servicio();
        String sql = "select * from servicio where idservicio=" + id;
        try {
            conecta.connection();
            ps = conecta.getJdbcConnection().prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                s.setNombre(rs.getString(2));
                s.setDescripcion(rs.getString(3));

            }
        } catch (Exception e) {

        }
        return s;
    }

    public int actualizar(Servicio s) {
        String sql = "update servicio set nombre=?,descripcion=? where idservicio=?";
        try {
             conecta.connection();
            ps = conecta.getJdbcConnection().prepareStatement(sql);
            ps.setInt(3, s.getIdservicio());
            ps.setString(1, s.getNombre());
            ps.setString(2, s.getDescripcion());

            ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }

    public void delete(int id) {
        String sql = "delete from servicio where idservicio=" + id;
        try {
             conecta.connection();
            ps = conecta.getJdbcConnection().prepareStatement(sql);

            ps.executeUpdate();
        } catch (Exception e) {

        }

    }

}
