/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.ArrayList;
import org.joda.time.DateTime;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author margo
 */
public class Receta {
    protected DateTime fecha;
    
    protected Doctor doctor;
    protected List<Medicamento> medicamentos;    
    protected java.util.Collection PlanNutricional;

    public Receta() {
    }

    public Receta(DateTime fecha, Doctor doctor) {
        this.fecha = fecha;
        this.doctor = doctor;
        PlanNutricional = (Collection) new PlanNutricional();
        medicamentos = new ArrayList<Medicamento>();
    }

    
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    } 

    public DateTime getFecha() {
        return fecha;
    }

    public Collection getPlanNutricional() {
        return PlanNutricional;
    }

    public void setFecha(DateTime fecha) {
        this.fecha = fecha;
    }

    public void setPlanNutricional(Collection PlanNutricional) {
        this.PlanNutricional = PlanNutricional;
    }
    
    
}
