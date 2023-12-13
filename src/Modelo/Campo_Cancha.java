package Modelo;

public class Campo_Cancha {
    private int idCampoCancha;
    private int idCampo;
    private int idCancha;
    private CampoDeportivo cpd;  // Referencia al campo deportivo
    private Cancha can;  // Referencia al deporte

    

    public Campo_Cancha() {
    }

    public int getIdCampoCancha() {
        return idCampoCancha;
    }

    public void setIdCampoCancha(int idCampoCancha) {
        this.idCampoCancha = idCampoCancha;
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

    public CampoDeportivo getCampoDeportivo() {
        return cpd;
    }

    public void setCampoDeportivo(CampoDeportivo cpd) {
        this.cpd = cpd;
    }

    public Cancha getCancha() {
        return can;
    }

    public void getCancha(Cancha can) {
        this.can = can;
    }
    
    public Object[] RegistroRelacion(int numeracion) {
        Object[] fila = {numeracion,idCampoCancha ,idCampo, idCancha};
        return fila;
    }
}

