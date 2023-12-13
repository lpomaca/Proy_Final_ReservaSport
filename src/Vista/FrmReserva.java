
package Vista;

import Controlador.Ctrl_CampoDeportivo;
import Controlador.Ctrl_Cliente;
import Controlador.Ctrl_Campo_Cancha;
import Controlador.Ctrl_Cancha;
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
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FrmReserva extends javax.swing.JInternalFrame {
    Cliente cli = new Cliente();
     Ctrl_Cliente controlcli = new Ctrl_Cliente();
     
     
     CampoDeportivo cpd = new CampoDeportivo();
     Ctrl_CampoDeportivo controlcpd = new Ctrl_CampoDeportivo();
     
     Cancha depor= new Cancha();
     Ctrl_Cancha controldepor=new Ctrl_Cancha();
     
     
     Ctrl_Campo_Cancha relacion= new Ctrl_Campo_Cancha();
     
      Reserva rsa = new Reserva();
     Ctrl_Reserva controlrsa= new Ctrl_Reserva();
     
     DefaultTableModel modelo;
    ArrayList<Reserva> listaReserva = new ArrayList<>();
       float MontoF= 0f;
    public FrmReserva() {
        
        initComponents();
        setModelo();
        this.setTitle("Nueva Reserva");
        CargarComboCampoDeportivo();
        txtCodigoCliente.setEnabled(false);
        txtNombreCliente.setEnabled(false);
        txtCodigoCampo.setEnabled(false);
        txtCodigoDescripcion.setEnabled(false);
        txtPrecioMinutoCampo.setEnabled(false);
        txtDuracion.setEnabled(false);
        txtPagototal.setEnabled(false);
        txtPorcentajeReserva.setEnabled(false);        
        txtPrimerPago.setEnabled(false);
        txtSegundoPago.setEnabled(false);
        txtIdReserva.setText(String.valueOf(controlrsa.id_reserva_auto()));
        txtEstado.setEnabled(false);        
    }

    private void setModelo(){
        
        String[] cabecera={"Nro","ID Reserva","ID Cliente ","ID Campo","ID Cancha","Fecha","Hora Inicio","Hora Fin","Duración","1° Pago","2° Pago","Pago Total","Estado"};
     modelo = new DefaultTableModel(null,cabecera);
     tblReserva.setModel(modelo);
        
        
        
    }
  
    public void listaTablaProductos() {
        this.modelo.setRowCount((listaReserva.size()));
        
        for (int i = 0; i < (listaReserva.size()); i++) {
            this.modelo.setValueAt(i + 1, i, 0);
            this.modelo.setValueAt(listaReserva.get(i).getIdReserva(), i, 1);
            this.modelo.setValueAt(listaReserva.get(i).getNombreCliente(), i, 2);
            this.modelo.setValueAt(listaReserva.get(i).getNombreCampo(), i, 3);
            this.modelo.setValueAt(listaReserva.get(i).getNombreCancha(), i, 4);
            Date fechaReserva = listaReserva.get(i).getFechaReserva();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = sdf.format(fechaReserva);

            this.modelo.setValueAt(fechaFormateada, i, 5);
            
            this.modelo.setValueAt(listaReserva.get(i).getHoraInicio(), i, 6);
            this.modelo.setValueAt(listaReserva.get(i).getHoraFin(), i, 7);
            this.modelo.setValueAt(listaReserva.get(i).getDuracion(), i, 8);
            this.modelo.setValueAt(listaReserva.get(i).getPrimerPago(), i, 9);
            this.modelo.setValueAt(listaReserva.get(i).getSegundoPago(), i, 10);
            this.modelo.setValueAt(listaReserva.get(i).getPagototal(), i, 11);
            this.modelo.setValueAt(listaReserva.get(i).getNombreEstado(), i, 12);
        }
        //añadir al Jtable
        tblReserva.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtDniCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        jButton_busca_cliente = new javax.swing.JButton();
        txtCodigoCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtPrecioMinutoCampo = new javax.swing.JTextField();
        cbxNombreCampo = new javax.swing.JComboBox<>();
        txtCodigoCampo = new javax.swing.JTextField();
        cbxDeportes = new javax.swing.JComboBox<>();
        txtCodigoDescripcion = new javax.swing.JTextField();
        txtPorcentajeReserva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtHoraFin = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        txtHoraInicio = new javax.swing.JTextField();
        txtPagototal = new javax.swing.JTextField();
        txtSegundoPago = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtIdReserva = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel37 = new javax.swing.JLabel();
        txtPrimerPago = new javax.swing.JTextField();
        jdateFecha = new com.toedter.calendar.JDateChooser();
        txtMontoFinal = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox<>();
        txtEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReserva = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(223, 223, 249));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 157, 200));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(235, 235, 235));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDniCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDniCliente.setBorder(null);
        jPanel4.add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 30));

        txtNombreCliente.setBorder(null);
        jPanel4.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 180, 30));

        jButton_busca_cliente.setBackground(new java.awt.Color(0, 0, 0));
        jButton_busca_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_busca_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jButton_busca_cliente.setText("Buscar");
        jButton_busca_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_busca_clienteActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_busca_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 120, 30));

        txtCodigoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoCliente.setBorder(null);
        jPanel4.add(txtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 180, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("DNI");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CODIGO");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel6.setText("jLabel4");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 200, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel8.setText("jLabel4");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 200, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel31.setText("jLabel4");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 230, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 600, 120));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 620, 170));

        jPanel7.setBackground(new java.awt.Color(123, 185, 206));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Campo Deportivo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(228, 228, 228));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecioMinutoCampo.setBorder(null);
        jPanel8.add(txtPrecioMinutoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 180, 30));

        cbxNombreCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxNombreCampo.setBorder(null);
        cbxNombreCampo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNombreCampoItemStateChanged(evt);
            }
        });
        cbxNombreCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNombreCampoActionPerformed(evt);
            }
        });
        jPanel8.add(cbxNombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, 30));

        txtCodigoCampo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoCampo.setBorder(null);
        jPanel8.add(txtCodigoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 90, 40));

        cbxDeportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxDeportes.setBorder(null);
        cbxDeportes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxDeportesItemStateChanged(evt);
            }
        });
        jPanel8.add(cbxDeportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 30));

        txtCodigoDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoDescripcion.setBorder(null);
        jPanel8.add(txtCodigoDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 90, 40));

        txtPorcentajeReserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorcentajeReserva.setText("40%");
        txtPorcentajeReserva.setBorder(null);
        txtPorcentajeReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorcentajeReservaActionPerformed(evt);
            }
        });
        jPanel8.add(txtPorcentajeReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 170, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel5.setText("jLabel4");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Nombre");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Descripcion");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Codigo Campo");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Precio Minuto");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Porcentaje Reserva");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel29.setText("jLabel4");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Codigo Descripcion");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel23.setText("jLabel4");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 200, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jLabel32.setText("jLabel4");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 200, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 590, 200));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 620, 250));

        jPanel5.setBackground(new java.awt.Color(135, 135, 189));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos De Reserva", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(228, 228, 228));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHoraFin.setBorder(null);
        txtHoraFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraFinActionPerformed(evt);
            }
        });
        jPanel6.add(txtHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 90, 40));

        txtDuracion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDuracion.setBorder(null);
        jPanel6.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 90, 40));

        txtHoraInicio.setBorder(null);
        jPanel6.add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 90, 40));

        txtPagototal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPagototal.setBorder(null);
        jPanel6.add(txtPagototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 90, 40));

        txtSegundoPago.setBorder(null);
        jPanel6.add(txtSegundoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 90, 40));

        jPanel2.setBackground(new java.awt.Color(151, 151, 215));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 10, 400));

        jPanel9.setBackground(new java.awt.Color(223, 223, 235));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalcular.setBackground(new java.awt.Color(102, 204, 255));
        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(83, 68, 49));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reserva.png"))); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel9.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 107, 120, 40));

        btnRegistrar.setBackground(new java.awt.Color(51, 204, 255));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(83, 68, 49));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/previous.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel9.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 40));

        btnAgregar.setBackground(new java.awt.Color(115, 209, 209));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel9.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 90, 40));

        btnImprimir.setBackground(new java.awt.Color(0, 204, 255));
        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(83, 68, 49));
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel9.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, 40));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("Código");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 7, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtIdReserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdReserva.setBorder(null);
        jPanel9.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 40));
        jPanel9.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anadir.png"))); // NOI18N
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 60, 40));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 170, 400));

        txtPrimerPago.setBorder(null);
        txtPrimerPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerPagoActionPerformed(evt);
            }
        });
        jPanel6.add(txtPrimerPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 90, 40));

        jdateFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jdateFecha.setDateFormatString("yyyy-MM-dd");
        jPanel6.add(jdateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 80));

        txtMontoFinal.setBorder(null);
        txtMontoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoFinalActionPerformed(evt);
            }
        });
        jPanel6.add(txtMontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 90, 40));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-S-", "1", "2" }));
        cbxEstado.setBorder(null);
        cbxEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEstadoItemStateChanged(evt);
            }
        });
        jPanel6.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 90, 40));
        jPanel6.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 90, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Hora Inicio");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Hora Fin");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Duracion Minutos");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Primer Pago");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Segundo Pago");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Monto Final");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Total");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 21_1.png"))); // NOI18N
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(null);

        jLabel39.setForeground(new java.awt.Color(0, 51, 102));
        jLabel39.setText("1: Pago Pendiente");
        jPanel10.add(jLabel39);
        jLabel39.setBounds(30, 10, 120, 16);

        jLabel40.setForeground(new java.awt.Color(0, 0, 51));
        jLabel40.setText("2: Pago Liquidado");
        jPanel10.add(jLabel40);
        jLabel40.setBounds(30, 30, 120, 16);

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 160, 60));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 670, 400));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 700, 450));

        tblReserva.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblReserva);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 1320, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_busca_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_busca_clienteActionPerformed
        
        int DNI =Integer.parseInt(txtDniCliente.getText().trim());
        cli=controlcli.ConsultarCliente(DNI);
        txtNombreCliente.setText(cli.getNombre());
        txtCodigoCliente.setText(String.valueOf(cli.getIdCliente()));
      
    }//GEN-LAST:event_jButton_busca_clienteActionPerformed

    private void txtPorcentajeReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorcentajeReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcentajeReservaActionPerformed

    private void txtPrimerPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerPagoActionPerformed

    private void txtMontoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoFinalActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        VentaPDF pdf= new VentaPDF();
        pdf.DatosCliente(Integer.parseInt(txtCodigoCliente.getText()));
        pdf.generarFacturaPDF();
         Limpiar();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        Reserva rsa = new Reserva();
        Ctrl_Reserva controlrsa= new Ctrl_Reserva();

        //enviamos datos del usuario
        rsa.setIdReserva(Integer.parseInt(txtIdReserva.getText().trim()));
        rsa.setNombreCliente(txtNombreCliente.getText());

        rsa.setNombreCampo(String.valueOf(cbxNombreCampo.getSelectedItem()));

        rsa.setNombreCancha((String )cbxDeportes.getSelectedItem());

        rsa.setFechaReserva(jdateFecha.getDate());
        rsa.setHoraInicio(LocalTime.parse(txtHoraInicio.getText()));
        rsa.setHoraFin(LocalTime.parse(txtHoraFin.getText()));
        rsa.setDuracion(Integer.parseInt(txtDuracion.getText()));
        rsa.setPrimerPago(Float.parseFloat(txtPrimerPago.getText()));
        rsa.setSegundoPago(Float.parseFloat(txtSegundoPago.getText()));
        rsa.setPagototal(Float.parseFloat(txtPagototal.getText().trim()));
        rsa.setNombreEstado(txtEstado.getText().trim());
        
        listaReserva.add(rsa);
        JOptionPane.showMessageDialog(null, "Producto Agregado");

        listaTablaProductos();

        /*
        VentaPDF pdf= new VentaPDF();
        pdf.DatosCliente(Integer.parseInt(txtCodigoCliente.getText()));
        pdf.generarFacturaPDF();
        */

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        Reserva rsa = new Reserva();
        Ctrl_Reserva controlrsa= new Ctrl_Reserva();

        //enviamos datos del usuario
        rsa.setIdReserva(Integer.parseInt(txtIdReserva.getText().trim()));
        rsa.setIdCliente(Integer.parseInt(txtCodigoCliente.getText().trim()));
        rsa.setIdCampo(Integer.parseInt(txtCodigoCampo.getText().trim()));
        rsa.setIdCancha(Integer.parseInt(txtCodigoDescripcion.getText().trim()));
        rsa.setFechaReserva(jdateFecha.getDate());
        rsa.setHoraInicio(LocalTime.parse(txtHoraInicio.getText()));
        rsa.setHoraFin(LocalTime.parse(txtHoraFin.getText()));
        rsa.setDuracion(Integer.parseInt(txtDuracion.getText()));
        rsa.setPrimerPago(Float.parseFloat(txtPrimerPago.getText()));
        rsa.setSegundoPago(Float.parseFloat(txtSegundoPago.getText()));
        rsa.setPagototal(Float.parseFloat(txtPagototal.getText().trim()));
        
         if(cbxEstado.getSelectedItem()=="1"){
           rsa.setEstadoPagoPendiendte();
            
        }else if(cbxEstado.getSelectedItem()=="2") {
           rsa.setEstadoPagoLiquidado();
        }
        
        MontoF=MontoF+(Float.parseFloat(txtPagototal.getText()));
        txtMontoFinal.setText(String.valueOf(MontoF));

        if (controlrsa.Insertar(rsa)) {
            JOptionPane.showMessageDialog(null, "¡Reserva Registrada!");
            txtIdReserva.setText(String.valueOf(controlrsa.id_reserva_auto())); 
            /*
            VentaPDF pdf= new VentaPDF();
            pdf.DatosCliente(Integer.parseInt(txtCodigoCliente.getText()));
            pdf.generarFacturaPDF();
            */
        } else {
            JOptionPane.showMessageDialog(null, "¡Error al registrar cliente!");
        }
       

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        LocalTime horaInicio = LocalTime.parse(txtHoraInicio.getText());
        LocalTime horaFin = LocalTime.parse(txtHoraFin.getText());
        long duracionMinutos = ChronoUnit.MINUTES.between(horaInicio, horaFin);
        float costoTotal = (duracionMinutos * (Float.parseFloat(txtPrecioMinutoCampo.getText())));
        float porcentaje= 0.4f;
        float primerPago = costoTotal * porcentaje;
        float segundoPago = costoTotal - primerPago;

        txtDuracion.setText(String.valueOf(duracionMinutos));
        txtPagototal.setText(String.valueOf(costoTotal));
        txtPrimerPago.setText(String.valueOf(primerPago));
        txtSegundoPago.setText(String.valueOf(segundoPago));

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbxNombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNombreCampoActionPerformed

        String nombre = (String) cbxNombreCampo.getSelectedItem();
        cpd=controlcpd.ConsultarCampoReserva(nombre);

        if(cbxNombreCampo.getSelectedItem()=="---Seleccione el campo---"){
            txtCodigoCampo.setText("");

        }else if (cbxNombreCampo.getSelectedIndex()>-1){

            txtCodigoCampo.setText(String.valueOf(cpd.getIdCampo()));
            cargarDeportes();

        }

    }//GEN-LAST:event_cbxNombreCampoActionPerformed

    private void cbxNombreCampoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNombreCampoItemStateChanged

    }//GEN-LAST:event_cbxNombreCampoItemStateChanged

    private void cbxDeportesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxDeportesItemStateChanged

        String descripcion = (String)cbxDeportes.getSelectedItem();
        depor=controldepor.ConsultarDeporteReserva(descripcion);

        if(cbxDeportes.getSelectedItem()=="---Seleccione---"){
            txtPrecioMinutoCampo.setText("eres sapo ");
            txtCodigoDescripcion.setText("no hay u.u ");
        }else if (cbxDeportes.getSelectedIndex()>-1){

            txtPrecioMinutoCampo.setText(String.valueOf(depor.getPrecioMinuto()));
            txtCodigoDescripcion.setText(String.valueOf(depor.getIdCancha()));
        }
    }//GEN-LAST:event_cbxDeportesItemStateChanged

    private void cbxEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEstadoItemStateChanged


            
        if(cbxEstado.getSelectedItem()=="1"){
            txtEstado.setText("Pago Pendiente ");
            
        }else {
            txtEstado.setText("Pago Liquidado ");
        }


    }//GEN-LAST:event_cbxEstadoItemStateChanged

    private void txtHoraFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraFinActionPerformed

    
    
 private void CargarComboCampoDeportivo  () {
        Connection cn = Conexion.conectar();
        String sql = "select nombre from tb_campodeportivo where estado='1';";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cbxNombreCampo.removeAllItems();
            cbxNombreCampo.addItem("---Seleccione el campo---");
            while (rs.next()) {
                cbxNombreCampo.addItem(rs.getString("nombre"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar campos, !" + e);
        }
    }
    
    private void cargarDeportes() {
    // Obtener el idCampo desde el JTextField
    String nombreCampo = (String) (cbxNombreCampo.getSelectedItem());

    // Llamar al método para obtener los deportes por campo, no se si ponerlo en control reserva xd (no existe)
    List<Cancha> deportes = relacion.obtenerCanchaPorCampo(nombreCampo);

    
    cbxDeportes.removeAllItems();
     cbxDeportes.addItem("---Seleccione---");
    for (Cancha deporte : deportes) {
        
        cbxDeportes.addItem( deporte.getDescripcion());
        
    }
    }
    
    private void Limpiar(){
    txtDniCliente.setText("");
    txtCodigoCliente.setText("");
    txtNombreCliente.setText("");
    cbxNombreCampo.setSelectedIndex(0);
    txtCodigoCampo.setText("");
    cbxDeportes.setSelectedIndex(0);
    txtCodigoDescripcion.setText("");
    txtPrecioMinutoCampo.setText("");
    txtHoraInicio.setText("");
    txtHoraFin.setText("");
    txtDuracion.setText("");
    txtPrimerPago.setText("");
    txtSegundoPago.setText("");
    txtPagototal.setText("");

    }
    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxDeportes;
    private javax.swing.JComboBox<String> cbxEstado;
    public javax.swing.JComboBox<String> cbxNombreCampo;
    public javax.swing.JButton jButton_busca_cliente;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public com.toedter.calendar.JDateChooser jdateFecha;
    public static javax.swing.JTable tblReserva;
    public javax.swing.JTextField txtCodigoCampo;
    public javax.swing.JTextField txtCodigoCliente;
    public javax.swing.JTextField txtCodigoDescripcion;
    public javax.swing.JTextField txtDniCliente;
    public javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtHoraFin;
    public javax.swing.JTextField txtHoraInicio;
    public javax.swing.JTextField txtIdReserva;
    public static javax.swing.JTextField txtMontoFinal;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtPagototal;
    public javax.swing.JTextField txtPorcentajeReserva;
    public javax.swing.JTextField txtPrecioMinutoCampo;
    public static javax.swing.JTextField txtPrimerPago;
    public javax.swing.JTextField txtSegundoPago;
    // End of variables declaration//GEN-END:variables


  


 
   
}