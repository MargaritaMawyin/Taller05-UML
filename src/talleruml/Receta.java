/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import org.joda.time.DateTime;
import java.util.Collection;

/**
 *
 * @author margo
 */
public class Receta {
    protected DateTime fecha;
    
    protected Paciente paciente;
    
    protected java.util.Collection PlanNutricional;

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

    public Receta(DateTime fecha, Collection PlanNutricional) {
        this.fecha = fecha;
        this.PlanNutricional = PlanNutricional;
    }
    
    
}
