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
public final class Equipo {
    private String nombre;
    private Integrante[] integrantes;
    
    public Equipo(String pNombre,Integrante[] pIntegrantes){
      setNombre(pNombre);
      setIntegrantes(pIntegrantes);
    }
    
    public Equipo(Equipo pEquipo){
      setNombre(pEquipo.nombre);
      setIntegrantes(pEquipo.integrantes);
    }
    
    private void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    private void setIntegrantes(Integrante[] pIntegrantes) {
        this.integrantes = pIntegrantes;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Integrante[] getIntegrantes(){
        return integrantes;
    }
    
    public void agregarIntegrante(Integrante pIntegrante){
        for (int i = 0; i < this.integrantes.length; i++) {
            this.integrantes[i] = pIntegrante;
        }
    }
}
   
