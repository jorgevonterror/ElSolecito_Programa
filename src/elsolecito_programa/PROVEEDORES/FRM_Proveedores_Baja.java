package elsolecito_programa.PROVEEDORES;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/* 1. Distribucion de inventario en el local El Solecito.
    2. Omar Almaraz Cordova.
    3. Creacion 17/04/18.
    4. Programacion de formularios en el catalogo Proveedores.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 8.1
 */
public class FRM_Proveedores_Baja extends javax.swing.JFrame {

    /**
     * Creates new form Baja
     */
    public FRM_Proveedores_Baja() {
        setFilas();
        initComponents();
        this.setLocationRelativeTo(null);
        //Para seleccionar fila y columna de la tabla y los ponga en los TXT.
        TableConsultas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (TableConsultas.getSelectedRow() != -1) {
                    int fila = TableConsultas.getSelectedRow();
                    TXT_Folio.setText(TableConsultas.getValueAt(fila, 0).toString());
                }
            }
        });
    }
    BaseDeDAtos mBD = new BaseDeDAtos();
    Proveedores Prov = new Proveedores();
    DefaultTableModel modeloTabla = new DefaultTableModel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TableConsultas = new javax.swing.JTable();
        TXT_Folio = new javax.swing.JTextField();
        BTNEliminar = new javax.swing.JButton();
        BTN_Menu_Proveedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BAJA DE PROVEEDORES.");

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
                        .addGap(136, 136, 136)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4)))
                .addContainerGap(122, Short.MAX_VALUE))
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

        TableConsultas.setModel(modeloTabla);
        jScrollPane1.setViewportView(TableConsultas);

        TXT_Folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_FolioActionPerformed(evt);
            }
        });
        TXT_Folio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_FolioKeyTyped(evt);
            }
        });

        BTNEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User delete).jpg"))); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        BTN_Menu_Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wzdelete.jpg"))); // NOI18N
        BTN_Menu_Proveedores.setText("Regresar");
        BTN_Menu_Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Menu_ProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNEliminar)
                            .addComponent(BTN_Menu_Proveedores))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXT_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BTNEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Menu_Proveedores)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void setFilas(){
        if(mBD.conectar()){
            ArrayList mListaProveedores = mBD.consultarProveedores();  
            String [] Datos;
            modeloTabla.addColumn("Folio");
            modeloTabla.addColumn("Marca");
            modeloTabla.addColumn("Nombre");
 
            for (Object mListaProveedor : mListaProveedores) {
                Datos = new String[4];
                
                Prov = (Proveedores)mListaProveedor;
                Datos[0] = Prov.getFolio();
                Datos[1] = Prov.getMarca();
                Datos[2] = Prov.getNombre();
            
                modeloTabla.addRow(Datos);
            } 
            
            this.TableConsultas = new javax.swing.JTable();
            this.TableConsultas.setModel(modeloTabla);
            this.TableConsultas.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TableConsultas.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.TableConsultas.getColumnModel().getColumn(2).setPreferredWidth(400);
            
            if (this.TableConsultas.getRowCount() > 0) {
                this.TableConsultas.setRowSelectionInterval(0, 0);
            }
           
        } else {
                JOptionPane.showMessageDialog(null, "Error al consultar...");
            }
        mBD.desconectar();
    }
    
    void borrar(){
        DefaultTableModel LimpiadoTabla = (DefaultTableModel) TableConsultas.getModel();
        //Borramosla tabla...
        int a = TableConsultas.getRowCount()-1;
        
        for(int i = a; i>=0;i--) {
            LimpiadoTabla.removeRow(LimpiadoTabla.getRowCount()-1);
        }
    }
    private void setFilas_2(){
        if(mBD.conectar()){
            ArrayList mListaProveedores = mBD.consultarProveedores();  
            String [] Datos;

            for (Object mListaProveedor : mListaProveedores) {
                Datos = new String[4];
                
                Prov = (Proveedores)mListaProveedor;
                Datos[0] = Prov.getFolio();
                Datos[1] = Prov.getMarca();
                Datos[2] = Prov.getNombre();
            
                modeloTabla.addRow(Datos);
            } 
            
            this.TableConsultas = new javax.swing.JTable();
            this.TableConsultas.setModel(modeloTabla);
            this.TableConsultas.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.TableConsultas.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.TableConsultas.getColumnModel().getColumn(2).setPreferredWidth(400);
            
            if (this.TableConsultas.getRowCount() > 0) {
                this.TableConsultas.setRowSelectionInterval(0, 0);
            }
           
        } else {
                JOptionPane.showMessageDialog(null, "Error al consultar...");
            }
        mBD.desconectar();
    }
    
    private void TXT_FolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_FolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_FolioActionPerformed

    private void BTN_Menu_ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Menu_ProveedoresActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTN_Menu_ProveedoresActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        Prov.setFolio(this.TXT_Folio.getText());
        if(mBD.conectar())
        {
            if(mBD.eliminarProveedores(Prov))
            {
                //JOptionPane.showMessageDialog(null, "Proveedor eliminado con exito...");
                borrar();
                this.TXT_Folio.setText("");
                setFilas_2();
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Error al eliminar...");
            }
            mBD.desconectar();
        }
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void TXT_FolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_FolioKeyTyped
       char error = evt.getKeyChar();
       if (error < '0'|| error > '9')evt.consume(); 
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
            java.util.logging.Logger.getLogger(FRM_Proveedores_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Proveedores_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Proveedores_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Proveedores_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Proveedores_Baja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTN_Menu_Proveedores;
    private javax.swing.JTextField TXT_Folio;
    private javax.swing.JTable TableConsultas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
