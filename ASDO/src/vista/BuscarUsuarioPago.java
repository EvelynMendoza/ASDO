/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import ConexionCloseBD.ConexionBD;
import DAO.DAOException;
import DAO.consumidoresDAO;
import DAO.consumidoresDAOImpl;
import DAO.consumoDAOImpl;
import java.awt.Color;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.consumidores;
import modelo.consumo;

/**
 *
 * @author Evelyn
 */
public class BuscarUsuarioPago extends javax.swing.JFrame {

    Connection conn = null;
    ConexionBD conecionBD = new ConexionBD();
    DefaultTableModel modelo = new DefaultTableModel();

    public BuscarUsuarioPago() {
        initComponents();
//        this.setExtendedState(MAXIMIZED_BOTH);
        modelo.addColumn("Periodo");
        modelo.addColumn("Estatus");
        jTablePagos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numUsuario = new javax.swing.JTextField();
        otrosPAgos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelManzana = new javax.swing.JLabel();
        jLabelNmedidor = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        Pagos = new javax.swing.JPanel();
        btnCobrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePagos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        btnSalir.setBackground(new java.awt.Color(7, 82, 132));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setLabel("SALIR");
        btnSalir.setName("btnSalir"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BUSCAR USUARIO:");

        numUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numUsuario.setForeground(new java.awt.Color(0, 51, 204));
        numUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numUsuarioKeyReleased(evt);
            }
        });

        otrosPAgos.setBackground(new java.awt.Color(255, 255, 255));
        otrosPAgos.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACIÓN DEL CONSUMIDOR"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("N° Medidor:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Teléfono:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Dirección:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Manzana:");

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTelefono.setText("###");

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDireccion.setText("###");

        jLabelManzana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelManzana.setText("###");

        jLabelNmedidor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNmedidor.setText("###");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre.setText("###");

        javax.swing.GroupLayout otrosPAgosLayout = new javax.swing.GroupLayout(otrosPAgos);
        otrosPAgos.setLayout(otrosPAgosLayout);
        otrosPAgosLayout.setHorizontalGroup(
            otrosPAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otrosPAgosLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(otrosPAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(otrosPAgosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(otrosPAgosLayout.createSequentialGroup()
                        .addGroup(otrosPAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(otrosPAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(otrosPAgosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNmedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        otrosPAgosLayout.setVerticalGroup(
            otrosPAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otrosPAgosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(otrosPAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNmedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrosPAgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(293, Short.MAX_VALUE))
        );

        Pagos.setBackground(new java.awt.Color(255, 255, 255));
        Pagos.setBorder(javax.swing.BorderFactory.createTitledBorder("OTROS PAGOS"));

        btnCobrar.setBackground(new java.awt.Color(7, 82, 132));
        btnCobrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCobrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCobrar.setText("COBRAR");
        btnCobrar.setName("btnSalir"); // NOI18N
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        jTablePagos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablePagos);

        javax.swing.GroupLayout PagosLayout = new javax.swing.GroupLayout(Pagos);
        Pagos.setLayout(PagosLayout);
        PagosLayout.setHorizontalGroup(
            PagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagosLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PagosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PagosLayout.setVerticalGroup(
            PagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PagosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(numUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(otrosPAgos, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(otrosPAgos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(256, 256, 256))
        );

        otrosPAgos.getAccessibleContext().setAccessibleName(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        Principal prin = new Principal();
        prin.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void numUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numUsuarioKeyReleased
        System.out.println(numUsuario.getText().length());
        if (numUsuario.getText().length() == 3) {
            try {

                int numConsumidor = Integer.parseInt(numUsuario.getText());
                int periodo = 10;
                int anio = 2019;
                conn = conecionBD.conexion();
                consumidoresDAO dao = new consumidoresDAOImpl(conn);
                consumoDAOImpl daoConsumo = new consumoDAOImpl(conn);
                consumidores consumidor = dao.buscarConsumidor(numConsumidor);
                jLabelNmedidor.setText(String.valueOf(consumidor.getNumMedidor()));
                jLabelNombre.setText(String.valueOf(consumidor.getNombreCompleto()));
                jLabelDireccion.setText(String.valueOf(consumidor.getDireccion()));
                jLabelManzana.setText(String.valueOf(consumidor.getManzana()));
                jLabelTelefono.setText(String.valueOf(consumidor.getTelefono()));

                //consumo consumo = daoConsumo.buscarConsumo(numConsumidor, periodo, anio);
                //consumo consumodao = daoConsumo.buscarConsumo(numConsumidor, 10, 2019);
                List<consumo> consumo = daoConsumo.buscarTodos();
                System.err.println("tamaña:  " + consumo.size());
                int toalRegistro = consumo.size();
                int i = 0;
                String matriz[][] = new String[toalRegistro][4];
                String status = "";

                for (consumo c : consumo) {
                    // System.out.println(c.toString());
                    if (c.getStatus() == 1) {
                        status = "pagado";
                    } else {
                        status = "Pendiente";

                    }
                    matriz[i][0] = c.getNumUsuario();
                    matriz[i][1] = (String.valueOf(c.getPeriodo()));
                    matriz[i][2] = (String.valueOf(c.getAnio()));
                    matriz[i][3] = status;
                    i++;
                }

                jTablePagos.setModel(new javax.swing.table.DefaultTableModel(
                        matriz,
                        new String[]{
                            "Num Usuario", "Periodo", "anio", "Estatus"
                        }
                ));
                //System.out.println(consumo.toString());
                jTablePagos.setDefaultRenderer(Object.class, new PintarCelda());
            } catch (DAOException ex) {
                Logger.getLogger(BuscarUsuarioPago.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (conn != null) {
                    conecionBD.cerrarConexion();
                }
            }
        } else {
            System.out.println("cadena menor a 3");
        }
    }//GEN-LAST:event_numUsuarioKeyReleased

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        // TODO add your handling code here:
        int filaSelect = jTablePagos.getSelectedRow();
        if (filaSelect >= 0) {
            String usuario = jTablePagos.getValueAt(filaSelect, 0).toString();
            int periodo = Integer.valueOf(jTablePagos.getValueAt(filaSelect, 1).toString());
            int anio = Integer.valueOf(jTablePagos.getValueAt(filaSelect, 2).toString());
            
            
            Pago pago = new Pago(usuario, periodo, anio);
            //Pago pago = new Pago();
            pago.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un registro");
        }
    }//GEN-LAST:event_btnCobrarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarUsuarioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuarioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuarioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuarioPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarUsuarioPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pagos;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelManzana;
    private javax.swing.JLabel jLabelNmedidor;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePagos;
    private javax.swing.JTextField numUsuario;
    private javax.swing.JPanel otrosPAgos;
    // End of variables declaration//GEN-END:variables
}
