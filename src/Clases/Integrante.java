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
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final String pais;

    public Integrante(String pNombre,String pApellido,int pEdad,String pPais){
       this.nombre = pNombre;
       this.apellido = pApellido;
       this.edad = pEdad;
       this.pais = pPais;
    }
    
    public Integrante(Integrante pIntegrante){
        this.nombre = pIntegrante.nombre;
        this.apellido = pIntegrante.apellido;
        this.edad = pIntegrante.edad;
        this.pais = pIntegrante.pais;
     }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public int obtenerEdad(){
        return edad;
    }
    
    public String obtenerPais(){
        return pais;
    }

    public String obtenerNombreCompleto(){
        return nombre + " " + apellido;
    }
}
