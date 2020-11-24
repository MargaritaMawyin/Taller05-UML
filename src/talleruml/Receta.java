/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.Collection;

/**
 *
 * @author margo
 */
public class Receta {
    protected Datetime fecha;
    
    protected java.util.Collection PlanNutricional;

    public Datetime getFecha() {
        return fecha;
    }

    public Collection getPlanNutricional() {
        return PlanNutricional;
    }

    public void setFecha(Datetime fecha) {
        this.fecha = fecha;
    }

    public void setPlanNutricional(Collection PlanNutricional) {
        this.PlanNutricional = PlanNutricional;
    }

    public Receta(Datetime fecha, Collection PlanNutricional) {
        this.fecha = fecha;
        this.PlanNutricional = PlanNutricional;
    }
    
    
}
