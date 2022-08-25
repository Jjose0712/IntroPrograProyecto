/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Geo
 */
public class Integrante {
    private String nombre;
    private int edad;
    private String pais;

    public Integrante(String pNombre,int pEdad,String pPais){
       setNombre(pNombre);
       setEdad(pEdad);
       setPais(pPais);
    }
    
    public Integrante(Integrante pIntegrante){
       setNombre(pIntegrante.nombre);
       setEdad(pIntegrante.edad);
       setPais(pIntegrante.pais);
     }
    
    private void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    private void setEdad(int pEdad) {
        this.edad = pEdad;
    }
    
    private void setPais(String pPais) {
        this.pais = pPais;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getPais(){
        return pais;
    }
}
