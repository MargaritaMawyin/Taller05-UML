/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Doctor extends Persona{
    protected int regDoctor;
    protected String especialidad;

    protected java.util.Collection citasPendientes;
    protected java.util.Collection recetas;

    public Doctor(int regDoctor, String especialidad, Collection citasPendientes, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecNac, Administrador admin) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fecNac, admin);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
        this.citasPendientes = citasPendientes;
    }
    
    
    public void recetar(){
        
    }
    public void agregarPlanNut(){
        
    }
    public void imprimirReceta(){
        
    }
    public void registraSecretaria(){
        
    }
}
