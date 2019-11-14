
package vista;

import ConexionCloseBD.ConexionBD;
import DAO.DAOException;
import DAO.consumidoresDAO;
import DAO.consumidoresDAOImpl;
import DAO.consumoDAOImpl;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.consumidores;
import modelo.consumo;

/**
 *
 * @author Evelyn
 */
public class consumidorCRUD extends javax.swing.JFrame {

    Connection conn = null;
    ConexionBD conecionBD = new ConexionBD();
    consumidoresDAO consumidores;
    consumidores consumidor;
    int ultimoId = 0;
    int newId = 0;
    
    public consumidorCRUD() throws DAOException {
        initComponents();
        conn =  conecionBD.conexion();
        consumidores = new consumidoresDAOImpl(conn);
        consumidor = consumidores.obtenerNumusuario();
        ultimoId = Integer.parseInt(consumidor.getNumUsuario());
        newId = ultimoId + 1;
        newNumusuario.setText(String.valueOf(newId));
        buscarUsuario.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox3 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        btnSalir3 = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnAltaconsumidor = new javax.swing.JButton();
        jLabelsEstado = new javax.swing.JLabel();
        estado1 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextNumedidor = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jTextManzana = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        newNumusuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buscarUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelsEstado1 = new javax.swing.JLabel();
        estado2 = new javax.swing.JComboBox();
        btnActualizarGuardar = new javax.swing.JButton();
        jTextNumedidor1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextNombre1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextDireccion1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextManzana1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextTelefono1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jTabbedPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(7, 82, 132))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("N° Medidor:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Nombre:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Dirección:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Manzana:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Teléfono:");

