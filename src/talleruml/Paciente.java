/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Paciente extends Persona{
    protected String email;
    protected HistoriaClinica historial;
    protected List<Receta> recetas;
    protected Cita cita;
    public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecNac, String email, Cita cita, Administrador admin) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fecNac, admin);
        this.email = email;
        this.historial = new HistoriaClinica();
        this.recetas = new ArrayList<Receta>();
        this.cita = cita;
    } 

    public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecNac, Administrador admin) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fecNac, admin);
    }
    
    
    public boolean solicitarCita(){
        return true;
    }
    
}
