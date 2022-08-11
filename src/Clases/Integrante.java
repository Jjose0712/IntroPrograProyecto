/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jose
 */
public class Integrante {
    private String nombre;
    private String apellido;
    private int edad;
    private String pais;

    public Integrante(String pNombre,String pApellido,int pEdad,String pPais){
       setNombre(pNombre);
       setApellido(pApellido);
       setEdad(pEdad);
       setPais(pPais);
    }
    
    public Integrante(Integrante pIntegrante){
       setNombre(pIntegrante.nombre);
       setApellido(pIntegrante.apellido);
       setEdad(pIntegrante.edad);
       setPais(pIntegrante.pais);
     }
    
    private void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    private void setApellido(String pApellido) {
        this.apellido = pApellido;
    }
    
    private void setEdad(int pEdad) {
        this.edad = pEdad;
    }
    
    private void setPais(String pPais) {
        this.nombre = pPais;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getPais(){
        return pais;
    }

    public String obtenerNombreCompleto(){
        return nombre + " " + apellido;
    }
}
