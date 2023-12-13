package Modelo;

public class Cancha {

    private int idCancha;
    private String descripcion;
     private float precioMinuto;
     private int estado;
     
      public static final int noREGISTRADO = 0;
    public static final int disponible = 1;
    public static final int mantenimiento = 2;
    
     
    public Cancha() {
        this.estado = noREGISTRADO; 
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idDeporte) {
        this.idCancha = idDeporte;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioMinuto() {
        return precioMinuto;
    }

    public void setPrecioMinuto(float precioMinuto) {
        this.precioMinuto = precioMinuto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

   public void setEstadoDisponible() {
        this.estado = disponible;
    }
    
    public void setEstadoMantenimiento() {
        this.estado = mantenimiento;
    }
    
   

 
 
    
    
     public Object[] RegistroDeporte(int numeracion) {
        Object[] fila = {numeracion,idCancha , descripcion,precioMinuto,estado};
        return fila;
    }

}
