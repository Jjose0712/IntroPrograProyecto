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
public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    private String tipo;
    
    public Usuario(int pId,String pNombre, String pCorreo, String pContrasena, String pTipo){
        setId(pId);
        setNombre(pNombre);
        setCorreo(pCorreo);
        setContrasena(pContrasena);
        setTipo(pTipo);
    }
    
    private void setId(int pId) {
        this.id = pId;
    }
    
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    public void setCorreo(String pCorreo) {
        this.correo = pCorreo;
    }
    
    private void setContrasena(String pContrasena) {
        this.contrasena = pContrasena;
    }
    
    public void setTipo(String pTipo) {
        this.tipo = pTipo;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getCorreo() {
        return this.correo;
    }
    
    public String getContrasena() {
        return this.contrasena;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public String obtenerNombreCompleto(){
        return nombre;
    }
}
