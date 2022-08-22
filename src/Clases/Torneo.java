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
    private int id;
    private String nombre;
    private Equipo[] equipos;
    private String fecha;
    
    public Torneo(int pId,String pNombre,Equipo[] pEquipos, String pFecha){
      setId(pId);
      setNombre(pNombre);
      setEquipos(pEquipos);
      setFecha(pFecha);
    }
    
    private void setId(int pId) {
        this.id = pId;
    }
    
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    private void setEquipos(Equipo[] pEquipos) {
        this.equipos = pEquipos;
    }
    
    public void setFecha(String pFecha) {
        this.fecha = pFecha;
    }
    
    public int getId() {
        return this.id;
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
