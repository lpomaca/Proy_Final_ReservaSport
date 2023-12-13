
package Modelo;

import java.time.LocalTime;
import java.util.Date;

public class Reserva {
    
    
    private int idReserva;
    private String nombreCliente;
    private String nombreCampo;
    private String nombreCancha;
    
    private Date fechaReserva;
    LocalTime horaInicio;
    LocalTime horaFin;
    int duracion;
    float primerPago ;
    float segundoPago ;
    float pagototal ;
    private int estado;
    
    private int idCliente;
    private int idCampo;
    private int idCancha;
    private String nombreEstado;

    public static final int solicitada = 0;
    public static final int pagoPendiente = 1;
    public static final int pagoLiquidado = 2;
    public static final int  consumida= 3;
    public static final int  cancelada= 4;
    
    public Reserva() {
          this.estado = solicitada; 
    }

    public Reserva(int idReserva, int idCliente, int idCampo, int idCancha, Date fechaReserva, LocalTime horaInicio, LocalTime horaFin, int duracion, float primerPago, float segundoPago, float pagototal, int estado) {
        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.idCampo = idCampo;
        this.idCancha = idCancha;
        this.fechaReserva = fechaReserva;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.duracion = duracion;
        this.primerPago = primerPago;
        this.segundoPago = segundoPago;
        this.pagototal = pagototal;
        this.estado = estado;
        
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getPrimerPago() {
        return primerPago;
    }

    public void setPrimerPago(float primerPago) {
        this.primerPago = primerPago;
    }

    public float getSegundoPago() {
        return segundoPago;
    }

    public void setSegundoPago(float segundoPago) {
        this.segundoPago = segundoPago;
    }

    public float getPagototal() {
        return pagototal;
    }

    public void setPagototal(float pagototal) {
        this.pagototal = pagototal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCampo() {
        return nombreCampo;
    }

    public void setNombreCampo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }

    public String getNombreCancha() {
        return nombreCancha;
    }

    public void setNombreCancha(String nombreCancha) {
        this.nombreCancha = nombreCancha;
    }

      public void setEstadoPagoPendiendte() {
        this.estado = pagoPendiente;
    }
    
    public void setEstadoPagoLiquidado() {
        this.estado = pagoLiquidado;
    }
    
    public void setEstadoConsumida() {
        this.estado = consumida;
    } 
    
    public void setEstadoCancelada() {
        this.estado = cancelada;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
    
   

    
     public Object[] RegistroReserva(int numeracion) {
        Object[] fila = {numeracion,idReserva ,idCliente, idCampo,idCancha,fechaReserva,horaInicio,horaFin,duracion,primerPago,segundoPago,pagototal,estado};
        return fila;
    }
    
    
    
    
    
    
}
