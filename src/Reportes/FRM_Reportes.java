/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import elsolecito_programa.CLIENTES.FRM_Clientes_Alta;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class FRM_Reportes extends javax.swing.JFrame {
        Map Parametro;
        String Companyia = "";
        String Dia = "";
        String Tipo = "";
        String path = "";
        String Mes = ""; 
        String folio = "";
        JasperReport jr = null;
    /**
     * Creates new form FRM_Reportes
     */
    public FRM_Reportes() {
        initComponents();
        LblTC.setVisible(false);
        CBXcompañia.setVisible(false);
        LbMes.setVisible(false);
        TxFolio.setVisible(false);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBXTipo = new javax.swing.JComboBox<>();
        LblTC = new javax.swing.JLabel();
        CBXcompañia = new javax.swing.JComboBox();
        BtnGenerar = new javax.swing.JButton();
        LbMes = new javax.swing.JLabel();
        TxFolio = new javax.swing.JTextField();
        LbFolio = new javax.swing.JLabel();
        TxtMes1 = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENERADOR DE REPORTES. ");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EL SOLECITO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(131, 131, 131))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Seleccione el tipo de reporte:");

        CBXTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recargas", "Ventas por mes", " " }));
        CBXTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXTipoActionPerformed(evt);
            }
        });

        LblTC.setText("Compañía:");

        CBXcompañia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CBXcompañia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Telcel", "Unefon", "Movistar", "otro..." }));
        CBXcompañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXcompañiaActionPerformed(evt);
            }
        });

        BtnGenerar.setText("Generar reporte");
        BtnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarActionPerformed(evt);
            }
        });

        LbMes.setText("Mes");

        TxFolio.setName("TxtFolio"); // NOI18N

        LbFolio.setText("Folio ");
        LbFolio.setName("LbFolio"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LblTC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBXcompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(LbMes)
                .addGap(178, 178, 178))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(CBXTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(LbFolio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(BtnGenerar)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(339, Short.MAX_VALUE)
                    .addComponent(TxtMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CBXTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbFolio)
                    .addComponent(TxFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBXcompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTC)
                    .addComponent(LbMes))
                .addGap(35, 35, 35)
                .addComponent(BtnGenerar)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(TxtMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBXTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXTipoActionPerformed
        // TODO add your handling code here:
        Tipo = "";
        Tipo = CBXTipo.getItemAt(this.CBXTipo.getSelectedIndex()).toString();
        switch(Tipo){
            case "Existencia":
                break;

            case "Recargas":
                LblTC.setVisible(true);
                CBXcompañia.setVisible(true);
                LbMes.setVisible(false);
                TxFolio.setVisible(false);
                break;
                    
            case "Ventas por mes":
                LblTC.setVisible(false);
                CBXcompañia.setVisible(false);
                LbMes.setVisible(true);
                TxFolio.setVisible(true);
                
                
                break;

            case "Ventas de dia":
                LbMes.setVisible(false);
                TxFolio.setVisible(false);
                LblTC.setVisible(false);
                CBXcompañia.setVisible(false);
                
            break;
            
            case "Detalle de la ventas":
                LbMes.setVisible(false);
                TxFolio.setVisible(false);
                LblTC.setVisible(false);
                CBXcompañia.setVisible(false);
                LbFolio.setVisible(true);
                TxFolio.setVisible(true);
            break;
            
            case "Detalle de la compra":
                LbMes.setVisible(false);
                TxFolio.setVisible(false);
                LblTC.setVisible(false);
                CBXcompañia.setVisible(false);
                LbFolio.setVisible(true);
                TxFolio.setVisible(true);
            break;
            
        }
    }//GEN-LAST:event_CBXTipoActionPerformed

    private void BtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarActionPerformed
        // TODO add your handling code here:   
        BaseDeDatosVentas mBD = new BaseDeDatosVentas();
        
        switch(Tipo){
            case "Existencia":
                
                break;

            case "Recargas":
            Companyia = CBXcompañia.getItemAt(this.CBXcompañia.getSelectedIndex()).toString();
            Parametro = new HashMap();
            path = "";
            path = "C:\\Users\\MARIA NOELDA MARIANO\\Documents\\Git\\ElSolecito_Programa\\src\\Reportes\\Reporte_Recargas.jasper";
            jr = null;
            try {
                Parametro.put("seleccion", Companyia);
                //jr = (JasperReport)JRLoader.loadObjectFromLocation(path);
                  jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, Parametro, mBD.conectare());
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                jv.setTitle(path);
                this.dispose();
            } catch (JRException ex) {
                Logger.getLogger(FRM_Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }                
                
                break;
                    
            case "Ventas por mes": 
            Mes = TxFolio.getText();        
            Parametro = new HashMap();
            path = "";
            path = "C:\\Users\\MARIA NOELDA MARIANO\\Documents\\Git\\ElSolecito_Programa\\src\\Reportes\\Reporte_VentasPorMes.jasper";
            jr = null;
            try {
                Parametro.put("seleccion", Mes);
                //jr = (JasperReport)JRLoader.loadObjectFromLocation(path);
                jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, Parametro, mBD.conectare());
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                jv.setTitle(path);
                this.dispose();
            } catch (JRException ex) {
                Logger.getLogger(FRM_Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }                
            break;
            
            case "Detalle de la compra":
            folio = TxFolio.getText();
            Parametro = new HashMap();
            path = "";
            path = "C:\\Users\\MARIA NOELDA MARIANO\\Documents\\Git\\ElSolecito_Programa\\src\\Reportes\\Reporte_Detalle_Compra.jasper";
            jr = null;
            try {
                Parametro.put("Buscar", folio);
                //jr = (JasperReport)JRLoader.loadObjectFromLocation(path);
                jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, Parametro, mBD.conectare());
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                jv.setTitle(path);
                this.dispose();
            } catch (JRException ex) {
                Logger.getLogger(FRM_Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }                
            break;
            case "Detalle de la venta":
            folio = TxFolio.getText();
            Parametro = new HashMap();
            path = "";
            path = "C:\\Users\\MARIA NOELDA MARIANO\\Documents\\Git\\ElSolecito_Programa\\src\\Reportes\\Reporte_Detalle_Venta.jasper";
            jr = null;
            try {
                Parametro.put("Buscar", folio);
                //jr = (JasperReport)JRLoader.loadObjectFromLocation(path);
                jr = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, Parametro, mBD.conectare());
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                jv.setTitle(path);
                this.dispose();
            } catch (JRException ex) {
                Logger.getLogger(FRM_Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }                
            break;
            
            

            case "Ventas de dia":
                /*Dia = TxtDia.getText();        
            Parametro = new HashMap();
            path = "";
            path = "C:\\Users\\MARIA NOELDA MARIANO\\Documents\\Git\\ElSolecito_Programa\\src\\Reportes\\Reporte_VentasPorMes.jasper";
            jr = null;
            try {
                Parametro.put("seleccion", Dia);
                jr = (JasperReport)JRLoader.loadObjectFromLocation(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, Parametro, mBD.conectare());
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                jv.setTitle(path);
                this.dispose();
            } catch (JRException ex) {
                Logger.getLogger(FRM_Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }     
                */
            break;
        }
    }//GEN-LAST:event_BtnGenerarActionPerformed

    private void CBXcompañiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXcompañiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXcompañiaActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Reportes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGenerar;
    private javax.swing.JComboBox<String> CBXTipo;
    private javax.swing.JComboBox CBXcompañia;
    private javax.swing.JLabel LbFolio;
    private javax.swing.JLabel LbMes;
    private javax.swing.JLabel LblTC;
    private javax.swing.JTextField TxFolio;
    private javax.swing.JTextField TxtMes1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
