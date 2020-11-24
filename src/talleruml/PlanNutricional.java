/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

/**
 *
 * @author margo
 */
public class PlanNutricional {
    protected String descripcion;
   
    protected Receta receta;

    public String getDescripcion() {
        return descripcion;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public PlanNutricional(String descripcion, Receta receta) {
        this.descripcion = descripcion;
        this.receta = receta;
    }
    
    
}
