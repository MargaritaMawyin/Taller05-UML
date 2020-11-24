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
public class Doctor extends Persona{
    private int regDoctor;
    private String especialidad;

    public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fecNac, int regDoctor, String especialidad) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fecNac);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
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
