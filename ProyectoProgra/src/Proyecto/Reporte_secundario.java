/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import static Proyecto.Componentes.productos;
import java.awt.Desktop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;



/**
 *
 * @author PRINCIPAL
 */
public class Reporte_secundario extends javax.swing.JFrame {

    /**
     * Creates new form Reporte_secundario
     */
    public Reporte_secundario() {
        initComponents();
        jComboBoxTarjetasSecundario.addItem("Efectivo");
        jComboBoxTarjetasSecundario.addItem("Visa");
        jComboBoxTarjetasSecundario.addItem("Mastercard");
        jComboBoxTarjetasSecundario.addItem("BAC");
        jComboBoxTarjetasSecundario.addItem("BCR");
        Fecha();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TxtPago_Secundario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtCambio_Secundario = new javax.swing.JTextField();
        TxtSubSecundario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TxtFecha_Secundario = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtNombre_Secundario = new javax.swing.JTextField();
        TxtApellido_Secundario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablasecundaria = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        TxtTotalCompraSecundaria = new javax.swing.JTextField();
        jComboBoxTarjetasSecundario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Subtotal de la compra.");

        TxtPago_Secundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPago_SecundarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Metodo de pago.");

        TxtCambio_Secundario.setEditable(false);
        TxtCambio_Secundario.setBackground(new java.awt.Color(255, 255, 255));
        TxtCambio_Secundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCambio_SecundarioActionPerformed(evt);
            }
        });

        TxtSubSecundario.setEditable(false);
        TxtSubSecundario.setBackground(new java.awt.Color(255, 255, 255));
        TxtSubSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSubSecundarioActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pagar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setText("Fecha:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TxtFecha_Secundario.setEditable(false);
        TxtFecha_Secundario.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Abrir reporte");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Generar reporte");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("nombre del cliente");

        jLabel12.setText("apellido del cliente");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Total de la compra.");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setText("Ingresar el pago.");

        Tablasecundaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio unitario", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(Tablasecundaria);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Cambio:");

        TxtTotalCompraSecundaria.setEditable(false);
        TxtTotalCompraSecundaria.setBackground(new java.awt.Color(255, 255, 255));

        jComboBoxTarjetasSecundario.setToolTipText("");
        jComboBoxTarjetasSecundario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTarjetasSecundarioItemStateChanged(evt);
            }
        });
        jComboBoxTarjetasSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTarjetasSecundarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtApellido_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtSubSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxTarjetasSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(43, 43, 43)
                                .addComponent(TxtTotalCompraSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCambio_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TxtPago_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(TxtFecha_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFecha_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtNombre_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtApellido_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtTotalCompraSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPago_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCambio_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtSubSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTarjetasSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPago_SecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPago_SecundarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPago_SecundarioActionPerformed

    private void TxtCambio_SecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCambio_SecundarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCambio_SecundarioActionPerformed

    private void TxtSubSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSubSecundarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSubSecundarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Double.parseDouble(TxtPago_Secundario.getText().trim()) < Double.parseDouble(TxtTotalCompraSecundaria.getText())) {
            JOptionPane.showMessageDialog(rootPane, "El monto digitado es menor al total de la compra", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            TxtPago_Secundario.setText("");
            TxtCambio_Secundario.setText("");

        } else {
            Double pago = Double.parseDouble(TxtPago_Secundario.getText().trim());
            Double total = Double.parseDouble(TxtTotalCompraSecundaria.getText());
            Double cambio = pago - total;

            TxtCambio_Secundario.setText(String.valueOf(cambio));

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tarjetas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            File ruta = new File(TxtNombre_Secundario.getText() + TxtApellido_Secundario.getText() + "Comprobante" + ".pdf");
            Desktop.getDesktop().open(ruta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No existe el comprobrante solicitado, por favor verifique los datos seleccionados");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Reporte_2 reporte_2 = new Reporte_2(TxtNombre_Secundario.getText(), TxtApellido_Secundario.getText(), TxtFecha_Secundario.getText(), productos, "src\\Imagenes\\comprobante.png", TxtTotalCompraSecundaria.getText(), TxtCambio_Secundario.getText());
        reporte_2.crearReporte_2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBoxTarjetasSecundarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTarjetasSecundarioItemStateChanged

    }//GEN-LAST:event_jComboBoxTarjetasSecundarioItemStateChanged

    private void jComboBoxTarjetasSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTarjetasSecundarioActionPerformed

    }//GEN-LAST:event_jComboBoxTarjetasSecundarioActionPerformed
    public void tarjetas() {
        Double iva = 0.13;
        Double Visa = 0.10;
        Double Mastercard = 0.15;
        Double BAC = 0.13;
        Double BCR = 0.09;
        
        

        String descuentos = (String) jComboBoxTarjetasSecundario.getSelectedItem();

        //PAGO EN EFECTIVO
        if (descuentos.equals("Efectivo")) {
            double totalcompra = Double.parseDouble(TxtSubSecundario.getText().trim());
            double totaliva = totalcompra * iva;
            double total = totalcompra + totaliva;
            TxtTotalCompraSecundaria.setText(String.valueOf(total));
        }

        //DESCUENTO TARJETA VISA
        if (descuentos.equals("Visa")) {

            double totalcompra = Double.parseDouble(TxtSubSecundario.getText().trim());

            double descuentovisa = totalcompra * Visa;
            double totaldescuentovisa = totalcompra - descuentovisa;

            double totaliva = totaldescuentovisa * iva;
            double total = totaldescuentovisa + totaliva;

            TxtTotalCompraSecundaria.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 10% en la compra por el pago con Tarjeta VISA", "Descuento Visa", JOptionPane.INFORMATION_MESSAGE);
        }

        //DESCUENTO TARJETA MASTERCARD
        if (descuentos.equals("Mastercard")) {

            double totalcompra = Double.parseDouble(TxtSubSecundario.getText().trim());

            double descuentomastercard = totalcompra * Mastercard;
            double totaldescuentomastercard = totalcompra - descuentomastercard;

            double totaliva = totaldescuentomastercard * iva;
            double total = totaldescuentomastercard + totaliva;

            TxtTotalCompraSecundaria.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 15% en la compra por el pago con Tarjeta Mastercard", "Descuento Mastercard", JOptionPane.INFORMATION_MESSAGE);
        }

        //DESCUENTO TARJETA BAC
        if (descuentos.equals("BAC")) {
            double totalcompra = Double.parseDouble(TxtSubSecundario.getText().trim());

            double descuentoBAC = totalcompra * BAC;
            double totaldescuentoBAC = totalcompra - descuentoBAC;

            double totaliva = totaldescuentoBAC * iva;
            double total = totaldescuentoBAC + totaliva;

            TxtTotalCompraSecundaria.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 13% en la compra por el pago con Tarjeta BAC", "Descuento BAC", JOptionPane.INFORMATION_MESSAGE);
        }

        //DESCUENTO TARJETA BCR
        if (descuentos.equals("BCR")) {
            double totalcompra = Double.parseDouble(TxtSubSecundario.getText().trim());

            double descuentoBCR = totalcompra * BCR;
            double totaldescuentoBCR = totalcompra - descuentoBCR;

            double totaliva = totaldescuentoBCR * iva;
            double total = totaldescuentoBCR + totaliva;

            TxtTotalCompraSecundaria.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 9% en la compra por el pago con Tarjeta BCR", "Descuento BCR", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void Fecha (){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/dd/YYYY");

        TxtFecha_Secundario.setText(formatoFecha.format(fecha));

        Calendar calendario = Calendar.getInstance();

        calendario.setTime(fecha);

        String dia = calendario.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("es", "ES"));

        int horas = calendario.get(Calendar.HOUR);
        int minutos = calendario.get(Calendar.MINUTE);

        TxtFecha_Secundario.setText("Día:   " + dia + "   Hora:  " + horas + "  con  " + minutos + "   Minutos.   ");
    }    public void fecha (){
         Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/dd/YYYY");

        TxtFecha_Secundario.setText(formatoFecha.format(fecha));

        Calendar calendario = Calendar.getInstance();

        calendario.setTime(fecha);

        String dia = calendario.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("es", "ES"));

        int horas = calendario.get(Calendar.HOUR);
        int minutos = calendario.get(Calendar.MINUTE);

        TxtFecha_Secundario.setText("Día:   " + dia + "   Hora:  " + horas + "  con  " + minutos + "   Minutos.   ");
    }
    
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
            java.util.logging.Logger.getLogger(Reporte_secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_secundario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Tablasecundaria;
    private javax.swing.JTextField TxtApellido_Secundario;
    private javax.swing.JTextField TxtCambio_Secundario;
    private javax.swing.JTextField TxtFecha_Secundario;
    private javax.swing.JTextField TxtNombre_Secundario;
    private javax.swing.JTextField TxtPago_Secundario;
    public static javax.swing.JTextField TxtSubSecundario;
    private javax.swing.JTextField TxtTotalCompraSecundaria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JComboBox<String> jComboBoxTarjetasSecundario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
