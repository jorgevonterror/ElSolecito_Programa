/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.Producto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARIA NOELDA MARIANO
 */
public class FRM_Productos_Baja extends javax.swing.JFrame {

    /**
     * Creates new form FrmBajaProductos
     */
    public FRM_Productos_Baja() {
        setFilas();
        initComponents();
        this.setLocationRelativeTo(null);
        //Para seleccionar fila y columna de la tabla y los ponga en los TXT.
        TBProductos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (TBProductos.getSelectedRow() != -1) {
                    int fila = TBProductos.getSelectedRow();
                    TxtCodigo.setText(TBProductos.getValueAt(fila, 0).toString());
                }
            }
        });
    }

    BaseDeDatos mBD = new BaseDeDatos();
    Producto mProducto = new Producto();
    DefaultTableModel ModeloTabla = new DefaultTableModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBProductos = new javax.swing.JTable();
        BtnEliminar = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BAJA DE PRODUCTOS.");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EL SOLECITO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Ingrese el folio:");

        TxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodigoKeyTyped(evt);
            }
        });

        TBProductos.setModel(ModeloTabla);
        jScrollPane1.setViewportView(TBProductos);

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Delete).jpg"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wzdelete.jpg"))); // NOI18N
        BtnMenu.setText("Regresar");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BtnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setFilas_2() {
        if (mBD.conectar()) {
            ArrayList mListaProductos = mBD.ConsultarProductos();
            String[] Datos;

            for (Object mListaProducto : mListaProductos) {
                Datos = new String[4];

                mProducto = (Producto) mListaProducto;
                Datos[0] = mProducto.getCodigo();
                Datos[1] = mProducto.getNombre();
                Datos[2] = "" + mProducto.getPrecio();
                Datos[3] = mProducto.getDesc_Prod();

                ModeloTabla.addRow(Datos);
            }

            this.TBProductos = new javax.swing.JTable();
            this.TBProductos.setModel(ModeloTabla);

            this.TBProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TBProductos.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.TBProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
            this.TBProductos.getColumnModel().getColumn(3).setPreferredWidth(400);

            if (this.TBProductos.getRowCount() > 0) {
                this.TBProductos.setRowSelectionInterval(0, 0);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar...");
        }
        mBD.desconectar();
    }

    void borrar() {
        DefaultTableModel LimpiadoTabla = (DefaultTableModel) TBProductos.getModel();
        //Borramosla tabla...
        int a = TBProductos.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {
            LimpiadoTabla.removeRow(LimpiadoTabla.getRowCount() - 1);
        }
    }

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        if (this.TxtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos, por favor.");
        } else {
            mProducto.setCodigo(this.TxtCodigo.getText());
            if (mBD.conectar()) {
                if (mBD.EliminarProducto(mProducto)) {
                    //JOptionPane.showMessageDialog(null, "Producto eliminado con éxito...");
                    borrar();
                    setFilas_2();

                    this.TxtCodigo.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar...");
                }
                mBD.desconectar();
            }
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        // TODO add your handling code here:
        new FRM_Producto_Catalogo().show();
        this.setVisible(false);
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void TxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodigoKeyTyped
        // TODO add your handling code here:
        char error = evt.getKeyChar();
        if (error < '0' || error > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCodigoKeyTyped

    private void setFilas() {
        if (mBD.conectar()) {
            ArrayList mListaProductos = mBD.ConsultarProductos();
            String[] Datos;

            ModeloTabla.addColumn("Codigo");
            ModeloTabla.addColumn("Nombre");
            ModeloTabla.addColumn("Precio");
            ModeloTabla.addColumn("Descripcion");

            for (Object mListaProducto : mListaProductos) {
                Datos = new String[4];

                mProducto = (Producto) mListaProducto;
                Datos[0] = mProducto.getCodigo();
                Datos[1] = mProducto.getNombre();
                Datos[2] = "" + mProducto.getPrecio();
                Datos[3] = mProducto.getDesc_Prod();

                ModeloTabla.addRow(Datos);
            }

            this.TBProductos = new javax.swing.JTable();
            this.TBProductos.setModel(ModeloTabla);

            this.TBProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TBProductos.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.TBProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
            this.TBProductos.getColumnModel().getColumn(3).setPreferredWidth(400);

            if (this.TBProductos.getRowCount() > 0) {
                this.TBProductos.setRowSelectionInterval(0, 0);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar...");
        }
        mBD.desconectar();
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
            java.util.logging.Logger.getLogger(FRM_Productos_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Productos_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Productos_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Productos_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FRM_Productos_Baja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JTable TBProductos;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
