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
public class Paciente {
    


    private int idpaciente;
    private String nombres;
    private String apellidos;
     private String cedula;
    private float peso;
    private float altura;
    private int edad;
    private String telefono;
    private String alergias;
    private String enfermedades;
    private String tiposangre;

    public Paciente(int idpaciente, String nombres, String apellidos, String cedula, float peso, float altura, int edad, String telefono, String alergias, String enfermedades, String tiposangre) {
        this.idpaciente = idpaciente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.telefono = telefono;
        this.alergias = alergias;
        this.enfermedades = enfermedades;
        this.tiposangre = tiposangre;
    }

    public Paciente() {
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getTiposangre() {
        return tiposangre;
    }

    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

}