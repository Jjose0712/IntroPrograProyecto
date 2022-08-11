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
    private String nombre;
    private String apellido;
    private String contrasena;
    private String tipo;
    
    public Usuario(String pNombre,String pApellido , String pContrasena, String pTipo){
        setNombre(pNombre);
        setApellido(pApellido);
        setContrasena(pContrasena);
        setTipo(pTipo);
    }
    
    private void setNombre(String pNombre) {
        this.nombre = pNombre;
    }
    
    private void setApellido(String pApellido) {
        this.apellido = pApellido;
    }
    
    private void setContrasena(String pContrasena) {
        this.nombre = pContrasena;
    }
    
    private void setTipo(String pTipo) {
        this.tipo = pTipo;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public String getContrasena() {
        return this.contrasena;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public String obtenerNombreCompleto(){
        return nombre + " " + apellido;
    }
}

enum TipoUsuario
{
    Admin, Juez, Participante;
}
 
