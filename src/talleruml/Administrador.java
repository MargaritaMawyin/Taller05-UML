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
public class Administrador extends Persona {
    
    public Administrador(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecNac, Administrador admin) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fecNac, admin);
    }
    public void registrarUsuario(){
        
    }
    public void asignarRol(Persona p){
        
    }
    
}
