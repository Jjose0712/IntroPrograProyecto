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
    private Integrante integrante;
    
    public Equipo(String pNombre,Integrante[] pIntegrantes){
      this.nombre = pNombre;
      this.integrantes = pIntegrantes;
    }
    
    public Equipo(Equipo pEquipo){
      this.nombre = pEquipo.nombre;
      this.integrantes = pEquipo.integrantes;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Integrante[] obtenerIntegrantes(){
        return integrantes;
    }
    
    public void agregarIntegrante(Integrante pIntegrante){
        integrante = new Integrante(pIntegrante);
        for (int i = 0; i < this.integrantes.length; i++) {
            this.integrantes[i] = pIntegrante;
        }
    }
}
   
