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
public class Medico {

     private int idmedico;
    private String fk_servicio_medico;
    private int cedula;
    private String nombre;
    private String apellido;
    private int telefono;

    public Medico(int idmedico, String fk_servicio_medico, int cedula, String nombre, String apellido, int telefono) {
        this.idmedico = idmedico;
        this.fk_servicio_medico = fk_servicio_medico;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Medico() {
    }

    public int getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }

    public String getFk_servicio_medico() {
        return fk_servicio_medico;
    }

    public void setFk_servicio_medico(String fk_servicio_medico) {
        this.fk_servicio_medico = fk_servicio_medico;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}