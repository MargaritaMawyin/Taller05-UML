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
public class Cita {
    protected Datetime fecha;
    protected boolean pagada;
    protected String registroPor ;
    
    protected Paciente paciente; //creo que en Paciente va Cita

    public Cita(Datetime fecha, boolean pagada, String registroPor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registroPor = registroPor;
    }
    
    
    public Pago realizarPago (Pago pago){
        return pago;
    }
}