        btnAltaconsumidor.setBackground(new java.awt.Color(7, 82, 132));
        btnAltaconsumidor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAltaconsumidor.setForeground(new java.awt.Color(255, 255, 255));
        btnAltaconsumidor.setText("DAR DE ALTA CONSUMIDOR");
        btnAltaconsumidor.setName("btnSalir"); // NOI18N
        btnAltaconsumidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaconsumidorActionPerformed(evt);
            }
        });

        jLabelsEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelsEstado.setText("Estado:");

        estado1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        estado1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione el estado", "Activo", "Pago anual", "No paga", "Cancelado", "Pendiente" }));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("NÚMERO DE USUARIO:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("El núm. de usuario se obtiene automáticamente.");

        jTextNumedidor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextManzana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoKeyTyped(evt);
            }
        });

        newNumusuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        newNumusuario.setForeground(new java.awt.Color(0, 0, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Ej. M.123 o S/M");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("### - Fijo - S/N");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addComponent(jLabelsEstado))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextManzana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                            .addComponent(jTextTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextNombre)
                            .addComponent(jTextDireccion)
                            .addComponent(jTextNumedidor)
                            .addComponent(estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newNumusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAltaconsumidor)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(newNumusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jTextNumedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelsEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnAltaconsumidor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jTabbedPane4.addTab("DAR DE ALTA CONSUMIDOR", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        buscarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buscarUsuario.setForeground(new java.awt.Color(0, 51, 204));
        buscarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarUsuarioKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("BUSCAR USUARIO:");

        jLabelsEstado1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelsEstado1.setText("Estado:");

        estado2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        estado2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione el estado", "Activo", "Pago anual", "No paga", "Cancelado", "Pendiente" }));

        btnActualizarGuardar.setBackground(new java.awt.Color(7, 82, 132));
        btnActualizarGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizarGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarGuardar.setText("ACTUALIZAR CONSUMIDOR");
        btnActualizarGuardar.setName("btnSalir"); // NOI18N
        btnActualizarGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarGuardarActionPerformed(evt);
            }
        });

        jTextNumedidor1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("N° Medidor:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Nombre:");

        jTextNombre1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Dirección:");

        jTextDireccion1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Manzana:");

        jTextManzana1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Teléfono:");

        jTextTelefono1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Ej. M.123 o S/M");
        jLabel2.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("### - Fijo - S/N");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelsEstado1)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(20, 20, 20))
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(estado2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextManzana1)
                            .addComponent(jTextTelefono1)
                            .addComponent(jTextNumedidor1)
                            .addComponent(jTextNombre1)
                            .addComponent(jTextDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarGuardar)
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelsEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextNumedidor1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextManzana1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnActualizarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane4.addTab("ACTUALIZAR INFORMACIÓN CONSUMIDOR", jPanel3);

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

        jPanel11.setBackground(new java.awt.Color(9, 43, 96));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarUsuarioKeyReleased
        int tam = buscarUsuario.getText().length();
        if (tam == 3) {
            try {
                int numConsumidor = Integer.parseInt(buscarUsuario.getText());

                conn = conecionBD.conexion();
                consumidoresDAO dao = new consumidoresDAOImpl(conn);
                consumidores cons = dao.buscarConsumidor(numConsumidor);

                if(cons != null){
                    jTextNumedidor1.setText(String.valueOf(cons.getNumMedidor()));
                    jTextNombre1.setText(String.valueOf(cons.getNombreCompleto()));
                    jTextDireccion1.setText(String.valueOf(cons.getDireccion()));
                    jTextManzana1.setText(String.valueOf(cons.getManzana()));
                    jTextTelefono1.setText(String.valueOf(cons.getTelefono()));
                    estado2.setSelectedIndex(cons.getStatus());
                }else{
                    limpiarCamposAct();
                    buscarUsuario.setText("");
                }
            } catch (DAOException ex) {
                Logger.getLogger(buscarConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (conn != null) {
                    conecionBD.cerrarConexion();
                }
            }
        }else{
            limpiarCamposAct();
        }
    }//GEN-LAST:event_buscarUsuarioKeyReleased

    private void buscarUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarUsuarioKeyTyped
        char ch = evt.getKeyChar();
        int tam = buscarUsuario.getText().length();
        if(Character.isDigit(ch)){
            if(tam == 3 ){
                evt.consume();
            }
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_buscarUsuarioKeyTyped

    private void btnAltaconsumidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaconsumidorActionPerformed
        try {
            conn = conecionBD.conexion();
            consumidoresDAOImpl dao = new consumidoresDAOImpl(conn);
            consumidores c = new consumidores();
            consumidores nm = new consumidores();

            String numM = jTextNumedidor.getText();
            int b = 1;//es String
            try{
		Integer.parseInt(numM);
                nm = dao.buscarNconsumidor(Integer.parseInt(numM));
                b=0;//es numero
            } catch (NumberFormatException e){
		b=1;//es String
            }
            if(nm == null || b==1){//si no existe nm o num medidor es texto
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Está seguro de dar de alta?", "Confirmar alta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(seleccion == 0){
                    
                    c.setNumUsuario(String.valueOf(newNumusuario.getText()));
                    c.setNumMedidor(String.valueOf(numM)); 
                    c.setNombreCompleto(jTextNombre.getText());
                    c.setDireccion(jTextDireccion.getText());
                    c.setManzana(jTextManzana.getText());
                    c.setTelefono(jTextTelefono.getText());
                    c.setStatus(estado1.getSelectedIndex()); 
                    dao.insertar(c);
                    newNumusuario.setText(String.valueOf(Integer.parseInt(newNumusuario.getText())+1));
                    limpiarCampos();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Núm. de medidor ya existe, verifica el dato.", "Aviso", JOptionPane.WARNING_MESSAGE);
                jTextNumedidor.requestFocus();
            }
        } catch (DAOException ex) {
            Logger.getLogger(buscarConsumidor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                conecionBD.cerrarConexion();
            }
        }
    }//GEN-LAST:event_btnAltaconsumidorActionPerformed

    private void btnSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir3ActionPerformed
        this.dispose();
        Principal prin = new Principal();
        prin.setVisible(true);
    }//GEN-LAST:event_btnSalir3ActionPerformed

    private void btnActualizarGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarGuardarActionPerformed
        if(buscarUsuario.getText().equals("") || buscarUsuario.getText().length() < 3){
            JOptionPane.showMessageDialog(null,"Ingresa un Núm. de usuario");
            buscarUsuario.requestFocus();
        }else{
            try{
                conn = conecionBD.conexion();
                consumidoresDAOImpl dao = new consumidoresDAOImpl(conn);
                consumidores c = new consumidores();
                consumidores nm = new consumidores();

                String numM = jTextNumedidor1.getText();
                int b = 1;//es String
                try{
//                    System.out.println(numM);
                    Integer.parseInt(numM);
                    nm = dao.buscarNconsumidor(Integer.parseInt(numM));
//                    if(nm!=null && nm.getNumUsuario().equals(buscarUsuario.getText())){
//                        b=1;
//                    }else{
                        b=0;//es numero
//                    }
                } catch (NumberFormatException e){
                    b=1;//es String
                }
                if(nm == null || b==1 || nm.getNumUsuario().equals(buscarUsuario.getText())){//si no existe nm o num medidor es texto
                    int seleccion = JOptionPane.showConfirmDialog(null, "¿Guardar cambios?", "Confirmar cambios", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(seleccion == 0){//Si la respuesta fue SÍ
                        try {            
                            c.setNumMedidor(String.valueOf(jTextNumedidor1.getText())); 
                            c.setNombreCompleto(jTextNombre1.getText());
                            c.setDireccion(jTextDireccion1.getText());
                            c.setManzana(jTextManzana1.getText());
                            c.setTelefono(jTextTelefono1.getText());
                            c.setStatus(estado2.getSelectedIndex()); 
                            c.setNumUsuario(String.valueOf(buscarUsuario.getText()));
                            dao.actualizar(c);
                            buscarUsuario.setText("");
                            limpiarCamposAct();
                        } catch (DAOException e){
                            System.err.println("e:   "+e);
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Núm. de medidor ya existe, verifica el dato.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    jTextNumedidor1.requestFocus();
                }
            }catch (DAOException ex) {
                Logger.getLogger(buscarConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (conn != null) {
                    conecionBD.cerrarConexion();
                }
            }
        }
    }//GEN-LAST:event_btnActualizarGuardarActionPerformed

    private void jTextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoKeyTyped
        char ch = evt.getKeyChar();
        int tam = jTextTelefono.getText().length();
        if(Character.isDigit(ch)){
            if(tam == 10 ){
                evt.consume();
            }
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_jTextTelefonoKeyTyped

    void limpiarCampos(){
        jTextNumedidor.setText("");
        jTextNombre.setText("");
        jTextDireccion.setText("");
        jTextManzana.setText("");
        jTextTelefono.setText("");
        estado1.setSelectedIndex(0);
        jTextNumedidor.requestFocus();
    }
    
    void limpiarCamposAct(){
        jTextNumedidor1.setText("");
        jTextNombre1.setText("");
        jTextDireccion1.setText("");
        jTextManzana1.setText("");
        jTextTelefono1.setText("");
        estado2.setSelectedIndex(0);
        buscarUsuario.requestFocus();
    }
    
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
            java.util.logging.Logger.getLogger(consumidorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consumidorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consumidorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consumidorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new consumidorCRUD().setVisible(true);
                } catch (DAOException ex) {
                    Logger.getLogger(consumidorCRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarGuardar;
    private javax.swing.JButton btnAltaconsumidor;
    private javax.swing.JButton btnSalir3;
    private javax.swing.JTextField buscarUsuario;
    private javax.swing.JComboBox estado1;
    private javax.swing.JComboBox estado2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelsEstado;
    private javax.swing.JLabel jLabelsEstado1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextDireccion1;
    private javax.swing.JTextField jTextManzana;
    private javax.swing.JTextField jTextManzana1;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNombre1;
    private javax.swing.JTextField jTextNumedidor;
    private javax.swing.JTextField jTextNumedidor1;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JTextField jTextTelefono1;
    private javax.swing.JLabel newNumusuario;
    // End of variables declaration//GEN-END:variables
}
