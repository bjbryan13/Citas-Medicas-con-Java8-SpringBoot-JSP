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
public class Registrar {
     private int idpaciente;
    private String nombre;
    private String apellido;
     private int telefono;
     private int peso;
    private int altura;
    private int edad;
    private String tiposangre;
    private String alergias;
    private String enfermedad;

    public Registrar(int idpaciente, String nombre, String apellido, int telefono, int peso, int altura, int edad, String tiposangre, String alergias, String enfermedad) {
        this.idpaciente = idpaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.tiposangre = tiposangre;
        this.alergias = alergias;
        this.enfermedad = enfermedad;
    }

    public Registrar() {
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTiposangre() {
        return tiposangre;
    }

    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
       
}
