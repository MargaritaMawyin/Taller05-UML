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
public class Secretaria extends Persona{
    protected java.util.Collection citasPendientes;
    protected Doctor doctor;
    protected Cita cita;
    
    public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecNac, Cita cita, Administrador admin) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fecNac, admin);
        this.cita = cita;
    }
    public void verificarCita(){
        
    }
    public void agendarCita(){
        
    }
    
    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }
}
