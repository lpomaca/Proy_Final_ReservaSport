    
package Vista;


import Formatos.Mensajes;

import Modelo.Reserva;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;
import java.time.LocalTime;

import javax.swing.table.DefaultTableModel;



public class FrmReservaFinalizada extends javax.swing.JInternalFrame {

     
    
     
      Reserva rsa = new Reserva();
     
     
     
     
    public FrmReservaFinalizada() {

        initComponents();
         MostrarDatos3();
        
        this.setTitle("Nueva Reserva");
   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGestionarReserva = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(190, 222, 229));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGestionarReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblGestionarReserva);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1240, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("RESERVAS FINALIZADAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 360, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
     public void MostrarDatos3(){
     Connection con = Conexion.conectar();
        Statement st;
        
    
        
     String[] titulos={"Nro","ID Reserva","ID Cliente ","ID Campo","ID Cancha","Fecha","Hora Inicio","Hora Fin","Duración","1° Pago","2° Pago","Pago Total","Estado"};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     tblGestionarReserva.setModel(modelo);
        String sql = "select idReserva,idCliente,idCampo,idCancha,fecha,horaInicio,horaFin,duracion,primerPago,segundoPago,pagototal,estado from tb_reserva where estado in ('3','4');";
     Reserva rsa= new Reserva();
     int cantreg=0;
     try{
         st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             cantreg++;
             rsa.setIdReserva(rs.getInt(1));
             rsa.setIdCliente(rs.getInt(2));
             rsa.setIdCampo(rs.getInt(3));
             rsa.setIdCancha(rs.getInt(4));
             
             rsa.setFechaReserva(rs.getDate(5));
             
             LocalTime horaInicio = rs.getTime(6).toLocalTime();
             rsa.setHoraInicio(horaInicio);
             
             
             LocalTime horaFin = rs.getTime(7).toLocalTime();
             rsa.setHoraFin(horaFin);
            
             rsa.setDuracion(rs.getInt(8));
             rsa.setPrimerPago(rs.getFloat(9));
             rsa.setSegundoPago(rs.getFloat(10));
             rsa.setPagototal(rs.getFloat(11));
             rsa.setEstado(rs.getInt(12));

             
             
             modelo.addRow(rsa.RegistroReserva(cantreg));
         }//fin while
        
        
         con.close();         
     }catch(Exception e){
         Mensajes.M1("ERROR no se pueden mostrar la tabla ...."+e);
     }
 }  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tblGestionarReserva;
    // End of variables declaration//GEN-END:variables


  


 
   
}