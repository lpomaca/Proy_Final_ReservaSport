
package Vista;
import Controlador.Ctrl_Cancha;
import Formatos.Mensajes;
import Modelo.Cancha;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCancha extends javax.swing.JInternalFrame {
    
    Cancha can = new Cancha();
    Ctrl_Cancha controlcan = new Ctrl_Cancha();

    public FrmCancha() {
        initComponents();
        this.setTitle("Deporte");
        jtxtIdDeporte.setEnabled(false);
        jtxtEstado.setEnabled(false);
        MostrarDatos();
 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnConsultar = new javax.swing.JButton();
        jbtnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jtxtIdDeporte = new javax.swing.JTextField();
        jtxtDescripcionDeporte = new javax.swing.JTextField();
        jtxtPrecioMinuto = new javax.swing.JTextField();
        jtxtEstado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jlblCantidadregistros = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(225, 223, 223));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setText("REGISTRAR");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 30));

        jbtnConsultar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConsultar.setText("CONSULTAR");
        jbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, 30));

        jbtnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setText("ACTUALIZAR");
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anadir.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 70, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consulta.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/flecha-de-carga.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 70, 90));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 610));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 230, 630));

        jPanel5.setBackground(new java.awt.Color(203, 215, 228));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(103, 131, 175));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO CAMPO DEPORTIVO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(231, 230, 230));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtIdDeporte.setBorder(null);
        jtxtIdDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdDeporteActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtIdDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 170, 30));

        jtxtDescripcionDeporte.setBorder(null);
        jtxtDescripcionDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDescripcionDeporteActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtDescripcionDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 470, 30));

        jtxtPrecioMinuto.setBorder(null);
        jtxtPrecioMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPrecioMinutoActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtPrecioMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 230, 30));

        jtxtEstado.setBorder(null);
        jtxtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEstadoActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("DESCRIPCION");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("ID");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("PRECIO POR MINUTO");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("ESTADO");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 18.png"))); // NOI18N
        jLabel7.setText("jLabel6");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 500, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel10.setText("jLabel7");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 200, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 19.png"))); // NOI18N
        jLabel11.setText("jLabel10");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 250, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel12.setText("jLabel11");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 200, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(null);

        jLabel20.setForeground(new java.awt.Color(0, 0, 51));
        jLabel20.setText("2: MANTENIMIENTO");
        jPanel10.add(jLabel20);
        jLabel20.setBounds(20, 40, 120, 16);

        jLabel19.setForeground(new java.awt.Color(0, 51, 102));
        jLabel19.setText("1: DISPONIBLE");
        jPanel10.add(jLabel19);
        jLabel19.setBounds(20, 20, 91, 16);

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 150, 80));

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 920, 290));

        jPanel1.setBackground(new java.awt.Color(74, 74, 149));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE CAMPOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jtblDatos.setBackground(new java.awt.Color(239, 239, 239));
        jtblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtblDatos);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 870, 200));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 27, 910, 200));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 920, 240));

        jlblCantidadregistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblCantidadregistros.setText("Cantidad de Registros :");
        jPanel5.add(jlblCantidadregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 610));

        jPanel7.setBackground(new java.awt.Color(102, 197, 202));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
            
         if ( jtxtDescripcionDeporte.getText().isEmpty() 
                 || jtxtPrecioMinuto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {
            //validamos si el usuaro ya esta registrado
            
            
            if (!controlcan.existeCancha(jtxtDescripcionDeporte.getText().trim())) {
                //enviamos datos del usuario
                
                can.setDescripcion(jtxtDescripcionDeporte.getText().trim());
                can.setPrecioMinuto(Float.parseFloat(jtxtPrecioMinuto.getText().trim()));
                
                if (controlcan.registrarCancha(can)) {
                    JOptionPane.showMessageDialog(null, "¡Canchita Registrada!");
                                        this.MostrarDatos();

                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar Deporte!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La descripcion ya está registrada, ingrese otro.");
            }
        }
        Limpiar();



    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jtxtIdDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdDeporteActionPerformed

    }//GEN-LAST:event_jtxtIdDeporteActionPerformed

    private void jbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarActionPerformed

        
        jtxtEstado.setEnabled(true);
        int idCan = Mensajes.M2("Ingrese el ID del deporte a buscar...");
        can=controlcan.ConsultarIDCancha(idCan);

        if(can==null){
            Mensajes.M1("El id "+idCan+" no existe en la tabla...");
        }else{
            jtxtIdDeporte.setText(Integer.toString(can.getIdCancha()));
            jtxtDescripcionDeporte.setText(can.getDescripcion());
            jtxtPrecioMinuto.setText(String.valueOf(can.getPrecioMinuto()));
            
        if((can.getEstado())==1){
           jtxtEstado.setText("Disponible");
           }else if(can.getEstado()==2){
           jtxtEstado.setText("Mantenimiento");
           }

            jbtnRegistrar.setEnabled(false);
            jbtnConsultar.setEnabled(false);
            jbtnActualizar.setEnabled(true);
            

           

        }

    }//GEN-LAST:event_jbtnConsultarActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed

        
        
        can.setDescripcion(jtxtDescripcionDeporte.getText().trim());
        can.setPrecioMinuto(Float.parseFloat(jtxtPrecioMinuto.getText().trim()));
        switch (Integer.parseInt((jtxtEstado).getText())) {
            case 1:
                can.setEstadoDisponible();
                break;
            case 2:
                can.setEstadoMantenimiento();
                break;
            default:
                Mensajes.M1("Error en el campo estado");
                break;
        }
        can.setIdCancha(Integer.parseInt(jtxtIdDeporte.getText()));
        controlcan.ActualizarCancha(can);
        MostrarDatos();
        Limpiar();
        jbtnRegistrar.setEnabled(true);
        jbtnConsultar.setEnabled(true);
        jbtnActualizar.setEnabled(false);
        jtxtEstado.setEnabled(false);
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void jtxtPrecioMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPrecioMinutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPrecioMinutoActionPerformed

    private void jtxtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEstadoActionPerformed

    private void jtxtDescripcionDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDescripcionDeporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDescripcionDeporteActionPerformed

    

        public void MostrarDatos(){
     Connection con = Conexion.conectar();
        Statement st;
     String[] titulos={"Nro","ID ","Descripción","Precio por Minuto","Estado"};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     jtblDatos.setModel(modelo);
     String sql = "select * from tb_cancha where estado in ('1','2');";
     Cancha can =  new Cancha();
     int cantreg=0;
     try{
         st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             cantreg++;
             can.setIdCancha(rs.getInt(1));
             can.setDescripcion(rs.getString(2));
             can.setPrecioMinuto(rs.getFloat(3));
             can.setEstado(rs.getInt(4));
            
             modelo.addRow(can.RegistroDeporte(cantreg));
         }//fin while
        
         jlblCantidadregistros.setText("Cantidad de Registros  : "+cantreg);
         con.close();         
     }catch(Exception e){
         Mensajes.M1("ERROR no se pueden mostrar la lista de canchas ...."+e);
     }
 }  
    
    
 public  void Limpiar(){
   jtxtIdDeporte.setText("");
    jtxtDescripcionDeporte.setText("");
    jtxtPrecioMinuto.setText("");
    jtxtEstado.setText("");
    jtxtDescripcionDeporte.requestFocus();
}
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jbtnActualizar;
    public javax.swing.JButton jbtnConsultar;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JLabel jlblCantidadregistros;
    public javax.swing.JTable jtblDatos;
    public javax.swing.JTextField jtxtDescripcionDeporte;
    public javax.swing.JTextField jtxtEstado;
    public javax.swing.JTextField jtxtIdDeporte;
    public javax.swing.JTextField jtxtPrecioMinuto;
    // End of variables declaration//GEN-END:variables
}
