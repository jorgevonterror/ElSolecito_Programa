/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.PRODUCTO;

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

        TxtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBProductos = new javax.swing.JTable();
        BtnEliminar = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TBProductos.setModel(ModeloTabla);
        jScrollPane1.setViewportView(TBProductos);

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnMenu.setText("Menu");

        jLabel2.setText("Ingrese el codigo del producto a eliminar del sistema:");

        jLabel3.setText("EL SOLECITO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnEliminar))
                            .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        mProducto.setFolio(this.TxtCodigo.getText());
        if(mBD.conectar()) {
            if (mBD.EliminarProducto(mProducto)) {
                 JOptionPane.showMessageDialog(null, "Producto eliminado con éxito...");
                this.TxtCodigo.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar...");
            }
        mBD.desconectar();
        }
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void setFilas(){
        if(mBD.conectar()){
            ArrayList mListaProductos = mBD.ConsultarProductos();
            String [] Datos;
            
            ModeloTabla.addColumn("Codigo");
            ModeloTabla.addColumn("Nombre");
            ModeloTabla.addColumn("Precio");
            ModeloTabla.addColumn("Descripcion");
 
            for (Object mListaProducto : mListaProductos) {
                Datos = new String[3];
                
                mProducto = (Producto)mListaProducto;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
