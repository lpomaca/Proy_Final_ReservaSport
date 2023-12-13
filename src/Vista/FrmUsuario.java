
package Vista;
import Controlador.Ctrl_Usuario;
import Formatos.Mensajes;
import Modelo.Usuario;
import javax.swing.JOptionPane;
import Formatos.Mensajes;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class FrmUsuario extends javax.swing.JInternalFrame{
    
    Usuario usu = new Usuario();
    Ctrl_Usuario controlUsu = new Ctrl_Usuario();

    public FrmUsuario() {
        
        initComponents();
        this.setTitle("USUARIOS");
        jtxtIdusuario.setEnabled(false);
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
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnConsultar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jbtnActualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jtxtIdusuario = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtPassword = new javax.swing.JTextField();
        jtxtAlias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jlblCantidadregistros = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(225, 224, 224));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/flecha-de-carga.png"))); // NOI18N
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 70, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anadir.png"))); // NOI18N
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 70, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consulta.png"))); // NOI18N
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 70, -1));

        jbtnRegistrar.setBackground(new java.awt.Color(153, 118, 189));
        jbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setText("REGISTRAR");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 40));

        jbtnConsultar.setBackground(new java.awt.Color(153, 118, 189));
        jbtnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConsultar.setText("CONSULTAR");
        jbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 40));

        jbtnEliminar.setBackground(new java.awt.Color(59, 35, 139));
        jbtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 160, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OIG.oBYJ2axClPIGxJL (2).jpg"))); // NOI18N
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jbtnActualizar.setBackground(new java.awt.Color(59, 35, 139));
        jbtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setText("ACTUALIZAR");
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/basura (4).png"))); // NOI18N
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 70, -1));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 590));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 610));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 400, 630));

        jPanel5.setBackground(new java.awt.Color(230, 228, 228));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO USUARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtIdusuario.setBorder(null);
        jtxtIdusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdusuarioActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtIdusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 180, 30));

        jtxtTelefono.setBorder(null);
        jPanel8.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 180, 30));

        jtxtNombre.setBorder(null);
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 230, 30));

        jtxtPassword.setBorder(null);
        jtxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPasswordActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 180, 30));

        jtxtAlias.setBorder(null);
        jPanel8.add(jtxtAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 180, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("TELEFONO");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("PASSWORD");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("USUARIO");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("NOMBRE");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel15.setText("jLabel10");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 200, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 19.png"))); // NOI18N
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 200, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel12.setText("jLabel10");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, -1));

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 920, 250));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE USUARIOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jtblDatos.setBackground(new java.awt.Color(204, 204, 255));
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

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 870, 180));

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 930, 250));

        jlblCantidadregistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblCantidadregistros.setText("Cantidad de Registros :");
        jPanel5.add(jlblCantidadregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/basura (4).png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 70, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 950, 610));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPasswordActionPerformed

    private void jtxtIdusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdusuarioActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed

        if (jtxtNombre.getText().isEmpty() || jtxtAlias.getText().isEmpty() || jtxtPassword.getText().isEmpty()
                || jtxtTelefono.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {
            //validamos si el usuaro ya esta registrado
            
            if (!controlUsu.existeUsuario((jtxtAlias.getText().trim()))) {
                //enviamos datos del usuario
                
                usu.setAlias(jtxtAlias.getText().trim());
                usu.setPassword(jtxtPassword.getText().trim());
                usu.setNombre(jtxtNombre.getText().trim());
                usu.setTelefono(Integer.parseInt(jtxtTelefono.getText().trim()));

                if (controlUsu.guardar(usu)) {
                    JOptionPane.showMessageDialog(null, "¡Usuario Registrado!");
                    MostrarDatos();

                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar usuario!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya esta registrado, ingrese otro.");
            }
        }
        Limpiar();


    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarActionPerformed

            
            
             int idusu = Mensajes.M2("Ingrese el ID del usuario a buscar...");
            usu=controlUsu.ConsultarRegistro(idusu);
            
            if(usu==null){
                 Mensajes.M1("El id "+idusu+" no existe en la tabla...");
            }else{ 
               
               jtxtIdusuario.setText(Integer.toString(usu.getIdUsuario()));
               jtxtAlias.setText(usu.getAlias());
               jtxtPassword.setText(usu.getPassword());
               jtxtNombre.setText(usu.getNombre());
               jtxtTelefono.setText(Integer.toString(usu.getTelefono()));      
               
               
                jbtnRegistrar.setEnabled(false);
                jbtnConsultar.setEnabled(false);
                jbtnActualizar.setEnabled(true);
                jbtnEliminar.setEnabled(true);
               
               //ProcesosFrmCampoDeportivo.Estado2(this);
               
           }
            
    }//GEN-LAST:event_jbtnConsultarActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed


            usu.setAlias(jtxtAlias.getText());
            usu.setPassword(jtxtPassword.getText());
            usu.setNombre(jtxtNombre.getText());
            usu.setTelefono(Integer.parseInt(jtxtTelefono.getText()));
            

            usu.setIdUsuario(Integer.parseInt(jtxtIdusuario.getText()));
            controlUsu.ActualizarRegistro(usu);
            MostrarDatos();
            Limpiar();
            jbtnRegistrar.setEnabled(true);
            jbtnConsultar.setEnabled(true);
            jbtnActualizar.setEnabled(false);
            jbtnEliminar.setEnabled(false);



    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed

            int respuesta = Mensajes.M3("URGENTE!!!!","¿Desea eliminar este dato O.O ?");
            if(respuesta==0){
            int idusuario = Integer.parseInt(jtxtIdusuario.getText());
               
               controlUsu.EliminarRegistro(idusuario);
               MostrarDatos();
               Limpiar();
               jbtnRegistrar.setEnabled(true);
               jbtnConsultar.setEnabled(true);
               jbtnActualizar.setEnabled(false);
               jbtnEliminar.setEnabled(false);
           }



    }//GEN-LAST:event_jbtnEliminarActionPerformed

        public void MostrarDatos(){
     Connection con = Conexion.conectar();
        Statement st;
     String[] titulos={"Nro","ID ","Alias","Password","Nombre ","Telefono"};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     jtblDatos.setModel(modelo);
     String sql = "select idUsuario,alias,password,nombre,telefono,indicador from tb_usuario where indicador='S';";
     Usuario usu =  new Usuario();
     int contador=0;
     try{
         st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             contador++;
             usu.setIdUsuario(rs.getInt(1));
             usu.setAlias(rs.getString(2));
             usu.setPassword(rs.getString(3));
             usu.setNombre(rs.getString(4));
             usu.setTelefono(rs.getInt(5)); 
             usu.setIndicador(rs.getString(6));
             modelo.addRow(usu.RegistroUsuario(contador));
         }//fin while
        
         jlblCantidadregistros.setText("Cantidad de Registros  : "+contador);
         con.close();         
     }catch(Exception e){
         Mensajes.M1("ERROR no se pueden mostrar los usuarios ...."+e);
     }
 }  
    
    
 public  void Limpiar(){
   jtxtIdusuario.setText("");
   jtxtAlias.setText("");
   jtxtNombre.setText("");
    jtxtTelefono.setText("");
   jtxtPassword.setText("");
    jtxtAlias.requestFocus();
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jbtnActualizar;
    public javax.swing.JButton jbtnConsultar;
    public javax.swing.JButton jbtnEliminar;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JLabel jlblCantidadregistros;
    public javax.swing.JTable jtblDatos;
    public javax.swing.JTextField jtxtAlias;
    public javax.swing.JTextField jtxtIdusuario;
    public javax.swing.JTextField jtxtNombre;
    public javax.swing.JTextField jtxtPassword;
    public javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
