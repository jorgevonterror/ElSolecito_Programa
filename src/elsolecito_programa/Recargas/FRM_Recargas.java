/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elsolecito_programa.Recargas;
import Atxy2k.CustomTextField.RestrictedTextField;
import elsolecito_programa.CATÁLOGOS.FRM_Catalogo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxrCerrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CBXcompañia = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        TxrCerrar1 = new javax.swing.JButton();
        TXTrecargar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TXTnumerotelefono = new javax.swing.JTextField();
        TXTmonto = new javax.swing.JTextField();
        TxrCerrar2 = new javax.swing.JButton();
        TXTlada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel7.setBackground(new java.awt.Color(102, 255, 0));
        jLabel7.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel7.setText("Recargas!!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 51));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("EL SOLECITO");

        jLabel6.setBackground(new java.awt.Color(102, 255, 0));
        jLabel6.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel6.setText("Recargas!!");

        TxrCerrar.setForeground(new java.awt.Color(0, 0, 204));
        TxrCerrar.setText("Cancelar!!");
        TxrCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxrCerrarActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(102, 255, 0));
        jLabel8.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Numero Telefonico:");

        CBXcompañia.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        CBXcompañia.setForeground(new java.awt.Color(0, 0, 255));
        CBXcompañia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Telcel", "Unefon", "Movistar", "otro..." }));

        jLabel9.setBackground(new java.awt.Color(102, 255, 0));
        jLabel9.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Compañia:");

        TxrCerrar1.setBackground(new java.awt.Color(51, 255, 51));
        TxrCerrar1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 14)); // NOI18N
        TxrCerrar1.setForeground(new java.awt.Color(0, 0, 204));
        TxrCerrar1.setText("Regresar al Anterior!!");
        TxrCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxrCerrar1ActionPerformed(evt);
            }
        });

        TXTrecargar.setBackground(new java.awt.Color(51, 255, 0));
        TXTrecargar.setForeground(new java.awt.Color(0, 0, 204));
        TXTrecargar.setText("¡¡Iniciar Recarga!!");
        TXTrecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTrecargarActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(102, 255, 0));
        jLabel10.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("Monto:");

        TXTnumerotelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTnumerotelefonoActionPerformed(evt);
            }
        });

        TxrCerrar2.setBackground(new java.awt.Color(51, 255, 51));
        TxrCerrar2.setFont(new java.awt.Font("Harlow Solid Italic", 0, 14)); // NOI18N
        TxrCerrar2.setForeground(new java.awt.Color(0, 0, 204));
        TxrCerrar2.setText("Ver Registro!!");
        TxrCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxrCerrar2ActionPerformed(evt);
            }
        });

        TXTlada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTladaActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(102, 255, 0));
        jLabel11.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText("Lada!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBXcompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXTmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxrCerrar1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxrCerrar2)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxrCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TXTlada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TXTnumerotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 27, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TXTrecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TXTnumerotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTlada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBXcompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(TXTmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(TXTrecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxrCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxrCerrar1)
                    .addComponent(TxrCerrar2))
                .addContainerGap())
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
    private void TxrCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxrCerrarActionPerformed
       setVisible(false);
    }//GEN-LAST:event_TxrCerrarActionPerformed

    private void TxrCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxrCerrar1ActionPerformed
         FRM_Catalogo Catalogo;
        Catalogo = new FRM_Catalogo();
       
        Catalogo.show();
 
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

    private void TxrCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxrCerrar2ActionPerformed
       FRMConsulta Consulta = new FRMConsulta();
               Consulta.show();
    }//GEN-LAST:event_TxrCerrar2ActionPerformed

    private void TXTladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTladaActionPerformed
        
    }//GEN-LAST:event_TXTladaActionPerformed

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
    private javax.swing.JButton TxrCerrar;
    private javax.swing.JButton TxrCerrar1;
    private javax.swing.JButton TxrCerrar2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
