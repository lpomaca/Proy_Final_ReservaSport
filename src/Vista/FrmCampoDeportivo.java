
package Vista;
import Controlador.Ctrl_CampoDeportivo;
import Formatos.Mensajes;
import Modelo.CampoDeportivo;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCampoDeportivo extends javax.swing.JInternalFrame {
        
    CampoDeportivo cpd = new CampoDeportivo();
     Ctrl_CampoDeportivo controlcpd = new Ctrl_CampoDeportivo();

    public FrmCampoDeportivo() {
        initComponents();
        this.setTitle("Campos deportivos");
        jtxtIdcampo.setEnabled(false);
        jtxtEstado.setEnabled(false);
        jbtnRegistrar.setEnabled(true);
        jbtnConsultar.setEnabled(true);
        jbtnActualizar.setEnabled(false);
        jbtnEliminar.setEnabled(false);
        MostrarDatos();
 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbtnConsultar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnActualizar = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jtxtIdcampo = new javax.swing.JTextField();
        jtxtUbicacion = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtEstado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
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

        jPanel2.setBackground(new java.awt.Color(181, 134, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(236, 236, 236));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnConsultar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConsultar.setText("CONSULTAR");
        jbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, -1));

        jbtnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 160, 40));

        jbtnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setText("ACTUALIZAR");
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 160, 40));

        jbtnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setText("REGISTRAR");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anadir.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 70, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consulta.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 70, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/flecha-de-carga.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 70, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/basura (4).png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/20200828-FOT-visita-nuevo-campo-futbol-pradillo-(2).jpg"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 290, 250));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 610));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 370, 630));

        jPanel5.setBackground(new java.awt.Color(229, 222, 222));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(81, 108, 163));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO CAMPO DEPORTIVO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(241, 238, 238));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtIdcampo.setBorder(null);
        jtxtIdcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdcampoActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtIdcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 230, 20));

        jtxtUbicacion.setBorder(null);
        jtxtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUbicacionActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 230, 20));

        jtxtNombre.setBorder(null);
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 470, 30));

        jtxtEstado.setBorder(null);
        jPanel8.add(jtxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 230, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 19.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 18.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 500, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRE");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ESTADO");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("UBICACION");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 19.png"))); // NOI18N
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 19.png"))); // NOI18N
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 260, 60));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(null);

        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("3: ELIMINADO");
        jPanel10.add(jLabel14);
        jLabel14.setBounds(10, 50, 89, 16);

        jLabel20.setForeground(new java.awt.Color(0, 0, 51));
        jLabel20.setText("2: MANTENIMIENTO");
        jPanel10.add(jLabel20);
        jLabel20.setBounds(10, 30, 120, 16);

        jLabel19.setForeground(new java.awt.Color(0, 51, 102));
        jLabel19.setText("1: DISPONIBLE");
        jPanel10.add(jLabel19);
        jLabel19.setBounds(10, 10, 91, 16);

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 140, 70));

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 920, 250));

        jPanel1.setBackground(new java.awt.Color(62, 85, 154));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE CAMPOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(235, 235, 235));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

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

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 870, 180));

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 920, 250));

        jlblCantidadregistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblCantidadregistros.setText("Cantidad de Registros :");
        jPanel5.add(jlblCantidadregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 610));

        jPanel7.setBackground(new java.awt.Color(0, 51, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed

    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtIdcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdcampoActionPerformed
    }//GEN-LAST:event_jtxtIdcampoActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed

       
            if (jtxtNombre.getText().isEmpty() || jtxtUbicacion.getText().isEmpty()  ) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {
            //validamos si el usuaro ya esta registrado
           
            if (!controlcpd.existeCampo(jtxtNombre.getText().trim())) {
                //enviamos datos del usuario
                cpd.setNombre(jtxtNombre.getText());
                cpd.setUbicacion(jtxtUbicacion.getText().trim());
                
                
                if (controlcpd.registrarCampo(cpd)) {
                    JOptionPane.showMessageDialog(null, "¡Campo Registrado!");
                                        this.MostrarDatos();

                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar Campo!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo ya esta registrado, ingrese otro.");
            }
        }
        Limpiar();

        

    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarActionPerformed
                
        
        
        jtxtEstado.setEnabled(true);
        int idcampo = Mensajes.M2("Ingrese el ID del campo a buscar...");
        cpd=controlcpd.ConsultarIDCampo(idcampo);
        
           if(cpd==null){
               Mensajes.M1("El id "+idcampo+" no existe en la tabla...");
           }else{
               jtxtIdcampo.setText(Integer.toString(cpd.getIdCampo()));
               jtxtNombre.setText(cpd.getNombre());
               jtxtUbicacion.setText(cpd.getUbicacion());
               
               if((cpd.getEstado())==1){
               jtxtEstado.setText("Disponible");
               }else if(cpd.getEstado()==2){
               jtxtEstado.setText("Mantenimiento");
               }
               
               
                jbtnRegistrar.setEnabled(false);
                jbtnConsultar.setEnabled(false);
                jbtnActualizar.setEnabled(true);
                jbtnEliminar.setEnabled(true);
               
            
           }
        

    }//GEN-LAST:event_jbtnConsultarActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed
            
            
            
            cpd.setNombre(jtxtNombre.getText());
            cpd.setUbicacion(jtxtUbicacion.getText().trim());
            
        switch (Integer.parseInt((jtxtEstado).getText())) {
            case 1:
                cpd.setEstadoDisponible();
                break;
            case 2:
                cpd.setEstadoMantenimiento();
                break;
            default:
                Mensajes.M1("Error en el campo estado");
                break;
        }
            
            cpd.setIdCampo(Integer.parseInt(jtxtIdcampo.getText()));
            controlcpd.ActualizarCampo(cpd);
            MostrarDatos();
            Limpiar();
            jbtnRegistrar.setEnabled(true);
            jbtnConsultar.setEnabled(true);
            jbtnActualizar.setEnabled(false);
            jbtnEliminar.setEnabled(false);
            jtxtEstado.setEnabled(false);
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
             
            
            Ctrl_CampoDeportivo controlcampodeportivo = new Ctrl_CampoDeportivo();
            
            int respuesta = Mensajes.M3("URGENTE!!!!","¿Desea eliminar este dato O.O ?");
            if(respuesta==0){
            int idcampo = Integer.parseInt(jtxtIdcampo.getText());
               
               controlcampodeportivo.EliminarCampo(cpd,idcampo);
               MostrarDatos();
               Limpiar();
               jbtnRegistrar.setEnabled(true);
               jbtnConsultar.setEnabled(true);
               jbtnActualizar.setEnabled(false);
               jbtnEliminar.setEnabled(false);
               jtxtEstado.setEnabled(false);
           }
       

    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jtxtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUbicacionActionPerformed

    

        public void MostrarDatos(){
     Connection con = Conexion.conectar();
        Statement st;
     String[] titulos={"Nro","ID ","Nombre ","ubicacion","Estado"};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     jtblDatos.setModel(modelo);
        String sql = "select * from tb_campodeportivo where estado in ('1','2'); ";
     CampoDeportivo cpd =  new CampoDeportivo();
     int cantreg=0;
     try{
         st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             cantreg++;
             cpd.setIdCampo(rs.getInt(1));
             cpd.setNombre(rs.getString(2));
             cpd.setUbicacion(rs.getString(3));
             cpd.setEstado(rs.getInt(4));
             modelo.addRow(cpd.RegistroCampoDeportivo(cantreg));
         }//fin while
        
         jlblCantidadregistros.setText("Cantidad de Registros  : "+cantreg);
         con.close();         
     }catch(Exception e){
         Mensajes.M1("ERROR no se pueden mostrar los campos ...."+e);
     }
 }  
    
    
 public  void Limpiar(){
   jtxtIdcampo.setText("");
   jtxtNombre.setText("");
    jtxtUbicacion.setText("");
    jtxtEstado.setText("");
    jtxtNombre.requestFocus();
}
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    public javax.swing.JButton jbtnEliminar;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JLabel jlblCantidadregistros;
    public javax.swing.JTable jtblDatos;
    public javax.swing.JTextField jtxtEstado;
    public javax.swing.JTextField jtxtIdcampo;
    public javax.swing.JTextField jtxtNombre;
    public javax.swing.JTextField jtxtUbicacion;
    // End of variables declaration//GEN-END:variables
}
