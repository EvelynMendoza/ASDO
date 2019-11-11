
package vista;

/**
 *
 * @author Evelyn
 */

import ConexionCloseBD.ConexionBD;
import DAO.CoutaDAO;
import DAO.CoutaDAOImpl;
import DAO.DAOException;
import DAO.consumidoresDAO;
import DAO.consumidoresDAOImpl;
import DAO.consumoDAOImpl;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Couta;
import modelo.consumidores;
import modelo.consumo;

public class lecturaConsumo extends javax.swing.JFrame {

    Connection conn = null;
    ConexionBD conecionBD = new ConexionBD();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    
         
    public Double importe = 0.0;
    public int anio = 0;
    public int mes = 0;
    public double cuota = 0;
    
    public Double precio = 0.0;
    public Double lecturaAct = 0.0;
    public Double consumoLectura = 0.0;
    
    public int periodo = 0;
    
    public lecturaConsumo() throws DAOException {
        initComponents();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaformateada = formato.format(new Date());
        anio = Integer.parseInt(fechaformateada.substring(0, 4));
        mes = Integer.parseInt(fechaformateada.substring(5, 7));
        conn = conecionBD.conexion();
    CoutaDAO  couta= new CoutaDAOImpl(conn);
    Couta  couata= couta.buscarCuota();
    precio=couata.getPRECIO();
        
        if(mes == 12 || mes == 1){
            periodo = 1;
            jLabelPeriodo.setText("Diciembre-Enero");
        }else if(mes == 2 || mes == 3){
            periodo = 2;
            jLabelPeriodo.setText("Febrero-Marzo");
        }else if(mes == 4 || mes == 5){
            periodo = 3;
            jLabelPeriodo.setText("Abril-Mayo");
        }else if(mes == 6 || mes == 7){
            periodo = 4;
            jLabelPeriodo.setText("Junio-Julio");
        }else if(mes == 8 || mes == 9){
            periodo = 5;
            jLabelPeriodo.setText("Agosto-Septiembre");            
        }else if(mes == 10 || mes == 11){
            periodo = 6;
            jLabelPeriodo.setText("Octubre-Noviembre");            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor2 = new javax.swing.JPanel();
        btnSalir3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        numUsuario2 = new javax.swing.JTextField();
        otrosPAgos2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabelTelefono2 = new javax.swing.JLabel();
        jLabelDireccion2 = new javax.swing.JLabel();
        jLabelManzana2 = new javax.swing.JLabel();
        jLabelNmedidor2 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        otrosPAgos4 = new javax.swing.JPanel();
        jTextRecargo1 = new javax.swing.JTextField();
        jTextCooperacion1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextBonificaciones1 = new javax.swing.JTextField();
        jTextSanciones1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaMotivo1 = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jTextVarios1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextLectura = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabelPeriodo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabelLecturaAnterior = new javax.swing.JLabel();
        jLabelConsumoAnterior = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        contenedor2.setBackground(new java.awt.Color(255, 255, 255));

        btnSalir3.setBackground(new java.awt.Color(7, 82, 132));
        btnSalir3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir3.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir3.setText("REGRESAR");
        btnSalir3.setName("btnSalir"); // NOI18N
        btnSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("BUSCAR USUARIO:");

        numUsuario2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numUsuario2.setForeground(new java.awt.Color(0, 51, 204));
        numUsuario2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numUsuario2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numUsuario2KeyTyped(evt);
            }
        });

        otrosPAgos2.setBackground(new java.awt.Color(255, 255, 255));
        otrosPAgos2.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACIÓN DEL CONSUMIDOR"));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("N° Medidor:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Nombre:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Teléfono:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Dirección:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Manzana:");

        jLabelTelefono2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTelefono2.setText("###");

        jLabelDireccion2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDireccion2.setText("###");

        jLabelManzana2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelManzana2.setText("###");

        jLabelNmedidor2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNmedidor2.setText("###");

        jLabelNombre2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre2.setText("###");

        javax.swing.GroupLayout otrosPAgos2Layout = new javax.swing.GroupLayout(otrosPAgos2);
        otrosPAgos2.setLayout(otrosPAgos2Layout);
        otrosPAgos2Layout.setHorizontalGroup(
            otrosPAgos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otrosPAgos2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(otrosPAgos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(otrosPAgos2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(otrosPAgos2Layout.createSequentialGroup()
                        .addGroup(otrosPAgos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(28, 28, 28)
                        .addGroup(otrosPAgos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelDireccion2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jLabelNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelManzana2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(otrosPAgos2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNmedidor2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        otrosPAgos2Layout.setVerticalGroup(
            otrosPAgos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otrosPAgos2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(otrosPAgos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNmedidor2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelManzana2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        otrosPAgos4.setBackground(new java.awt.Color(255, 255, 255));
        otrosPAgos4.setBorder(javax.swing.BorderFactory.createTitledBorder("OTROS PAGOS"));

        jTextRecargo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextRecargo1.setText("0.0");
        jTextRecargo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextRecargo1KeyTyped(evt);
            }
        });

        jTextCooperacion1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextCooperacion1.setText("0.0");
        jTextCooperacion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCooperacion1KeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Recargos:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Sanciones:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("Cooperación:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("Bonificaciones:");

        jTextBonificaciones1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextBonificaciones1.setText("0.0");
        jTextBonificaciones1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBonificaciones1KeyTyped(evt);
            }
        });

        jTextSanciones1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextSanciones1.setText("0.0");
        jTextSanciones1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextSanciones1KeyTyped(evt);
            }
        });

        jTextAreaMotivo1.setColumns(20);
        jTextAreaMotivo1.setRows(5);
        jScrollPane5.setViewportView(jTextAreaMotivo1);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("Varios:");

        jTextVarios1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextVarios1.setText("0.0");
        jTextVarios1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextVarios1KeyTyped(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 51));
        jLabel33.setText("Nota: en caso de sancion poner motivo");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("Lectura de Consumo:");

        jTextLectura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextLectura.setText("0.0");
        jTextLectura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextLecturaKeyTyped(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("Periodo:");

        jLabelPeriodo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelPeriodo.setText("mostrar periodo");

        javax.swing.GroupLayout otrosPAgos4Layout = new javax.swing.GroupLayout(otrosPAgos4);
        otrosPAgos4.setLayout(otrosPAgos4Layout);
        otrosPAgos4Layout.setHorizontalGroup(
            otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otrosPAgos4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel31)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel32)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(otrosPAgos4Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(30, 30, 30)
                        .addGroup(otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextLectura, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jTextRecargo1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jTextCooperacion1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jTextBonificaciones1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jTextSanciones1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jTextVarios1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                    .addGroup(otrosPAgos4Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        otrosPAgos4Layout.setVerticalGroup(
            otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otrosPAgos4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeriodo))
                .addGap(18, 18, 18)
                .addGroup(otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLectura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextRecargo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCooperacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextBonificaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSanciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVarios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        btnGuardar.setBackground(new java.awt.Color(7, 82, 132));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setName("btnSalir"); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(9, 43, 96));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(9, 43, 96));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("LECTURA ANTERIOR"));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Lectura Anterior:");

        jLabelLecturaAnterior.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelLecturaAnterior.setForeground(new java.awt.Color(0, 0, 102));
        jLabelLecturaAnterior.setText("###");

        jLabelConsumoAnterior.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelConsumoAnterior.setForeground(new java.awt.Color(0, 0, 102));
        jLabelConsumoAnterior.setText("###");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Consumo mtrs:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelConsumoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLecturaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLecturaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConsumoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedor2Layout = new javax.swing.GroupLayout(contenedor2);
        contenedor2.setLayout(contenedor2Layout);
        contenedor2Layout.setHorizontalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor2Layout.createSequentialGroup()
                        .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(otrosPAgos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otrosPAgos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(numUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(btnSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        contenedor2Layout.setVerticalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(numUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenedor2Layout.createSequentialGroup()
                        .addComponent(otrosPAgos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(otrosPAgos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir3ActionPerformed
        this.dispose();
        Principal prin = new Principal();
        prin.setVisible(true);
    }//GEN-LAST:event_btnSalir3ActionPerformed

    private void numUsuario2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numUsuario2KeyReleased
        int tam = numUsuario2.getText().length();
        if (tam == 3) {
            try {
                int numConsumidor = Integer.parseInt(numUsuario2.getText());
                
                conn = conecionBD.conexion();
                consumidoresDAO dao = new consumidoresDAOImpl(conn);
                consumoDAOImpl daoConsumo = new consumoDAOImpl(conn);
                
                consumidores consumidor = dao.buscarConsumidor(numConsumidor);
                
                
                if(consumidor != null){
                    jLabelNmedidor2.setText(String.valueOf(consumidor.getNumMedidor()));
                    jLabelNombre2.setText(String.valueOf(consumidor.getNombreCompleto()));
                    jLabelDireccion2.setText(String.valueOf(consumidor.getDireccion()));
                    jLabelManzana2.setText(String.valueOf(consumidor.getManzana()));
                    jLabelTelefono2.setText(String.valueOf(consumidor.getTelefono()));
                    
                    System.out.println(numUsuario2.getText() + "-" + periodo + "-" + anio);
                    
                    consumo consumo = daoConsumo.buscarConsumo(Integer.parseInt(numUsuario2.getText()), periodo-1, anio);

                    jLabelLecturaAnterior.setText(String.valueOf((consumo.getLecturaActual())));
                    jLabelConsumoAnterior.setText(String.valueOf((consumo.getConsumoMedidor())));

                    
//                    jTextCuota.setText(String.valueOf((consumo.getCoutaFija())));
//                    jTextRecargo.setText(String.valueOf(consumo.getRecargos()));
//                    jTextCooperacion.setText(String.valueOf(consumo.getCooperacion()));
//                    jTextBonificaciones.setText(String.valueOf(consumo.getBonificaciones()));
//                    jTextSanciones.setText(String.valueOf(consumo.getSanciones()));
//                    jTextVarios.setText(String.valueOf(consumo.getVarios()));
//                    jTextAreaMotivo.setText(consumo.getAviso());

//                    pintarColumnaTabla();
                }else{
                    limpiarCampos();
                    JOptionPane.showMessageDialog(this, "El usuario no fue encontrado");
                    numUsuario2.setText("");
                }
            } catch (DAOException ex) {
                Logger.getLogger(BuscarUsuarioPago.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (conn != null) {
                    conecionBD.cerrarConexion();
                }
            }
        }else{
            limpiarCampos();
        }
    }//GEN-LAST:event_numUsuario2KeyReleased

    private void numUsuario2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numUsuario2KeyTyped
        char ch = evt.getKeyChar();
        int tam = numUsuario2.getText().length();
        if(Character.isDigit(ch)){
            if(tam == 3 ){
                evt.consume();
            }
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_numUsuario2KeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(numUsuario2.getText().equals("") || numUsuario2.getText().length() < 3){
            JOptionPane.showMessageDialog(null,"Ingresa un Núm. de usuario");
            numUsuario2.requestFocus();
        }else if(Double.parseDouble(jTextLectura.getText()) < Double.parseDouble(jLabelLecturaAnterior.getText())){
            JOptionPane.showMessageDialog(null,"LECTURA INVALIDA. \n La lectura actual es menor a la anterior:"
                    + "\n" + jTextLectura.getText() + " < " + jLabelLecturaAnterior.getText());
            jTextLectura.requestFocus();
        }else{
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Guardar cambios?", "Confirmar cambios", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(seleccion == 0){//Si la respuesta fue SÍ
                Double ant = Double.parseDouble(jLabelLecturaAnterior.getText());
                Double act = Double.parseDouble(jTextLectura.getText());

                if(act >= ant){
                    consumoLectura = act - ant;
                    try {            
                        conn = conecionBD.conexion();
                        consumoDAOImpl daoConsumo = new consumoDAOImpl(conn);
                        consumo c = new consumo();

                        String numUser = numUsuario2.getText();                

                        lecturaAct = Double.valueOf(jTextLectura.getText());
                        Double recargo = Double.valueOf(jTextRecargo1.getText());
                        Double cooperacion = Double.valueOf(jTextCooperacion1.getText());
                        Double bonificacion = Double.valueOf(jTextBonificaciones1.getText());
                        Double sanciones = Double.valueOf(jTextSanciones1.getText());
                        Double varios = Double.valueOf(jTextVarios1.getText());
                        importe = (lecturaAct-Double.parseDouble(jLabelLecturaAnterior.getText()))*precio;
                        String fecha = null;
                        String notas = jTextAreaMotivo1.getText();
                        String aviso = "Sin aviso";
                        int status = 0;

                        if(consumoLectura < 10){
                            cuota = 40.0;
                        }
                        
                        System.out.println("consumo: " + consumoLectura);

                        Double total = importe+cuota+recargo+cooperacion+bonificacion+sanciones+varios;

                                                
                        System.out.println(numUser + "," + periodo + "," +anio+ "," +lecturaAct+ "," +
                                consumoLectura+ "," +precio+ "," +importe+ "," +cuota+ "," +recargo+ "," +cooperacion+ "," +
                                bonificacion+ "," +sanciones+ "," +varios+ "," +total+ "," +fecha+ "," +notas+ "," +aviso+ "," +
                                status);

                        c.setNumUsuario(numUser);
                        c.setPeriodo(periodo);
                        c.setAnio(anio);
                        c.setLecturaActual(lecturaAct);
                        c.setConsumoMedidor(consumoLectura);
                        c.setPrecio(precio);
                        c.setImporteConsumo(importe);
                        c.setCoutaFija(cuota);
                        c.setRecargos(recargo);
                        c.setCooperacion(cooperacion);
                        c.setBonificaciones(bonificacion);
                        c.setSanciones(sanciones);
                        c.setVarios(varios);
                        c.setTotalPagar(total);
                        c.setFechaPAgo(fecha);
                        c.setNotas(notas);
                        c.setAviso(aviso);
                        c.setStatus(status);

                        System.out.println("Valor del modelo antes de insertar"+ c.toString());
                        
//                        consumo consumo = daoConsumo.buscarConsumo(Integer.parseInt(numUsuario2.getText()), periodo, anio);
                        
//                        if(consumo == null){
//                            System.out.println(consumo);
                            daoConsumo.insertar(c);
                            numUsuario2.setText("");
                            numUsuario2.requestFocus();
                            limpiarCampos();
//                        }else{
//                            JOptionPane.showMessageDialog(null,"Este registro ya EXISTE");
//                            System.out.println(consumo);
//                        }
                    } catch (DAOException ex) {
                        //Logger.getLogger(lecturaConsumo.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"Este registro ya EXISTE");
                    }
                }
              
//                System.out.println(numUser + "," + periodo + "," +anio+ "," +lecturaAct+ "," +
//                        consumoLectura+ "," +precio+ "," +importe+ "," +cuota+ "," +recargo+ "," +cooperacion+ "," +
//                        bonificacion+ "," +sanciones+ "," +varios+ "," +total+ "," +fecha+ "," +notas+ "," +aviso+ "," +
//                        status);
//
//                c.setNumUsuario(numUser);
//                c.setPeriodo(periodo);
//                c.setAnio(anio);
//                c.setLecturaActual(lecturaAct);
//                c.setConsumoMedidor(consumoLectura);
//                c.setPrecio(precio);
//                c.setImporteConsumo(importe);
//                c.setCoutaFija(cuota);
//                c.setRecargos(recargo);
//                c.setCooperacion(cooperacion);
//                c.setBonificaciones(bonificacion);
//                c.setSanciones(sanciones);
//                c.setVarios(varios);
//                c.setTotalPagar(total);
//                c.setFechaPAgo(fecha);
//                c.setNotas(notas);
//                c.setAviso(aviso);
//                c.setStatus(status);
//                System.out.println("Tostring"+c.toString());
//                daoConsumo.insertar(c);
//                numUsuario2.setText("");
//                limpiarCampos();
//
//            } catch (DAOException ex) {
//                Logger.getLogger(lecturaConsumo.class.getName()).log(Level.SEVERE, null, ex);
//
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    void limpiarCampos(){
        jLabelNmedidor2.setText("####");
        jLabelNombre2.setText("####");
        jLabelDireccion2.setText("####");
        jLabelManzana2.setText("####");
        jLabelTelefono2.setText("####");
        jTextLectura.setText("0.0");
        jTextRecargo1.setText("0.0");
        jTextCooperacion1.setText("0.0");
        jTextBonificaciones1.setText("0.0");
        jTextSanciones1.setText("0.0");
        jTextVarios1.setText("0.0");
        jTextAreaMotivo1.setText("");
        jLabelLecturaAnterior.setText("####");
        jLabelConsumoAnterior.setText("####");
    }
    
    private void jTextLecturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextLecturaKeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextLecturaKeyTyped

    private void jTextRecargo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRecargo1KeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextRecargo1KeyTyped

    private void jTextCooperacion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCooperacion1KeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextCooperacion1KeyTyped

    private void jTextBonificaciones1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBonificaciones1KeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextBonificaciones1KeyTyped

    private void jTextSanciones1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSanciones1KeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextSanciones1KeyTyped

    private void jTextVarios1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextVarios1KeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextVarios1KeyTyped

   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lecturaConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecturaConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecturaConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecturaConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new lecturaConsumo().setVisible(true);
                } catch (DAOException ex) {
                    Logger.getLogger(lecturaConsumo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir3;
    private javax.swing.JPanel contenedor2;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabelConsumoAnterior;
    private javax.swing.JLabel jLabelDireccion2;
    private javax.swing.JLabel jLabelLecturaAnterior;
    private javax.swing.JLabel jLabelManzana2;
    private javax.swing.JLabel jLabelNmedidor2;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelTelefono2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaMotivo1;
    private javax.swing.JTextField jTextBonificaciones1;
    private javax.swing.JTextField jTextCooperacion1;
    private javax.swing.JTextField jTextLectura;
    private javax.swing.JTextField jTextRecargo1;
    private javax.swing.JTextField jTextSanciones1;
    private javax.swing.JTextField jTextVarios1;
    private javax.swing.JTextField numUsuario2;
    private javax.swing.JPanel otrosPAgos2;
    private javax.swing.JPanel otrosPAgos4;
    // End of variables declaration//GEN-END:variables
}
