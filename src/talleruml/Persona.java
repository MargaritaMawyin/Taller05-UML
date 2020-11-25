/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Persona {
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fecNac;
    protected Administrador admin;

    public Persona(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecNac, Administrador admin) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fecNac = fecNac;
        this.admin = admin;
    }
    public boolean logIn(){
        return true;
    }
    public boolean logOut(){
        return true;
    }
}
