/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *          Test for Geo
 * @author Jose
 */
public final class Equipo {
    private int id;
    private String nombre;
    private Integer puntos;
    private Integrante[] integrantes;
    private String torneo;
    
    public Equipo(int pId,String pNombre,Integer pPuntos,Integrante[] pIntegrantes,String pTorneo){
      setId(pId);
      setNombre(pNombre);
      setPuntos(pPuntos);
      setIntegrantes(pIntegrantes);
      setTorneo(pTorneo);
    }
    
    public Equipo(Equipo pEquipo){
      setId(pEquipo.id);
      setNombre(pEquipo.nombre);
      setIntegrantes(pEquipo.integrantes);
    }
    
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    public void setTorneo(String pTorneo) {
        this.torneo = pTorneo;
    }
    
    private void setId(int pId) {
        this.id = pId;
    }
    public void setPuntos(Integer pPuntos) {
        this.puntos = pPuntos;
    }
    
    private void setIntegrantes(Integrante[] pIntegrantes) {
        this.integrantes = pIntegrantes;
    }
    
    public int getId(){
        return id;
    }
    
    public Integer getPuntos(){
        return puntos;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTorneo(){
        return torneo;
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
   
