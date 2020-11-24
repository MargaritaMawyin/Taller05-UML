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
public class Paciente extends Persona{
    private String email;
    public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecNac, String email) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fecNac);
        this.email = email;
    }
    public boolean solicitarCita(){
        return true;
    }
    
}
