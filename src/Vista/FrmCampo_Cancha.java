
package Vista;

import Controlador.Ctrl_CampoDeportivo;
import Controlador.Ctrl_Campo_Cancha;
import Formatos.Mensajes;
import Modelo.CampoDeportivo;
import Modelo.Campo_Cancha;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCampo_Cancha extends javax.swing.JInternalFrame {
    
      CampoDeportivo cpd = new CampoDeportivo();
     Ctrl_CampoDeportivo controlcpd = new Ctrl_CampoDeportivo();
  
    public FrmCampo_Cancha() {
        initComponents();
        CargarDeporte();
        CargarCampo();
        MostrarDatos();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcbxIdCancha = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jtxtNombreCampo = new javax.swing.JTextField();
        jcbxIdCampo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(218, 223, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbxIdCancha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbxIdCancha.setBorder(null);
        jPanel1.add(jcbxIdCancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 180, 30));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel4.setBackground(new java.awt.Color(107, 145, 182));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombreCampo.setBorder(null);
        jPanel4.add(jtxtNombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 180, 30));

        jcbxIdCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbxIdCampo.setBorder(null);
        jcbxIdCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxIdCampoActionPerformed(evt);
            }
        });
        jPanel4.add(jcbxIdCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Campo");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 500, 120));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENLAZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/campo-de-futbol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 250, 60));

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
        jScrollPane1.setViewportView(jtblDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 490, 230));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 200, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OIG.oBYJ2axClPIGxJL (2).jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 270, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        
            if (jcbxIdCampo.getSelectedItem().equals("-Seleccione-") || jcbxIdCancha.getSelectedItem().equals("-Seleccione-")   ) {
            JOptionPane.showMessageDialog(null, "Slecciona bonito pos mijo");
        } else {
           
                Campo_Cancha relacion = new Campo_Cancha();
                Ctrl_Campo_Cancha controlRelacion = new Ctrl_Campo_Cancha();
            
               
                relacion.setIdCampo(Integer.parseInt(jtxtNombreCampo.getText()));
                relacion.setIdCancha(jcbxIdCancha.getSelectedIndex());
                
                if (controlRelacion.Enlazar(relacion)) {
                    JOptionPane.showMessageDialog(null, "¡Campo Registrado!");
                                        this.MostrarDatos();

                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar Campo!");
                }
                  
            } 
        
                  Limpiar();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbxIdCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxIdCampoActionPerformed

       
           String nombre = (String) jcbxIdCampo.getSelectedItem();
        cpd=controlcpd.ConsultarCampoReserva(nombre);
        
        if(jcbxIdCampo.getSelectedItem()=="---Seleccione el campo---"){
        jtxtNombreCampo.setText("");

        }else if (jcbxIdCampo.getSelectedIndex()>-1){
       
        jtxtNombreCampo.setText(String.valueOf(cpd.getIdCampo()));
        }
    }//GEN-LAST:event_jcbxIdCampoActionPerformed

    
     public  void Limpiar(){
   jcbxIdCancha.setSelectedIndex(0);
   jcbxIdCampo.setSelectedIndex(0);
    
}
    
    
    private void CargarDeporte () {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_cancha where estado='1';";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jcbxIdCancha.removeAllItems();
            jcbxIdCancha.addItem("---Seleccione la cancha---");
            while (rs.next()) {
                jcbxIdCancha.addItem(rs.getString("idCancha" )+ " : "  + rs.getString("descripcion"));
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("¡Error al cargar campos, !" + e);
        }
    }
    
     private void CargarCampo() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_campodeportivo where estado='1';";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jcbxIdCampo.removeAllItems();
            jcbxIdCampo.addItem("---Seleccione el campo---");
            while (rs.next()) {
                jcbxIdCampo.addItem(rs.getString("nombre" ));
                
                
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("¡Error al cargar campos, !" + e);
        }
    }
    
        public void MostrarDatos(){
     Connection con = Conexion.conectar();
        Statement st;
     String[] titulos={"Nro","ID RELACION","ID CAMPO "," ID DEPORTE "};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     jtblDatos.setModel(modelo);
        String sql = "SELECT cdc.idCampoCancha, cdc.idCampo, cdc.idCancha\n" +
                     "FROM tb_campodeportivo_cancha cdc\n" +
                     "JOIN tb_campodeportivo c ON cdc.idCampo = c.idCampo\n" +
                     "JOIN tb_cancha d ON cdc.idCancha = d.idCancha\n" +
                     "WHERE c.estado = 1 AND d.estado = 1;";
     Campo_Cancha relacion =  new Campo_Cancha();
     int cantreg=0;
     try{
         st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             cantreg++;
             relacion.setIdCampoCancha(rs.getInt(1));
             relacion.setIdCampo(rs.getInt(2));
             relacion.setIdCancha(rs.getInt(3));
             
             modelo.addRow(relacion.RegistroRelacion(cantreg));
         }//fin while
        
        
         con.close();         
     }catch(Exception e){
         Mensajes.M1("ERROR no se pueden mostrar las categorias ...."+e);
     }
 }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> jcbxIdCampo;
    public javax.swing.JComboBox<String> jcbxIdCancha;
    public javax.swing.JTable jtblDatos;
    private javax.swing.JTextField jtxtNombreCampo;
    // End of variables declaration//GEN-END:variables
}
