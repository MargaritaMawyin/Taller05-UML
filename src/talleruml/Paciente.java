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
    protected String email;
    protected HistoriaClinica historial;
    protected Receta receta;
    protected Cita cita;
    public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecNac, String email, HistoriaClinica historial, Receta receta, Cita cita) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fecNac);
        this.email = email;
        this.historial = historial;
        this.receta = receta;
        this.cita = cita;
    }   
    public boolean solicitarCita(){
        return true;
    }
    
}
