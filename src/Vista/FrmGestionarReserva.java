
package Vista;

import Controlador.Ctrl_CampoDeportivo;
import Controlador.Ctrl_Cliente;
import Controlador.Ctrl_Campo_Cancha;
import Controlador.Ctrl_Cancha;
import Controlador.Ctrl_GestionarReserva;
import Controlador.Ctrl_Reserva;
import Controlador.VentaPDF;
import Formatos.Mensajes;
import Modelo.CampoDeportivo;
import Modelo.Cliente;
import Modelo.Cancha;
import Modelo.Reserva;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FrmGestionarReserva extends javax.swing.JInternalFrame {

     
    Cliente cli = new Cliente();
     Ctrl_Cliente controlcli = new Ctrl_Cliente();
     
     
     CampoDeportivo cpd = new CampoDeportivo();
     Ctrl_CampoDeportivo controlcpd = new Ctrl_CampoDeportivo();
     
     Cancha depor= new Cancha();
     Ctrl_Cancha controldepor=new Ctrl_Cancha();
     
     
     Ctrl_Campo_Cancha relacion= new Ctrl_Campo_Cancha();
     
      Reserva rsa = new Reserva();
     Ctrl_Reserva controlrsa= new Ctrl_Reserva();
     
     
     FrmReserva frmres= new FrmReserva();
      Ctrl_GestionarReserva controlGesReser= new Ctrl_GestionarReserva();
    public FrmGestionarReserva() {

        initComponents();
         MostrarDatos2();
        txtEstado.setEnabled(false);
        txtIdG.setEnabled(false);
        txtNombreCliente.setEnabled(false);
        txtEstadoG.setEnabled(false);
        this.setTitle("Nueva Reserva");
   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGestionarReserva = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtEstado = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtIdG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtEstadoG = new javax.swing.JTextField();
        cbxEstadoG = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(142, 193, 204));
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

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 1020, 310));

        jPanel1.setBackground(new java.awt.Color(231, 231, 231));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEstado.setBorder(null);
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 180, 30));

        txtNombreCliente.setBorder(null);
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 180, 30));

        txtIdG.setBorder(null);
        txtIdG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdGActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 180, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID RESERVA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRE CLIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ESTADO RESERVA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 20));

        btnBuscar.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 150, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 80));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel39.setForeground(new java.awt.Color(0, 51, 102));
        jLabel39.setText("3: Reserva Consumida");

        jLabel40.setForeground(new java.awt.Color(0, 0, 51));
        jLabel40.setText("4: Reserva Liquidada");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 180, 70));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 1040, 140));

        jPanel2.setBackground(new java.awt.Color(214, 214, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEstadoG.setBorder(null);
        jPanel2.add(txtEstadoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 170, 30));

        cbxEstadoG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "3", "4" }));
        cbxEstadoG.setBorder(null);
        cbxEstadoG.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEstadoGItemStateChanged(evt);
            }
        });
        jPanel2.add(cbxEstadoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 180, 30));

        btnActualizar.setBackground(new java.awt.Color(153, 153, 255));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gestion (2).png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 150, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 90));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Actualizar Estado");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Nombre Estado");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, -4, -1, 30));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 1040, 90));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1034, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 1040, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed


       
        int id = Mensajes.M2("Ingrese el id de la reserva a buscar...");
        rsa=controlGesReser.ConsultarReserva(id);
        
           if(rsa==null){
               Mensajes.M1("El Id "+id+" no existe en la tabla...");
           }else{
               txtIdG.setText(String.valueOf(id));
               txtEstado.setText(String.valueOf(rsa.getEstado()));
               txtNombreCliente.setText(rsa.getNombreCliente());
           }




    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbxEstadoGItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEstadoGItemStateChanged
        
        if(cbxEstadoG.getSelectedIndex()==0){
            txtEstadoG.setText("");
        }else{
        if(cbxEstadoG.getSelectedItem()=="3"){
            txtEstadoG.setText(" Consumida ");
             
        }else {
            txtEstadoG.setText(" Cancelada ");
        }
        }

    }//GEN-LAST:event_cbxEstadoGItemStateChanged

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
            if(txtEstadoG.getText().equalsIgnoreCase("")){
                Mensajes.M1("ELIGE CORRECTAMENTE");
            }else{
            if(txtEstadoG.getText().equalsIgnoreCase("Consumida")){
            rsa.setEstadoConsumida();
            
        }else {
           rsa.setEstadoCancelada();
        }
          rsa.setIdReserva(Integer.parseInt(txtIdG.getText()));
          controlGesReser.ActualizarReserva(rsa);
            MostrarDatos2();
            }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtIdGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdGActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    

    
     public void MostrarDatos2(){
     Connection con = Conexion.conectar();
        Statement st;
        
    
        
     String[] titulos={"Nro","ID Reserva","ID Cliente ","ID Campo","ID Cancha","Fecha","Hora Inicio","Hora Fin","Duración","1° Pago","2° Pago","Pago Total","Estado"};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     tblGestionarReserva.setModel(modelo);
        String sql = "select idReserva,idCliente,idCampo,idCancha,fecha,horaInicio,horaFin,duracion,primerPago,segundoPago,pagototal,estado from tb_reserva where estado in ('1','2');";
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    public javax.swing.JComboBox<String> cbxEstadoG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tblGestionarReserva;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtEstadoG;
    public javax.swing.JTextField txtIdG;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables


  


 
   
}