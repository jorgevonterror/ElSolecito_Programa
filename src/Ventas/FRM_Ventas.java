/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

import elsolecito_programa.CLIENTES.FRM_Clientes_Alta;
import elsolecito_programa.Producto.Producto;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jorge García
 */
public class FRM_Ventas extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Ventas
     */
    public FRM_Ventas() {
        initComponents();
        this.setLocationRelativeTo(null);
        setProductos();
        setVentas();
    }

    BaseDeDatos mBD = new BaseDeDatos();
    int ContadorColumna = 1;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    Producto mProducto = new Producto();
    float TotalCompleto = 0;
    float TotalTemporal = 0;
    int RegistroVenta = 0;
    float ResultadoVentaTotal = 0;
    int CantidadNueva = 0;
    Venta mVenta = new Venta();
    DetalleVenta mDetalleVenta = new DetalleVenta();
    Calendar fecha = new GregorianCalendar();
    int ContadorColumnaProveedor = 1;

    void borrar() {
        DefaultTableModel TablaLimpiar = (DefaultTableModel) Tabla_Ventas.getModel();
        int a = Tabla_Ventas.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            TablaLimpiar.removeRow(TablaLimpiar.getRowCount() - 1);
        }
    }

    void setProductos() {
        if (mBD.conectar()) {
            ArrayList mArrayList = new ArrayList();
            mArrayList = mBD.ConsultaTodoProducto();
            String[] Datos = null;
            if (mArrayList != null) {
                if (ContadorColumna == 1) {
                    //modeloTabla.addColumn("id_producto");
                    modeloTabla.addColumn("Folio");
                    modeloTabla.addColumn("Nombre");
                    modeloTabla.addColumn("Precio");
                    modeloTabla.addColumn("Descripcion");
                    ContadorColumna = 2;
                }
                for (int i = 0; i < mArrayList.size(); i++) {
                    mProducto = (Producto) mArrayList.get(i);
                    Datos = new String[4];

                    //Datos[0] = "" + mProducto.getId_producto();
                    Datos[0] = mProducto.getCodigo();
                    Datos[1] = mProducto.getNombre();
                    Datos[2] = "" + mProducto.getPrecio();
                    Datos[3] = mProducto.getDesc_Prod();

                    //INICIALIZAMOS LOS LB EN NADA.
                    //Me quede aquí.
                    LB_Precio.setText("-");
                    LB_TotalPago.setText("00.00");
                    LB_Desc.setText("-");
                    LB_Nombre.setText("-");
                    LB_Proveedor.setText("-");

                    modeloTabla.addRow(Datos);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el producto...");
            }
            this.Tabla_Ventas = new javax.swing.JTable();
            this.Tabla_Ventas.setModel(modeloTabla);

            this.Tabla_Ventas.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.Tabla_Ventas.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.Tabla_Ventas.getColumnModel().getColumn(2).setPreferredWidth(400);
            this.Tabla_Ventas.getColumnModel().getColumn(3).setPreferredWidth(600);
            //this.Tabla_Ventas.getColumnModel().getColumn(4).setPreferredWidth(400);

            if (this.Tabla_Ventas.getRowCount() > 0) {
                this.Tabla_Ventas.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar.");
        }
        mBD.desconectar();
    }

    void setVentas() {
        String FechaActual = "" + fecha.get(Calendar.YEAR) + "-" + fecha.get(Calendar.MONTH) + "-" + fecha.get(Calendar.DAY_OF_MONTH);
        System.out.println();
        
        mVenta.setFecha_venta(FechaActual);
        mVenta.setPrecioTotalVenta(TotalCompleto);
        mVenta.setFolio(TXT_Folio.getText());
        
        if (mBD.conectar()) {
            if (mBD.AltaVenta(mVenta)) {
                RegistroVenta = (mBD.ConsultaIDVenta());
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar Venta");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Error al consultar");
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

        jLabel16 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        TXT_Folio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LB_Nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LB_Desc = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LB_Precio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LB_Proveedor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        LB_TotalPago = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Ventas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        TXT_Cantidad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setText("Total a pagar:");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/screen6.png"))); // NOI18N
        jButton6.setText("Reporte");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back57.png"))); // NOI18N
        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("VENTA DE PRODUCTOS.");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EL SOLECITO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setText("INGRESE LOS DATOS:");

        jLabel1.setText("Folio:");

        jLabel2.setText("Nombre:");

        LB_Nombre.setText("jLabel3");

        jLabel3.setText("Descripción:");

        LB_Desc.setText("jLabel4");

        jLabel4.setText("Precio:");

        LB_Precio.setText("jLabel5");

        jLabel5.setText("Proveedor:");

        LB_Proveedor.setText("jLabel6");

        jLabel6.setText("Cantidad:");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel17.setText("Total a pagar: $");

        LB_TotalPago.setText("jLabel10");

        Tabla_Ventas.setModel(modeloTabla);
        jScrollPane1.setViewportView(Tabla_Ventas);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setText("PRODUCTOS REGISTRADOS.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LB_TotalPago))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(LB_Proveedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(LB_Precio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LB_Desc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LB_Nombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TXT_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LB_Nombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(LB_Desc))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LB_Precio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LB_Proveedor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TXT_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_TotalPago)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/screen6.png"))); // NOI18N
        jButton1.setText("Mostrar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel.png"))); // NOI18N
        jButton2.setText("Seleccionar producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jButton5.setText("Guardar venta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registry24.png"))); // NOI18N
        jButton3.setText("Finalizar venta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/screen6.png"))); // NOI18N
        jButton7.setText("Reporte");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back57.png"))); // NOI18N
        jButton8.setText("Regresar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton3)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setProductos();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        borrar();
        if (mBD.conectar()) {
            Producto mProducto = mBD.ConsultaEspecificaProducto(this.TXT_Folio.getText());
            String[] Datos;
            if (mProducto != null) {
                if (ContadorColumna == 1) {
                    modeloTabla.addColumn("Folio");
                    modeloTabla.addColumn("Nombre");
                    modeloTabla.addColumn("Precio");
                    modeloTabla.addColumn("Descripcion");
                    ContadorColumna = 2;
                }
                Datos = new String[4];
                Datos[0] = mProducto.getCodigo();
                Datos[1] = mProducto.getNombre();
                Datos[2] = "" + mProducto.getPrecio();
                Datos[3] = mProducto.getDesc_Prod();

                LB_Precio.setText("" + mProducto.getPrecio());
                LB_TotalPago.setText("00.00");
                LB_Desc.setText(mProducto.getDesc_Prod());
                LB_Nombre.setText(mProducto.getNombre());
                LB_Proveedor.setText("-");

                modeloTabla.addRow(Datos);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el producto.");
            }
            this.Tabla_Ventas = new javax.swing.JTable();
            this.Tabla_Ventas.setModel(modeloTabla);

            this.Tabla_Ventas.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.Tabla_Ventas.getColumnModel().getColumn(1).setPreferredWidth(100);
            this.Tabla_Ventas.getColumnModel().getColumn(2).setPreferredWidth(400);
            this.Tabla_Ventas.getColumnModel().getColumn(3).setPreferredWidth(600);
            //this.Tabla_Ventas.getColumnModel().getColumn(4).setPreferredWidth(400);

            if (this.Tabla_Ventas.getRowCount() > 0) {
                this.Tabla_Ventas.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al consultar.");
        }
        mBD.desconectar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //Aquí para la venta...
        Producto nProducto = new Producto();
        mProducto.setCodigo(TXT_Folio.getText());

        mBD.conectar();
        Producto mProductoOld = mBD.ConsultaEspecificaProducto(TXT_Folio.getText());
        mBD.desconectar();

        //Restamos la cantidad.
        CantidadNueva = mProductoOld.getCantidadProducto() - Integer.parseInt(TXT_Cantidad.getText());

        nProducto.setNombre(LB_Nombre.getText());

        nProducto.setCantidadProducto(CantidadNueva);

        nProducto.setDesc_Prod(LB_Desc.getText());
        nProducto.setPrecio(Float.parseFloat(LB_Precio.getText()));
        nProducto.setId_proveedor(TXT_Folio.getText());
        CantidadNueva = 0;

        if (mBD.conectar()) {
            if (mBD.ModificarProductos(mProducto, nProducto)) {
                JOptionPane.showMessageDialog(null, "Productos añadidos...");
            } else {
                JOptionPane.showMessageDialog(null, "Error al añadir...");
            }
        }
        Venta mVentaConsultada = mBD.ConsultaTodaVenta(TXT_Folio.getText());

        mDetalleVenta.setCantidad(Float.parseFloat(TXT_Cantidad.getText()));
        mDetalleVenta.setPrecio(Float.parseFloat(LB_Precio.getText()));
        mDetalleVenta.setProducto_id_Producto(Integer.parseInt(mProducto.getCodigo()));
        mDetalleVenta.setVenta_id_Venta(RegistroVenta);

        TotalTemporal = Float.parseFloat(LB_Precio.getText()) * Float.parseFloat(TXT_Cantidad.getText());
        TotalCompleto = TotalTemporal + TotalCompleto;
        LB_TotalPago.setText(String.valueOf(TotalCompleto));

        if (mBD.AltaDetalleVenta(mDetalleVenta)) {
            JOptionPane.showMessageDialog(null, "Detalle venta guardado.");
        } else {
            JOptionPane.showMessageDialog(null, "Error detalle venta.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Venta mVentaAl = new Venta();
        
        mVenta.setId_venta(RegistroVenta);
        mVenta.setFolio(TXT_Folio.getText());
        mVenta.setPrecioTotalVenta(TotalCompleto);
        
        mVentaAl.setFolio(TXT_Folio.getText());
        mVentaAl.setPrecioTotalVenta(Float.parseFloat(LB_TotalPago.getText()));
        
        
        if (mBD.conectar()) {
            if (mBD.CambiosVenta(mVenta, mVenta)) {
                JOptionPane.showMessageDialog(null, "Nuevo precio en la venta...");
            } else {
                JOptionPane.showMessageDialog(null, "Error en nuevo precio de venta...");
            }
        }
        mBD.desconectar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String path = "/Users/jorgegarcia/NetBeansProjects/ElSolecito_Programa/src/Ventas/Reporte_Ventas.jasper";
        JasperReport jr = null;

        try {
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, mBD.conectare());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setTitle(path);
            this.dispose();
        } catch (JRException ex) {
            Logger.getLogger(FRM_Clientes_Alta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_Desc;
    private javax.swing.JLabel LB_Nombre;
    private javax.swing.JLabel LB_Precio;
    private javax.swing.JLabel LB_Proveedor;
    private javax.swing.JLabel LB_TotalPago;
    private javax.swing.JTextField TXT_Cantidad;
    private javax.swing.JTextField TXT_Folio;
    private javax.swing.JTable Tabla_Ventas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
