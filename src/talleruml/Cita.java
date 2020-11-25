/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;
import org.joda.time.DateTime;


/**
 *
 * @author margo
 */
public class Cita {
    protected DateTime fecha;
    protected boolean pagada;
    protected String registroPor ;
    
    protected Paciente paciente; 
    protected Doctor dr;
    
    public Cita (){
    }

    public Cita(DateTime fecha, boolean pagada, String registroPor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registroPor = registroPor;
    }

    public Cita(DateTime fecha, boolean pagada, String registroPor, Paciente paciente, Doctor dr) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registroPor = registroPor;
        this.paciente = paciente;
        this.dr = dr;
    }
    
    
    public Pago realizarPago (Pago pago){
        return pago;
    }
}
