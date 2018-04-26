/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elsolecito_programa.Recargas;
import Atxy2k.CustomTextField.RestrictedTextField;
import elsolecito_programa.CATÁLOGOS.FRM_Catalogo;
import elsolecito_programa.CLIENTES.FRM_Clientes_Alta;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author El Armandito
 */
public class FRM_Recargas extends javax.swing.JFrame {

    /**
     * Creates new form Recargas
     */
    public FRM_Recargas() {
        initComponents();
        setFilas();
        this.setLocationRelativeTo(null);
        Snumero(TXTnumerotelefono);
        Smonto(TXTmonto);
        SLada(TXTlada);
        
        RestrictedTextField RT = new RestrictedTextField(TXTnumerotelefono);
        RT.setLimit(7);
        RT.setOnlyNums(true);
        getToolkit().beep();
        
        RestrictedTextField RL = new RestrictedTextField(TXTlada);
        RL.setLimit(3);
        RL.setOnlyNums(true);
        getToolkit().beep();
        
        RestrictedTextField RF = new RestrictedTextField(TXTmonto);
        RF.setLimit(4);
        RF.setOnlyNums(true);
        getToolkit().beep();
                //JOptionPane.showMessageDialog(null, "Solo 10 digitos...");
    }
    BaseDatos mBD = new BaseDatos();
    TiempoAire TA = new TiempoAire();
    DefaultTableModel modeloTabla = new DefaultTableModel();

       private void setFilas(){
        if(mBD.conectar()){
            ArrayList mListaRecargas = mBD.consultarRecargas();  
            String [] Datos;
            
            modeloTabla.addColumn("Monto");
            modeloTabla.addColumn("Numero Telefonico");
            modeloTabla.addColumn("Compañia");
 
            for (Object mListaRecarga : mListaRecargas) {
                Datos = new String[3];
                
                TA = (TiempoAire)mListaRecarga;
                Datos[0] = "" + TA.getMonto();
                Datos[1] = TA.getnumeroT();
                Datos[2] = "" + TA.getCompañia();
            
                modeloTabla.addRow(Datos);
            } 
            
            this.Tabla_Recargas = new javax.swing.JTable();
            this.Tabla_Recargas.setModel(modeloTabla);
            
            this.Tabla_Recargas.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.Tabla_Recargas.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.Tabla_Recargas.getColumnModel().getColumn(2).setPreferredWidth(400);
            
            if (this.Tabla_Recargas.getRowCount() > 0) {
                this.Tabla_Recargas.setRowSelectionInterval(0, 0);
            }
           
        } else {
                JOptionPane.showMessageDialog(null, "Error al consultar...");
            }
        mBD.desconectar();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TXTlada = new javax.swing.JTextField();
        TXTnumerotelefono = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CBXcompañia = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        TXTmonto = new javax.swing.JTextField();
        TxrCerrar1 = new javax.swing.JButton();
        TXTrecargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Recargas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel7.setBackground(new java.awt.Color(102, 255, 0));
        jLabel7.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel7.setText("Recargas!!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SISTEMA DE RECARGAS.");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EL SOLECITO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel6)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Número telefónico:");

        TXTlada.setText("(         )");
        TXTlada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTladaActionPerformed(evt);
            }
        });

        TXTnumerotelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTnumerotelefonoActionPerformed(evt);
            }
        });

        jLabel17.setText("Compañía:");

        CBXcompañia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CBXcompañia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Telcel", "Unefon", "Movistar", "otro..." }));

        jLabel8.setText("Monto:");

        TxrCerrar1.setBackground(new java.awt.Color(51, 255, 51));
        TxrCerrar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxrCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wzdelete.jpg"))); // NOI18N
        TxrCerrar1.setText("Regresar");
        TxrCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxrCerrar1ActionPerformed(evt);
            }
        });

        TXTrecargar.setBackground(new java.awt.Color(51, 255, 0));
        TXTrecargar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TXTrecargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/import.png"))); // NOI18N
        TXTrecargar.setText("Recargar");
        TXTrecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTrecargarActionPerformed(evt);
            }
        });

        Tabla_Recargas.setModel(modeloTabla);
        jScrollPane1.setViewportView(Tabla_Recargas);

        jButton1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton1.setText("Reporte de recargas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(TxrCerrar1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TXTrecargar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TXTlada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TXTnumerotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CBXcompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TXTmonto))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXTlada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTnumerotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBXcompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TXTmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTrecargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxrCerrar1)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    public void Snumero(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(!Character.isDigit(c)){  
                getToolkit().beep();                
                e.consume();
                JOptionPane.showMessageDialog(null, "Introduce solo digitos...");
            }
            }
        });
    }
    public void Smonto(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(Character.isLetter(c)){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Introduce un monto Correcto de 4 digitos...");
                e.consume();
            }
            }
        });
    }
    public void SLada(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(Character.isLetter(c)){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Introduce una lada de solo 3 digitos...");
                e.consume();
            }
            }
        });
    }
    private void TxrCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxrCerrar1ActionPerformed
         this.dispose();
 
    }//GEN-LAST:event_TxrCerrar1ActionPerformed

    private void TXTrecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTrecargarActionPerformed
        // FRM_Recargas...
        
        TA.setMonto(Integer.parseInt(this.TXTmonto.getText()));
        TA.setnumeroT(this.TXTlada.getText() + this.TXTnumerotelefono.getText());
        TA.setCompañia(this.CBXcompañia.getItemAt(this.CBXcompañia.getSelectedIndex()).toString());
        
        
        if(mBD.conectar()) {
            if (mBD.GuardarRecarga(TA)) {
                JOptionPane.showMessageDialog(null, "Recarga con éxito...");
                this.TXTmonto.setText("");
                this.TXTnumerotelefono.setText("");
                this.CBXcompañia.setSelectedItem("");                
                
            } else {
                 JOptionPane.showMessageDialog(null, "Error al guardar...");
            }
        mBD.desconectar();
        }
    }//GEN-LAST:event_TXTrecargarActionPerformed

    private void TXTnumerotelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTnumerotelefonoActionPerformed
        
    }//GEN-LAST:event_TXTnumerotelefonoActionPerformed

    private void TXTladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTladaActionPerformed
        
    }//GEN-LAST:event_TXTladaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String path = "/Users/jorgegarcia/NetBeansProjects/ElSolecito_Programa/src/elsolecito_programa/Recargas/Reporte_Alta_Recargas.jasper";
        JasperReport jr = null;
        
        try {
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, mBD.conectare());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setTitle(path);
            
            
        } catch (JRException ex) {
            Logger.getLogger(FRM_Clientes_Alta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_Recargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Recargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Recargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Recargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Recargas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBXcompañia;
    private javax.swing.JTextField TXTlada;
    private javax.swing.JTextField TXTmonto;
    private javax.swing.JTextField TXTnumerotelefono;
    private javax.swing.JButton TXTrecargar;
    private javax.swing.JTable Tabla_Recargas;
    private javax.swing.JButton TxrCerrar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
