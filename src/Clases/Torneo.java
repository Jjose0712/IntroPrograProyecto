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
public class Torneo {
    private String nombre;
    private Equipo[] equipos;
    private String fecha;
    private Equipo equipo;
    
    public Torneo(String pNombre,Equipo[] pEquipos, String pFecha){
      this.nombre = pNombre;
      this.equipos = pEquipos;
      this.fecha = pFecha;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerFecha(){
        return nombre;
    }
    
    public Equipo[] obtenerEquipos(){
        return equipos;
    }
    
    public void agregarEquipo(Equipo pEquipo){
        equipo = new Equipo(pEquipo);
        for (int i = 0; i < this.equipos.length; i++) {
            this.equipos[i] = pEquipo;
        }
    }
}
