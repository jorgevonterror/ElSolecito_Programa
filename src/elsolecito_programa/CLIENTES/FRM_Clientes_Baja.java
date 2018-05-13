/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolecito_programa.CLIENTES;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jorgegarcia
 */
public class FRM_Clientes_Baja extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Clientes_Baja
     */
    public FRM_Clientes_Baja() {
        setFilas();
        initComponents();
        this.setLocationRelativeTo(null);
        //Para seleccionar fila y columna de la tabla y los ponga en los TXT.
        Tabla_Deudores.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (Tabla_Deudores.getSelectedRow() != -1) {
                    int fila = Tabla_Deudores.getSelectedRow();
                    TXT_Folio.setText(Tabla_Deudores.getValueAt(fila, 0).toString());
                }
            }
        });
    }
    
    BaseDeDatos mBD = new BaseDeDatos();
    ClientesDeudores CD = new ClientesDeudores();
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
        TXT_Folio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Deudores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ELIMINACIÓN DE CLIENTES DEUDORES.");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EL SOLECITO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        TXT_Folio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_FolioKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User delete).jpg"))); // NOI18N
        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wzdelete.jpg"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Tabla_Deudores.setModel(modeloTabla);
        jScrollPane1.setViewportView(Tabla_Deudores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXT_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void borrar(){
        DefaultTableModel LimpiadoTabla = (DefaultTableModel) Tabla_Deudores.getModel();
        //Borramosla tabla...
        int a = Tabla_Deudores.getRowCount()-1;
        
        for(int i = a; i>=0;i--) {
            LimpiadoTabla.removeRow(LimpiadoTabla.getRowCount()-1);
        }
    }
    
    private void setFilas(){
        if(mBD.conectar()){
            ArrayList mListaClientes = mBD.consultarClientes();  
            String [] Datos;
            modeloTabla.addColumn("Folio");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Monto");
 
            for (Object mListaCliente : mListaClientes) {
                Datos = new String[4];
                
                CD = (ClientesDeudores)mListaCliente;
                Datos[0] = CD.getFolio();
                Datos[1] = CD.getNombre();
                Datos[2] = "" + CD.getMonto();
            
                modeloTabla.addRow(Datos);
            } 
            
            this.Tabla_Deudores = new javax.swing.JTable();
            this.Tabla_Deudores.setModel(modeloTabla);
            this.Tabla_Deudores.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.Tabla_Deudores.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.Tabla_Deudores.getColumnModel().getColumn(2).setPreferredWidth(400);
            
            if (this.Tabla_Deudores.getRowCount() > 0) {
                this.Tabla_Deudores.setRowSelectionInterval(0, 0);
            }
           
        } else {
                JOptionPane.showMessageDialog(null, "Error al consultar...");
            }
        mBD.desconectar();
    }
    private void setFilas_2(){
        if(mBD.conectar()){
            ArrayList mListaClientes = mBD.consultarClientes();  
            String [] Datos;
 
            for (Object mListaCliente : mListaClientes) {
                Datos = new String[4];
                
                CD = (ClientesDeudores)mListaCliente;
                Datos[0] = CD.getFolio();
                Datos[1] = CD.getNombre();
                Datos[2] = "" + CD.getMonto();
            
                modeloTabla.addRow(Datos);
            } 
            
            this.Tabla_Deudores = new javax.swing.JTable();
            this.Tabla_Deudores.setModel(modeloTabla);
            this.Tabla_Deudores.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.Tabla_Deudores.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.Tabla_Deudores.getColumnModel().getColumn(2).setPreferredWidth(400);
            
            if (this.Tabla_Deudores.getRowCount() > 0) {
                this.Tabla_Deudores.setRowSelectionInterval(0, 0);
            }
           
        } else {
                JOptionPane.showMessageDialog(null, "Error al consultar...");
            }
        mBD.desconectar();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (this.TXT_Folio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos, por favor.");
        }else{
            CD.setFolio(this.TXT_Folio.getText());
            if (mBD.conectar()) {
                if (mBD.eliminarClientes(CD)) {
                    //JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito...");
                    this.TXT_Folio.setText("");
                    borrar();
                    setFilas_2();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar...");
                }
                mBD.desconectar();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TXT_FolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_FolioKeyTyped
        // TODO add your handling code here:
        char error = evt.getKeyChar();
        if (error < '0'|| error > '9') evt.consume(); 
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
            java.util.logging.Logger.getLogger(FRM_Clientes_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes_Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Clientes_Baja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXT_Folio;
    private javax.swing.JTable Tabla_Deudores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
