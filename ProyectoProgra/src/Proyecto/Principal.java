package Proyecto;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnMesa1 = new javax.swing.JButton();
        BtnMesa2 = new javax.swing.JButton();
        BtnMesa3 = new javax.swing.JButton();
        BtnMesa4 = new javax.swing.JButton();
        BtnMesa5 = new javax.swing.JButton();
        BtnMesa6 = new javax.swing.JButton();
        Logo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MT = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punto de Venta Comidas Rápidas");
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel1.setBackground(java.awt.Color.white);

        BtnMesa1.setBackground(new java.awt.Color(0, 0, 51));
        BtnMesa1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        BtnMesa1.setForeground(new java.awt.Color(255, 255, 0));
        BtnMesa1.setText("Mesa #1");
        BtnMesa1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BtnMesa1StateChanged(evt);
            }
        });
        BtnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa1ActionPerformed(evt);
            }
        });

        BtnMesa2.setBackground(new java.awt.Color(0, 0, 51));
        BtnMesa2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        BtnMesa2.setForeground(new java.awt.Color(255, 255, 0));
        BtnMesa2.setText("Mesa #2");
        BtnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa2ActionPerformed(evt);
            }
        });

        BtnMesa3.setBackground(new java.awt.Color(0, 0, 51));
        BtnMesa3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        BtnMesa3.setForeground(new java.awt.Color(255, 255, 0));
        BtnMesa3.setText("Mesa #3");
        BtnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa3ActionPerformed(evt);
            }
        });

        BtnMesa4.setBackground(new java.awt.Color(0, 0, 51));
        BtnMesa4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        BtnMesa4.setForeground(new java.awt.Color(255, 255, 0));
        BtnMesa4.setText("Mesa #4");
        BtnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa4ActionPerformed(evt);
            }
        });

        BtnMesa5.setBackground(new java.awt.Color(0, 0, 51));
        BtnMesa5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        BtnMesa5.setForeground(new java.awt.Color(255, 255, 0));
        BtnMesa5.setText("Mesa #5");
        BtnMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa5ActionPerformed(evt);
            }
        });

        BtnMesa6.setBackground(new java.awt.Color(0, 0, 51));
        BtnMesa6.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        BtnMesa6.setForeground(new java.awt.Color(255, 255, 0));
        BtnMesa6.setText("Mesa #6");
        BtnMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesa6ActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/LogoProyecto.JPG"))); // NOI18N
        Logo.setText("jButton7");
        Logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Bienvenidos");

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Punto de Venta Comidas Rápidas");

        BtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtnSalir.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(153, 0, 0));
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnMesa1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(BtnMesa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnMesa2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(BtnMesa5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 120, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                                .addGap(28, 28, 28))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnMesa4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(BtnSalir))
        );

        MT.setText("MantenimientoTargetas");
        MT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTActionPerformed(evt);
            }
        });

        jMenuItem3.setText("VISA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MT.add(jMenuItem3);

        jMenuItem2.setText("MASTERCARD");
        MT.add(jMenuItem2);

        jMenuItem1.setText("BAC");
        MT.add(jMenuItem1);

        jMenu2.setText("BCR");
        MT.add(jMenu2);

        jMenuBar1.add(MT);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMesa1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BtnMesa1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMesa1StateChanged

    private void BtnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa1ActionPerformed
        Mesa1 M1 = new Mesa1();
        M1.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_BtnMesa1ActionPerformed

    private void LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoActionPerformed

    private void BtnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa4ActionPerformed
        Mesa4 M4 = new Mesa4();
        M4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnMesa4ActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa2ActionPerformed
        Mesa2 M2 = new Mesa2();
        M2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnMesa2ActionPerformed

    private void BtnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa3ActionPerformed
        Mesa3 M3 = new Mesa3();
        M3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnMesa3ActionPerformed

    private void BtnMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa5ActionPerformed
        Mesa5 M5 = new Mesa5();
        M5.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnMesa5ActionPerformed

    private void BtnMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesa6ActionPerformed
        Mesa6 M6 = new Mesa6();
        M6.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnMesa6ActionPerformed

    private void MTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MTActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMesa1;
    private javax.swing.JButton BtnMesa2;
    private javax.swing.JButton BtnMesa3;
    private javax.swing.JButton BtnMesa4;
    private javax.swing.JButton BtnMesa5;
    private javax.swing.JButton BtnMesa6;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton Logo;
    public static javax.swing.JMenu MT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void despose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
