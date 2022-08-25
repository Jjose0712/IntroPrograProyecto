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
public class Juez {
    private int id;
    private String nombre;
    private int edad;
    private String torneo;

    public Juez(int pId,String pNombre,int pEdad,String pTorneo){
       setId(pId);
       setNombre(pNombre);
       setEdad(pEdad);
       setTorneo(pTorneo);
    }
    
    private void setId(int pId) {
        this.id = pId;
    }
    
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    public void setEdad(int pEdad) {
        this.edad = pEdad;
    }
    
    public void setTorneo(String pTorneo) {
        this.torneo = pTorneo;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getTorneo(){
        return torneo;
    }
}
