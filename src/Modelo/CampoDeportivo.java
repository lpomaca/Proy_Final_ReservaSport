package Modelo;


public class CampoDeportivo {

    private int idCampo;
    private String nombre;
    private String ubicacion;
     private int estado;
     
     public static final int noREGISTRADO = 0;
    public static final int disponible = 1;
    public static final int mantenimiento = 2;
    public static final int eliminado = 3;
    

    public CampoDeportivo() {
        this.estado = noREGISTRADO; 
    }

    public int getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEstadoDisponible() {
        this.estado = disponible;
    }
    
    public void setEstadoMantenimiento() {
        this.estado = mantenimiento;
    }
    
    public void setEstadoEliminado() {
        this.estado = eliminado;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public Object[] RegistroCampoDeportivo(int numeracion) {
        Object[] fila = {numeracion, idCampo, nombre, ubicacion,estado};
        return fila;
    }
    }

