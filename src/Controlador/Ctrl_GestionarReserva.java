
package Controlador;
import Formatos.Mensajes;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Reserva;
import java.sql.PreparedStatement;


public class Ctrl_GestionarReserva {
    
     public Reserva ConsultarReserva(int idReserva) {
    Reserva rsa = null;
    Connection con = Conexion.conectar();
    Statement st;
    String sql = "SELECT c.nombre AS nombreCliente, r.estado AS estadoReserva\n" +
                "FROM tb_reserva r\n" +
                "JOIN tb_cliente c ON r.idCliente = c.idCliente\n" +
                "WHERE r.idReserva = " + idReserva + ";";

    try {
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        if (rs.next()) {
            rsa = new Reserva();
            rsa.setNombreCliente(rs.getString(1));
            rsa.setEstado(rs.getInt(2));
            
            
            
            
    }
         rs.close();
     }catch(Exception e){
         Mensajes.M1("ERROR no se puede consultar el registro ..."+e);
     }
     return rsa;
 }
    
     
 public void ActualizarReserva(Reserva rsa){
     Connection cn = conexion.Conexion.conectar();
     try{
        PreparedStatement ps = cn.prepareStatement("update tb_reserva set estado=? where idReserva=?;");
        
        
         ps.setInt(1,rsa.getEstado());
         ps.setInt(2,rsa.getIdReserva());
         ps.executeUpdate();
         Mensajes.M1("Registro actualizado correctamente...");
         ps.close();
     }catch(Exception  ex){
         Mensajes.M1("ERROR no se puede actualizar el registro..."+ex);
     }
 
 }  
  
 
 
 
}
