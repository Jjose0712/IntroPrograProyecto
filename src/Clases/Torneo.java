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
    
    public Torneo(String pNombre,Equipo[] pEquipos, String pFecha){
      setNombre(pNombre);
      setEquipos(pEquipos);
      setFecha(pFecha);
    }
    
    private void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    private void setEquipos(Equipo[] pEquipos) {
        this.equipos = pEquipos;
    }
    
    private void setFecha(String pFecha) {
        this.fecha = pFecha;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public Equipo[] getEquipos() {
        return this.equipos;
    }
    
    public String getFecha() {
        return this.fecha;
    }
    
    public void agregarEquipo(Equipo pEquipo){
        for (int i = 0; i < this.equipos.length; i++) {
            this.equipos[i] = pEquipo;
        }
    }
}
