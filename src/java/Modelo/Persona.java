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
public class Persona {
    private int ID_Usuario;
    private String usu;
    private String contra;
    

    public Persona(int ID_Usuario, String usu, String contra) {
        this.ID_Usuario = ID_Usuario;
        this.usu = usu;
        this.contra = contra;
    }

    public Persona() {
    }

    
   

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
}

   