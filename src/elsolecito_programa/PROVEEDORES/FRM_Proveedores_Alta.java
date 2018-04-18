package elsolecito_programa.PROVEEDORES;
import elsolecito_programa.PROVEEDORES.BaseDeDAtos.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/* 1. Distribucion de inventario en el local El Solecito.
    2. Omar Almaraz Cordova.
    3. Creacion 17/04/18.
    4. Programacion en formulario alta de proveedores.
*/
/**
 *
 * @author 8.1
 */
public class FRM_Proveedores_Alta extends javax.swing.JFrame {

    /**
     * Creates new form Alta
     */
    public FRM_Proveedores_Alta() {
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
                    TXTNombre.setText(TableConsultas.getValueAt(fila, 1).toString());
                    TXTMarca.setText(TableConsultas.getValueAt(fila, 2).toString());
                }
            }
        });
    }
    DefaultTableModel modeloTabla = new DefaultTableModel();
    BaseDeDAtos mBD = new BaseDeDAtos();
    Proveedores Prov = new Proveedores();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBL_Folio = new javax.swing.JLabel();
        LBLMarca = new javax.swing.JLabel();
        LBLNombre = new javax.swing.JLabel();
        TXT_Folio = new javax.swing.JTextField();
        TXTMarca = new javax.swing.JTextField();
        TXTNombre = new javax.swing.JTextField();
        BTNGuardar = new javax.swing.JButton();
        BTN_Menu_Proveedores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableConsultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBL_Folio.setText("Folio:");

        LBLMarca.setText("Marca:");

        LBLNombre.setText("Nombre:");

        TXT_Folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_FolioActionPerformed(evt);
            }
        });

        BTNGuardar.setText("Guardar");
        BTNGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGuardarActionPerformed(evt);
            }
        });

        BTN_Menu_Proveedores.setText("Menu Poveedores");
        BTN_Menu_Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Menu_ProveedoresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Registro De Proveedores");

        TableConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableConsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BTNGuardar)
                .addGap(56, 56, 56)
                .addComponent(BTN_Menu_Proveedores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLMarca)
                            .addComponent(LBLNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_Folio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLMarca)
                            .addComponent(TXTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLNombre)
                            .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNGuardar)
                    .addComponent(BTN_Menu_Proveedores))
                .addGap(68, 68, 68))
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
                Datos = new String[3];
                
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

    private void BTNGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGuardarActionPerformed
        Prov.setFolio(this.TXT_Folio.getText());
        Prov.setMarca(this.TXTMarca.getText());
        Prov.setNombre(this.TXTNombre.getText());
        if(mBD.conectar())
        {
            if (mBD.GuardarProveedores(Prov)) {
                JOptionPane.showMessageDialog(null, "Proveedor guadado con exito");
                this.TXT_Folio.setText("");
                this.TXTMarca.setText("");
                this.TXTNombre.setText("");
            }
            else  
            {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
            mBD.desconectar();
        }
    }//GEN-LAST:event_BTNGuardarActionPerformed

    private void BTN_Menu_ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Menu_ProveedoresActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BTN_Menu_ProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_Proveedores_Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Proveedores_Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Proveedores_Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Proveedores_Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Proveedores_Alta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNGuardar;
    private javax.swing.JButton BTN_Menu_Proveedores;
    private javax.swing.JLabel LBLMarca;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JLabel LBL_Folio;
    private javax.swing.JTextField TXTMarca;
    private javax.swing.JTextField TXTNombre;
    private javax.swing.JTextField TXT_Folio;
    private javax.swing.JTable TableConsultas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
