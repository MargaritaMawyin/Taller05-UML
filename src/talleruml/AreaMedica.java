/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.List;

/**
 *
 * @author Kevin Chevez pc
 */
public class AreaMedica {
    protected String especialidad;
    protected float costo;
    protected List<Doctor> doctores;
    

    public AreaMedica(String especialidad, float costo) {
        this.especialidad = especialidad;
        this.costo = costo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public void addDoctor(Doctor doctor){
        this.doctores.add(doctor);
    }
}
