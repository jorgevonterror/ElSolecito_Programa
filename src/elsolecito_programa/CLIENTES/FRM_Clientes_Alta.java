/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.CLIENTES;

import elsolecito_programa.CLIENTES.BaseDeDatos.*;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author jorgegarcia
 */
public class FRM_Clientes_Alta extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Clientes_Alta
     */
    public FRM_Clientes_Alta() {
        setFilas();
        initComponents();
        this.setLocationRelativeTo(null);
        //Para seleccionar fila y columna de la tabla y los ponga en los TXT.
        Tabla_Deudores_Reg.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (Tabla_Deudores_Reg.getSelectedRow() != -1) {
                    int fila = Tabla_Deudores_Reg.getSelectedRow();
                    TXT_Nombre.setText(Tabla_Deudores_Reg.getValueAt(fila, 1).toString());
                    TXT_Monto.setText(Tabla_Deudores_Reg.getValueAt(fila, 2).toString());
                    TXT_Folio.setText(Tabla_Deudores_Reg.getValueAt(fila, 0).toString());
                }
            }
        });
    }
    DefaultTableModel modeloTabla = new DefaultTableModel();
    BaseDeDatos mBD = new BaseDeDatos();
    ClientesDeudores CD = new ClientesDeudores();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Deudores_Reg = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TXT_Folio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXT_Nombre = new javax.swing.JTextField();
        TXT_Monto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTRO DE CLIENTES DEUDORES.");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EL SOLECITO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wzdelete.jpg"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Tabla_Deudores_Reg.setModel(modeloTabla);
        jScrollPane1.setViewportView(Tabla_Deudores_Reg);

        jLabel5.setText("Folio:");

        jLabel1.setText("Nombre:");

        TXT_Folio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_FolioKeyTyped(evt);
            }
        });

        jLabel2.setText("Monto:");

        TXT_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NombreActionPerformed(evt);
            }
        });
        TXT_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_NombreKeyTyped(evt);
            }
        });

        TXT_Monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_MontoKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Save).jpg"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton2.setText("Reporte de clientes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(10, 10, 10)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TXT_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(24, 24, 24)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(TXT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TXT_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(TXT_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Connection conexion;
    ResultSet rs = null;
    Statement statement = null;

    //ESTE CUÑAAA
    void borrar() {
        DefaultTableModel LimpiadoTabla = (DefaultTableModel) Tabla_Deudores_Reg.getModel();
        //Borramosla tabla...
        int a = Tabla_Deudores_Reg.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {
            LimpiadoTabla.removeRow(LimpiadoTabla.getRowCount() - 1);
        }
    }

    //Preguntar de la actualización en tabla.
    void consulta() {
        ArrayList mListaClientes = new ArrayList();
        ClientesDeudores mClientes = null;
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from clientes;");

            while (resultado.next()) {
                mClientes = new ClientesDeudores();
                mClientes.setNombre(resultado.getString("Nombre"));
                mClientes.setMonto(resultado.getInt("Monto"));
                mClientes.setFolio(resultado.getString("folio"));
                mListaClientes.add(mClientes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setFilas() {
        if (mBD.conectar()) {
            ArrayList mListaClientes = mBD.consultarClientes();
            String[] Datos;

            modeloTabla.addColumn("Folio");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Monto");

            for (Object mListaCliente : mListaClientes) {
                Datos = new String[3];

                CD = (ClientesDeudores) mListaCliente;
                Datos[0] = CD.getFolio();
                Datos[1] = CD.getNombre();
                Datos[2] = "" + CD.getMonto();

                modeloTabla.addRow(Datos);
                //consulta();
            }

            this.Tabla_Deudores_Reg = new javax.swing.JTable();
            this.Tabla_Deudores_Reg.setModel(modeloTabla);

            this.Tabla_Deudores_Reg.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.Tabla_Deudores_Reg.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.Tabla_Deudores_Reg.getColumnModel().getColumn(2).setPreferredWidth(400);

            if (this.Tabla_Deudores_Reg.getRowCount() > 0) {
                this.Tabla_Deudores_Reg.setRowSelectionInterval(0, 0);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar...");
        }
        mBD.desconectar();
    }

    private void setFilas_2() {
        if (mBD.conectar()) {
            ArrayList mListaClientes = mBD.consultarClientes();
            String[] Datos;

            for (Object mListaCliente : mListaClientes) {
                Datos = new String[3];

                CD = (ClientesDeudores) mListaCliente;
                Datos[0] = CD.getFolio();
                Datos[1] = CD.getNombre();
                Datos[2] = "" + CD.getMonto();

                modeloTabla.addRow(Datos);
            }

            this.Tabla_Deudores_Reg = new javax.swing.JTable();
            this.Tabla_Deudores_Reg.setModel(modeloTabla);

            this.Tabla_Deudores_Reg.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.Tabla_Deudores_Reg.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.Tabla_Deudores_Reg.getColumnModel().getColumn(2).setPreferredWidth(400);

            if (this.Tabla_Deudores_Reg.getRowCount() > 0) {
                this.Tabla_Deudores_Reg.setRowSelectionInterval(0, 0);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar...");
        }
        mBD.desconectar();
    }

    private void TXT_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NombreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Alta de clientes deudores...     
        if (this.TXT_Nombre.getText().equals("") || this.TXT_Monto.getText().equals("") || this.TXT_Folio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos, por favor.");
        } else {
            CD.setNombre(this.TXT_Nombre.getText());
            CD.setMonto(Integer.parseInt(this.TXT_Monto.getText()));
            CD.setFolio(this.TXT_Folio.getText());

            if (mBD.conectar()) {
                if (mBD.GuardarClientes(CD)) {
                    //JOptionPane.showMessageDialog(null, "Cliente deudor guardado con éxito...");
                    borrar();
                    this.TXT_Nombre.setText("");
                    this.TXT_Monto.setText("");
                    this.TXT_Folio.setText("");
                    setFilas_2();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar...");
                }
                mBD.desconectar();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Para los reportes:
        //En la variable path se debe de colocar la ruta del archivo .jasper
        //que genera el archivo .xml
        String path = "/Users/jorgegarcia/NetBeansProjects/ElSolecito/src/elsolecito_programa/CLIENTES/Reporte_Alta_CD.jasper";
        JasperReport jr = null;

        try {
            jr = (JasperReport) JRLoader.loadObjectFromLocation(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, mBD.conectare());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setTitle(path);
            this.dispose();
        } catch (JRException ex) {
            Logger.getLogger(FRM_Clientes_Alta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TXT_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_NombreKeyTyped
        // TODO add your handling code here:
        char error = evt.getKeyChar();
        if ((error < 'A' || error > 'Z') && (error < 'a' || error > 'z') && (error != KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_NombreKeyTyped

    private void TXT_MontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_MontoKeyTyped
        // TODO add your handling code here:
        char error = evt.getKeyChar();
        if (error < '0' || error > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_MontoKeyTyped

    private void TXT_FolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_FolioKeyTyped
        // TODO add your handling code here:
        char error = evt.getKeyChar();
        if (error < '0' || error > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_TXT_FolioKeyTyped

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
            java.util.logging.Logger.getLogger(FRM_Clientes_Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes_Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes_Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes_Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Clientes_Alta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXT_Folio;
    private javax.swing.JTextField TXT_Monto;
    private javax.swing.JTextField TXT_Nombre;
    private javax.swing.JTable Tabla_Deudores_Reg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
