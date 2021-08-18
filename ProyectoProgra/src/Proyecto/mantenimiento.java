/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Getter_and_Setter.Precios;

/**
 *
 * @author PRINCIPAL
 */
public class mantenimiento extends javax.swing.JFrame {

    /**
     * Creates new form mantenimiento
     */
    public mantenimiento() {

        initComponents();
    }
    Precios P = new Precios(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        Fresca = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Tapequeño = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Tagrande = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Jugnaranja = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        FresMora = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Nagrandes = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        Cafe = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        Chocolate = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        burripequeños = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        Burrigrandes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Hamsim = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Hamdoble = new javax.swing.JTextField();
        jguardar_precios = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jByeBye = new javax.swing.JButton();
        Coca = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Pappequeña = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Papgrande = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Batfresa = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Batmora = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        Napequeños = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel18.setText("Fresca");

        Fresca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrescaActionPerformed(evt);
            }
        });

        jLabel19.setText("Taco pequeño");

        jLabel20.setText("Taco grande");

        jLabel21.setText("Jugo de Naranja");

        jLabel22.setText("Fresco de mora");

        jLabel28.setText("Nachos grandes");

        jLabel29.setText("Cafe");

        jLabel30.setText("Chocolate");

        jLabel31.setText("Burrito pequeño");

        jLabel32.setText("Burrito pequeño");

        jLabel6.setText("hambuerguesa simple");

        jLabel16.setText("Hamburguesa doble");

        jguardar_precios.setText("Guardar precios");
        jguardar_precios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jguardar_preciosActionPerformed(evt);
            }
        });

        jLabel17.setText("Coca Cola");

        jByeBye.setText("Salir");
        jByeBye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jByeByeActionPerformed(evt);
            }
        });

        Coca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocaActionPerformed(evt);
            }
        });

        jLabel23.setText("Papas pequeñas");

        jButton1.setText("Traer precios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel24.setText("Papas grandes");

        jLabel25.setText("Batido de fresa");

        jLabel26.setText("Batido de mora");

        Batmora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatmoraActionPerformed(evt);
            }
        });

        jLabel27.setText("Nachos pequeños");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16)
                            .addComponent(Hamdoble, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(Coca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(Fresca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hamsim, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(Tapequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(Tagrande, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(Jugnaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(FresMora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(Pappequeña, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(Papgrande, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(Batfresa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(Batmora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(Cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(Chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(Napequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nagrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(Burrigrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31)
                                    .addComponent(burripequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jguardar_precios)
                    .addComponent(jByeBye)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Hamsim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tapequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pappequeña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Napequeños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Hamdoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Coca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Fresca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Tagrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(56, 56, 56))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Jugnaranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FresMora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Papgrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Nagrandes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Batfresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Cafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Batmora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(burripequeños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Burrigrandes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jguardar_precios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jByeBye)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FrescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrescaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FrescaActionPerformed

    public void getter() {

        //comidas
        String hamsimple = Hamsim.getText();
        double phamsimple = Double.parseDouble(hamsimple);

        double phamdoble = Double.parseDouble(Hamdoble.getText().trim());

        double ptacopequeno = Double.parseDouble(Tapequeño.getText().trim());
        double ptacogrande = Double.parseDouble(Tagrande.getText().trim());

        double ppapaspequena = Double.parseDouble(Pappequeña.getText().trim());
        double ppapasgrande = Double.parseDouble(Papgrande.getText().trim());

        double pnachospequeno = Double.parseDouble(Napequeños.getText().trim());
        double pnachosgrande = Double.parseDouble(Nagrandes.getText().trim());

        double pburritospequeno = Double.parseDouble(burripequeños.getText().trim());
        double pburritosgrande = Double.parseDouble(Burrigrandes.getText().trim());
        //bebidas

        double pcoca_cola = Double.parseDouble(Coca.getText().trim());
        double p_fresca = Double.parseDouble(Fresca.getText().trim());

        double p_jugonaranja = Double.parseDouble(Jugnaranja.getText().trim());
        double p_frescomora = Double.parseDouble(FresMora.getText().trim());

        double p_batidofresa = Double.parseDouble(Batfresa.getText().trim());
        double p_batidomora = Double.parseDouble(Batmora.getText().trim());

        double p_cafe = Double.parseDouble(Cafe.getText().trim());
        double p_chocolate = Double.parseDouble(Chocolate.getText().trim());

        //Comidas
        P.setHamburguesa_sim(phamsimple);
        P.setHamburguesa_doble(phamdoble);

        P.setTaco_pequeno(ptacopequeno);
        P.setTaco_grande(ptacogrande);

        P.setPapas_pequeno(ppapaspequena);
        P.setPapas_grande(ppapasgrande);

        P.setNachos_pequeno(pnachospequeno);
        P.setNachos_grande(pnachosgrande);

        P.setBurrito_pequeno(pburritospequeno);
        P.setBurrito_grande(pburritosgrande);

        //bebidas
        P.setCoca_cola(pcoca_cola);
        P.setFresca(p_fresca);

        P.setJugo_naranja(p_jugonaranja);
        P.setFresco_mora(p_frescomora);

        P.setBatido_fresa(p_batidofresa);
        P.setBatido_mora(p_batidomora);

        P.setCafe(p_cafe);
        P.setChocolate(p_chocolate);
        System.out.println("cc" + P.getHamburguesa_sim());
    }


    private void jguardar_preciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jguardar_preciosActionPerformed

        getter();


    }//GEN-LAST:event_jguardar_preciosActionPerformed

    private void jByeByeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jByeByeActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jByeByeActionPerformed

    private void CocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CocaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //comidas

        String preciohamsimple = String.valueOf(1000.0);
        Hamsim.setText(preciohamsimple);
        String preciohamDoble = String.valueOf(2000.0);
        Hamdoble.setText(preciohamDoble);

        String precioTacospequeños = String.valueOf(1200.0);
        Tapequeño.setText(precioTacospequeños);
        String precioTacosgrandes = String.valueOf(1500.0);
        Tagrande.setText(precioTacosgrandes);

        String preciopapaspequeñas = String.valueOf(1300.0);
        Pappequeña.setText(preciopapaspequeñas);
        String preciopapasgrandes = String.valueOf(1600.0);
        Papgrande.setText(preciopapasgrandes);

        String precionachospequeños = String.valueOf(900.0);
        Napequeños.setText(precionachospequeños);
        String precionachosgrandes = String.valueOf(1350.0);
        Nagrandes.setText(precionachosgrandes);

        String precioburritospequeños = String.valueOf(1100.0);
        burripequeños.setText(precioburritospequeños);
        String precioburritosgrandes = String.valueOf(1700.0);
        Burrigrandes.setText(precioburritosgrandes);

        //bebidas
        String preciococacola = String.valueOf(1000.0);
        Coca.setText(preciococacola);
        String preciofresca = String.valueOf(1000.0);
        Fresca.setText(preciofresca);

        String preciojugodenaranja = String.valueOf(600.0);
        Jugnaranja.setText(preciojugodenaranja);
        String preciofrescodemora = String.valueOf(700.0);
        FresMora.setText(preciofrescodemora);

        String preciobatidodefresa = String.valueOf(1300.0);
        Batfresa.setText(preciobatidodefresa);
        String preciobatidodemora = String.valueOf(1350.0);
        Batmora.setText(preciobatidodemora);

        String preciocafe = String.valueOf(700.0);
        Cafe.setText(preciocafe);
        String preciochocolate = String.valueOf(850.0);
        Chocolate.setText(preciochocolate);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BatmoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatmoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BatmoraActionPerformed

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
            java.util.logging.Logger.getLogger(mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mantenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Batfresa;
    private javax.swing.JTextField Batmora;
    private javax.swing.JTextField Burrigrandes;
    private javax.swing.JTextField Cafe;
    private javax.swing.JTextField Chocolate;
    private javax.swing.JTextField Coca;
    private javax.swing.JTextField FresMora;
    private javax.swing.JTextField Fresca;
    private javax.swing.JTextField Hamdoble;
    public static javax.swing.JTextField Hamsim;
    private javax.swing.JTextField Jugnaranja;
    private javax.swing.JTextField Nagrandes;
    private javax.swing.JTextField Napequeños;
    private javax.swing.JTextField Papgrande;
    private javax.swing.JTextField Pappequeña;
    private javax.swing.JTextField Tagrande;
    private javax.swing.JTextField Tapequeño;
    private javax.swing.JTextField burripequeños;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jByeBye;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jguardar_precios;
    // End of variables declaration//GEN-END:variables
}
