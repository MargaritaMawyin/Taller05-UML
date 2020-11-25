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
public class Medicamento {
    protected String medicina;
    protected String dosis;
    protected String onservaciones;
    protected int cantidadTotal;
    protected String unidad;
    
    public String getMedicina() {
        return medicina;
    }

    public String getDosis() {
        return dosis;
    }

    public String getOnservaciones() {
        return onservaciones;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public void setOnservaciones(String onservaciones) {
        this.onservaciones = onservaciones;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }


    public Medicamento(String medicina, String dosis, String onservaciones, int cantidadTotal, String unidad) {
        this.medicina = medicina;
        this.dosis = dosis;
        this.onservaciones = onservaciones;
        this.cantidadTotal = cantidadTotal;
        this.unidad = unidad;
    }
    
    
}
