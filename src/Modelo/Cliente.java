package Modelo;


public class Cliente {

   
    private int idCliente;
    private int DNI;
    private String nombre;
    private String telefono;
    private String direccion;
    private int estado;
    
    
    public static final int noREGISTRADO = 0;
    public static final int registrado = 1;
    public static final int inhabilitado = 2;
    public static final int eliminado = 3;
    
      public Cliente() {
        this.estado = noREGISTRADO; 
    }
  
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    

    
    public void setEstadoRegistrado() {
        this.estado = registrado;
    }
    
    public void setEstadoInhabilitado() {
        this.estado = inhabilitado;
    }
    
    public void setEstadoEliminado() {
        this.estado = eliminado;
    }
    
     public Object[] RgistroCliente(int numeracion){
        Object[] fila={numeracion,idCliente,DNI,nombre,telefono,direccion,estado};
        return fila;
    }
    

}
