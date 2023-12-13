/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Anderson
 */
public class Servicio {

    private int idservicio;
    private String nombre;
    private String descripcion;
    

    public Servicio(int idservicio, String nombre, String descripcion) {
        this.idservicio = idservicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Servicio() {
    }

   

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
