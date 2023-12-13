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


/**
 *
 * @author Anderson
 */
public class MedicoDAO {

    Conexion conecta;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public MedicoDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new Conexion(jdbcURL, jdbcUSERName, jdbcPassword);
        //para probar imprimo datos de la conexion en el logo
        System.out.println(conecta.getJdbcConnection());
    }

     public ArrayList listar() {
        Medico p =null;//declaro un objeto p de tipo pais;
        ArrayList<Medico> medico = new ArrayList();//creo un arraylist de objetos
        Statement stm;//ejecutar la orden contra la base de datos 
        ResultSet resConsulta = null;// es para recivir la consulta de la base de datos 
        String sql = "select * from medico";
       try 
        {
            conecta.connection();//abro la conexion
            stm=conecta.getJdbcConnection().createStatement();//
            resConsulta = stm.executeQuery(sql);
            while(resConsulta.next())//recorrer el resumtado(statement)
            {
                p = new Medico(resConsulta.getInt("idmedico"),resConsulta.getString("fk_servicio_medico"),resConsulta.getInt("cedula"),resConsulta.getString("nombre"),resConsulta.getString("apellido"),resConsulta.getInt("telefono"));//instanciar objeto pais
                medico.add(p);
            }
            stm.close();
            conecta.disconnec();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            
        }
        System.out.println(p.toString());
        return medico;
    }

    public int agregar(Medico m) {
        String sql = "insert into medico(cedula,nombre,apellido,telefono,fk_idservicio)values(?,?,?,?,?)";
        try {
            conecta.connection();
            ps = conecta.getJdbcConnection().prepareStatement(sql);
            ps.setString(1, m.getFk_servicio_medico());
            ps.setInt(2, m.getCedula());
            ps.setString(3, m.getNombre());
            ps.setString(4, m.getApellido());
            ps.setInt(5, m.getTelefono());

            ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }

    public Medico listarId(int id) {
        Medico m = new Medico();
        String sql = "select * from medico where idmedico=" + id;
        try {
            conecta.connection();
            ps = conecta.getJdbcConnection().prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                m.setFk_servicio_medico(rs.getString(2));
                m.setCedula(rs.getInt(3));
                m.setNombre(rs.getString(4));
                m.setApellido(rs.getString(5));
                m.setTelefono(rs.getInt(6));

            }
        } catch (Exception e) {

        }
        return m;
    }

    public int actualizar(Medico m) {
        String sql = "update medico set area=?,cedula=?,nombre=?,apellido=?,telefono=? where idmedico=?";
        try {
            conecta.connection();
            ps = conecta.getJdbcConnection().prepareStatement(sql);
            ps.setInt(6, m.getIdmedico());
            ps.setString(1, m.getFk_servicio_medico());
            ps.setInt(2, m.getCedula());
            ps.setString(3, m.getNombre());
            ps.setString(4, m.getApellido());
            ps.setInt(5, m.getTelefono());

            ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }

    public void delete(int id) {
        String sql = "delete from medico where idmedico=" + id;
        try {
            conecta.connection();
            ps = conecta.getJdbcConnection().prepareStatement(sql);

            ps.executeUpdate();
        } catch (Exception e) {

        }

    }

}
