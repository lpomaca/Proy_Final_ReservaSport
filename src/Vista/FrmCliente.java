
package Vista;

import Controlador.Ctrl_Cliente;
import Formatos.Mensajes;
import Modelo.Cliente;
import javax.swing.JOptionPane;
import Formatos.Mensajes;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class FrmCliente extends javax.swing.JInternalFrame{
    
     Cliente cli = new Cliente();
     Ctrl_Cliente controlcli = new Ctrl_Cliente();

    public FrmCliente() {
        initComponents();
        this.setTitle("CLIENTES");
        jtxtIdcliente.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jtxtIdcliente = new javax.swing.JTextField();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtDNI = new javax.swing.JTextField();
        jtxtEstado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnConsultar.setBackground(new java.awt.Color(19, 73, 128));
        jbtnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConsultar.setText("CONSULTAR");
        jbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 160, 30));

        jbtnEliminar.setBackground(new java.awt.Color(0, 102, 102));
        jbtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 40));

        jbtnActualizar.setBackground(new java.awt.Color(0, 102, 102));
        jbtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setText("ACTUALIZAR");
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, 40));

        jbtnRegistrar.setBackground(new java.awt.Color(19, 73, 128));
        jbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setText("REGISTRAR");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cliente-leal.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/basura (4).png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 70, -1));

        jPanel9.setBackground(new java.awt.Color(234, 234, 234));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/flecha-de-carga.png"))); // NOI18N
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 70, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anadir.png"))); // NOI18N
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 70, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consulta.png"))); // NOI18N
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 70, -1));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 590));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 610));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 400, 630));

        jPanel5.setBackground(new java.awt.Color(233, 233, 242));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(222, 222, 222));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtIdcliente.setBorder(null);
        jtxtIdcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdclienteActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtIdcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 30));

        jtxtDireccion.setBorder(null);
        jPanel8.add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 230, 30));

        jtxtTelefono.setBorder(null);
        jtxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTelefonoActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 30));

        jtxtNombre.setBorder(null);
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 220, 30));

        jtxtDNI.setBorder(null);
        jPanel8.add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 230, 30));

        jtxtEstado.setBorder(null);
        jtxtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEstadoActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 180, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 200, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 19.png"))); // NOI18N
        jLabel17.setText("jLabel16");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 250, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 19.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 250, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 19.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 250, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 19.png"))); // NOI18N
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel18.setText("jLabel15");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("TELEFONO");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("DIRECCION");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("DNI");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("NOMBRE");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("ESTADO");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 920, 250));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE CLIENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 870, 180));

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 920, 250));

        jlblCantidadregistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblCantidadregistros.setText("Cantidad de Registros :");
        jPanel5.add(jlblCantidadregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 610));

        jPanel7.setBackground(new java.awt.Color(0, 0, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtIdclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdclienteActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
       
        if (jtxtNombre.getText().isEmpty() || jtxtDNI.getText().isEmpty() || jtxtDireccion.getText().isEmpty()
                || jtxtTelefono.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {
            //validamos si el usuaro ya esta registrado
            
            if (!controlcli.existeCliente(Integer.parseInt(jtxtDNI.getText().trim()))) {
                //enviamos datos del usuario
                cli.setDNI(Integer.parseInt(jtxtDNI.getText().trim()));
                cli.setNombre(jtxtNombre.getText());
                cli.setTelefono(jtxtTelefono.getText().trim());
                cli.setDireccion(jtxtDireccion.getText().trim());
                
                
                if (controlcli.registrarCliente(cli)) {
                    JOptionPane.showMessageDialog(null, "¡Cliente Registrado!");
                    MostrarDatos();

                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar cliente!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El cliente ya esta registrado.");
            }
        }
        Limpiar();

        
        
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarActionPerformed
         
       
        jtxtEstado.setEnabled(true);
        int DNI = Mensajes.M2("Ingrese el DNI del cliente a buscar...");
        cli=controlcli.ConsultarCliente(DNI);
        
           if(cli==null){
               Mensajes.M1("El DNI "+DNI+" no existe en la tabla...");
           }else{
               jtxtIdcliente.setText(Integer.toString(cli.getIdCliente()));
               jtxtDNI.setText(Integer.toString(cli.getDNI()));
               jtxtNombre.setText(cli.getNombre());
               jtxtTelefono.setText(cli.getTelefono());
               jtxtDireccion.setText(cli.getDireccion());
               
               if((cli.getEstado())==1){
               jtxtEstado.setText("Registrado");
               }else if(cli.getEstado()==2){
               jtxtEstado.setText("Inhabilitado");
               }
                jbtnRegistrar.setEnabled(false);
                jbtnConsultar.setEnabled(false);
                jbtnActualizar.setEnabled(true);
                jbtnEliminar.setEnabled(true);
               
               //ProcesosFrmCampoDeportivo.Estado2(this);
               
           }
        


    }//GEN-LAST:event_jbtnConsultarActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed

         
            cli.setDNI(Integer.parseInt(jtxtDNI.getText()));
            cli.setNombre(jtxtNombre.getText());
            cli.setTelefono(jtxtTelefono.getText());
            cli.setDireccion(jtxtDireccion.getText());
            
          
            switch (Integer.parseInt((jtxtEstado).getText())) {
            case 1:
                cli.setEstadoRegistrado();
                break;
            case 2:
                cli.setEstadoInhabilitado();
                break;
            default:
                Mensajes.M1("Error en el campo estado");
                break;
        }
            cli.setIdCliente(Integer.parseInt(jtxtIdcliente.getText()));
            controlcli.ActualizarCliente(cli);
            MostrarDatos();
            Limpiar();
            jbtnRegistrar.setEnabled(true);
            jbtnConsultar.setEnabled(true);
            jbtnActualizar.setEnabled(false);
            jbtnEliminar.setEnabled(false);
            jtxtEstado.setEnabled(false);

    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed


           
            
            int respuesta = Mensajes.M3("URGENTE!!!!","¿Desea eliminar este dato O.O ?");
            if(respuesta==0){
            int idcliente = Integer.parseInt(jtxtIdcliente.getText());
               
               controlcli.eliminarCliente(cli,idcliente);
               MostrarDatos();
               Limpiar();
               jbtnRegistrar.setEnabled(true);
               jbtnConsultar.setEnabled(true);
               jbtnActualizar.setEnabled(false);
               jbtnEliminar.setEnabled(false);
           }
       

    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jtxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTelefonoActionPerformed

    private void jtxtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEstadoActionPerformed


        public void MostrarDatos(){
     Connection con = Conexion.conectar();
        Statement st;
     String[] titulos={"Nro","ID ","DNI","Nombre ","Telefono","Direccion","Estado"};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     jtblDatos.setModel(modelo);
     String sql = "select * from tb_cliente where estado in ('1','2'); ";
     Cliente cli =  new Cliente();
     int cantreg=0;
     try{
         st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             cantreg++;
             cli.setIdCliente(rs.getInt(1));
             cli.setDNI(rs.getInt(2));
             cli.setNombre(rs.getString(3));
             cli.setTelefono(rs.getString(4));
             cli.setDireccion(rs.getString(5));    
             cli.setEstado(rs.getInt(6));
             modelo.addRow(cli.RgistroCliente(cantreg));
         }//fin while
        
         jlblCantidadregistros.setText("Cantidad de Registros  : "+cantreg);
         con.close();         
     }catch(Exception e){
         Mensajes.M1("ERROR no se pueden mostrar los clientes ...."+e);
     }
 }  
    
    
 public  void Limpiar(){
   jtxtIdcliente.setText("");
   jtxtDNI.setText("");
   jtxtNombre.setText("");
    jtxtTelefono.setText("");
   jtxtDireccion.setText("");
   jtxtEstado.setText("");
    jtxtDNI.requestFocus();
}
    
 
 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    public javax.swing.JTextField jtxtDNI;
    public javax.swing.JTextField jtxtDireccion;
    public javax.swing.JTextField jtxtEstado;
    public javax.swing.JTextField jtxtIdcliente;
    public javax.swing.JTextField jtxtNombre;
    public javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
