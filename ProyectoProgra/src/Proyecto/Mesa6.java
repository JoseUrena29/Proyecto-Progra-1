/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Getter_and_Setter.Cantidades;
import Getter_and_Setter.Precios;
import javax.swing.JOptionPane;

/**
 *
 * @author José
 */
public class Mesa6 extends javax.swing.JFrame {

    /**
     * Creates new form Mesa1
     */
    public Mesa6() {
        initComponents();
    }

    Cantidades C = new Cantidades(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    Precios P = new Precios(1000.0, 2000.0, 1200.0, 1500.0, 1300.0, 1600.0, 900.0, 1350.0, 1100.0, 1700.0, 1000.0, 1000.0, 600.0, 700.0, 1300.0, 1350.0, 700.0, 850.0);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnInicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Comprar = new javax.swing.JButton();
        Tacos = new javax.swing.JButton();
        Hamburguesa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Burritos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PapasSupremas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        hamburguesaSimple = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        hamburguesaDoble = new javax.swing.JRadioButton();
        tacoPequeño = new javax.swing.JRadioButton();
        tacoGrande = new javax.swing.JRadioButton();
        papasPequeñas = new javax.swing.JRadioButton();
        papasGrandes = new javax.swing.JRadioButton();
        nachosPequeños = new javax.swing.JRadioButton();
        nachosGrandes = new javax.swing.JRadioButton();
        cantidadhamSimple = new javax.swing.JTextField();
        txtotal = new javax.swing.JTextField();
        cantidadhamDoble = new javax.swing.JTextField();
        cantidadtacoPequeño = new javax.swing.JTextField();
        cantidadtacoGrande = new javax.swing.JTextField();
        cantidadpapasPequeñas = new javax.swing.JTextField();
        cantidadpapasGrandes = new javax.swing.JTextField();
        cantidadnachosPequeños = new javax.swing.JTextField();
        cantidadnachosGrandes = new javax.swing.JTextField();
        Button3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        NachosSupremos = new javax.swing.JButton();
        burritosGrande = new javax.swing.JRadioButton();
        burritosPequeños = new javax.swing.JRadioButton();
        cantidadburritogrande = new javax.swing.JTextField();
        cantidadburritopequeño = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        OtrasBebidas = new javax.swing.JButton();
        Gaseosas = new javax.swing.JButton();
        RefrescoNatural = new javax.swing.JButton();
        Batidos = new javax.swing.JButton();
        CocaCola = new javax.swing.JRadioButton();
        cantidadcocacola = new javax.swing.JTextField();
        Fresca = new javax.swing.JRadioButton();
        cantidadfresca = new javax.swing.JTextField();
        JugoNaranja = new javax.swing.JRadioButton();
        cantidadjugonaranja = new javax.swing.JTextField();
        Frutas = new javax.swing.JRadioButton();
        cantidadfrescomora = new javax.swing.JTextField();
        BatidoMora = new javax.swing.JRadioButton();
        BatidoFresa = new javax.swing.JRadioButton();
        cantidadbatidomora = new javax.swing.JTextField();
        cantidadbatidofresa = new javax.swing.JTextField();
        Chocolate = new javax.swing.JRadioButton();
        Cafe = new javax.swing.JRadioButton();
        cantidadchocolate = new javax.swing.JTextField();
        cantidadcafe = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jTextField1 = new javax.swing.JTextField();
        jBGuardarcompra = new javax.swing.JButton();
        jButtonRefrescasrPrecios = new javax.swing.JButton();
        jTextPrecioHAmburguesasimple = new javax.swing.JTextField();
        jTextPrecioHamburguesadoble = new javax.swing.JTextField();
        jTextPrecio_taco_pequeño = new javax.swing.JTextField();
        jTextPrecio_taco_grande = new javax.swing.JTextField();
        jTextPrecio_papas_pequeño = new javax.swing.JTextField();
        jTextPrecio_papas_grandes = new javax.swing.JTextField();
        jTextPrecio_nachos_pequeño = new javax.swing.JTextField();
        jTextPrecio_nachos_grandes = new javax.swing.JTextField();
        jTextPrecio_burrito_pequeño = new javax.swing.JTextField();
        jTextPrecio_burrito_grande = new javax.swing.JTextField();
        jTextFieldCocacola = new javax.swing.JTextField();
        jTextFieldFresca = new javax.swing.JTextField();
        jTextFieldJugo_de_naranja = new javax.swing.JTextField();
        jTextFieldFresco_de_mora = new javax.swing.JTextField();
        jTextFieldBatido_de_fresa = new javax.swing.JTextField();
        jTextFieldBatido_de_mora = new javax.swing.JTextField();
        jTextFieldCafe = new javax.swing.JTextField();
        jTextFieldChocolate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Bienvenido a Mesa #6");

        BtnInicio.setBackground(new java.awt.Color(0, 0, 51));
        BtnInicio.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(255, 255, 0));
        BtnInicio.setText("Inicio");
        BtnInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BtnInicioStateChanged(evt);
            }
        });
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Bebidas");

        Comprar.setBackground(new java.awt.Color(0, 0, 51));
        Comprar.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        Comprar.setForeground(new java.awt.Color(255, 255, 0));
        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        Tacos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Tacos.jpg"))); // NOI18N
        Tacos.setText("jButton1");

        Hamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hamburguesa.JPG"))); // NOI18N
        Hamburguesa.setText("jButton1");
        Hamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HamburguesaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Tacos");

        Burritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/burritos.jpg"))); // NOI18N
        Burritos.setText("jButton1");
        Burritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurritosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Papas Supremas");

        PapasSupremas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Papas Supremas.png"))); // NOI18N
        PapasSupremas.setText("jButton1");

        jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Hamburguesas");

        hamburguesaSimple.setText("Hamburguesa Simple");
        hamburguesaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamburguesaSimpleActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Nachos Supremos");

        hamburguesaDoble.setText("Hamburguesa Doble");
        hamburguesaDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamburguesaDobleActionPerformed(evt);
            }
        });

        tacoPequeño.setText("Taco Pequeño");
        tacoPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tacoPequeñoActionPerformed(evt);
            }
        });

        tacoGrande.setText("Taco Grande");
        tacoGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tacoGrandeActionPerformed(evt);
            }
        });

        papasPequeñas.setText("Papas Pequeñas");
        papasPequeñas.setToolTipText("");
        papasPequeñas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papasPequeñasActionPerformed(evt);
            }
        });

        papasGrandes.setText("Papas Grandes");
        papasGrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papasGrandesActionPerformed(evt);
            }
        });

        nachosPequeños.setText("Nachos Pequeños");
        nachosPequeños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nachosPequeñosActionPerformed(evt);
            }
        });

        nachosGrandes.setText("Nachos Grandes");
        nachosGrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nachosGrandesActionPerformed(evt);
            }
        });

        cantidadhamSimple.setText("0");
        cantidadhamSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadhamSimpleActionPerformed(evt);
            }
        });

        txtotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        txtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotalActionPerformed(evt);
            }
        });

        cantidadhamDoble.setText("0");
        cantidadhamDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadhamDobleActionPerformed(evt);
            }
        });

        cantidadtacoPequeño.setText("0");

        cantidadtacoGrande.setText("0");
        cantidadtacoGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadtacoGrandeActionPerformed(evt);
            }
        });

        cantidadpapasPequeñas.setText("0");
        cantidadpapasPequeñas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadpapasPequeñasActionPerformed(evt);
            }
        });

        cantidadpapasGrandes.setText("0");
        cantidadpapasGrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadpapasGrandesActionPerformed(evt);
            }
        });

        cantidadnachosPequeños.setText("0");
        cantidadnachosPequeños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadnachosPequeñosActionPerformed(evt);
            }
        });

        cantidadnachosGrandes.setText("0");

        Button3.setBackground(new java.awt.Color(0, 0, 51));
        Button3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 10)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 255, 0));
        Button3.setText("Ver subtotal");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("Burritos");

        NachosSupremos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/nachos.jpg"))); // NOI18N
        NachosSupremos.setText("jButton1");
        NachosSupremos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NachosSupremosActionPerformed(evt);
            }
        });

        burritosGrande.setText("Burrito Grande");
        burritosGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burritosGrandeActionPerformed(evt);
            }
        });

        burritosPequeños.setText("Burrito Pequeño");
        burritosPequeños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burritosPequeñosActionPerformed(evt);
            }
        });

        cantidadburritogrande.setText("0");
        cantidadburritogrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadburritograndeActionPerformed(evt);
            }
        });

        cantidadburritopequeño.setText("0");
        cantidadburritopequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadburritopequeñoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("¿Que desea ordenar?");

        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Comidas");

        jLabel11.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("Subtotal de la Compra");

        jLabel12.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Gaseosas");

        jLabel13.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Fresco Natural");

        jLabel14.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("Batidos");

        jLabel15.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Otros");

        OtrasBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Cafe.jpg"))); // NOI18N
        OtrasBebidas.setText("jButton1");

        Gaseosas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Gaseosas.jpg"))); // NOI18N
        Gaseosas.setText("jButton1");

        RefrescoNatural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/FrescoNatural.jpg"))); // NOI18N
        RefrescoNatural.setText("jButton1");

        Batidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Batidos.jpg"))); // NOI18N
        Batidos.setText("jButton1");

        CocaCola.setText("Coca Cola");
        CocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocaColaActionPerformed(evt);
            }
        });

        cantidadcocacola.setText("0");
        cantidadcocacola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadcocacolaActionPerformed(evt);
            }
        });

        Fresca.setText("Fresca");
        Fresca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrescaActionPerformed(evt);
            }
        });

        cantidadfresca.setText("0");
        cantidadfresca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadfrescaActionPerformed(evt);
            }
        });

        JugoNaranja.setText("Jugo de Naranja");
        JugoNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugoNaranjaActionPerformed(evt);
            }
        });

        cantidadjugonaranja.setText("0");
        cantidadjugonaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadjugonaranjaActionPerformed(evt);
            }
        });

        Frutas.setText("Fresco de Mora");
        Frutas.setActionCommand("Fresco de Frutas");
        Frutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrutasActionPerformed(evt);
            }
        });

        cantidadfrescomora.setText("0");
        cantidadfrescomora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadfrescomoraActionPerformed(evt);
            }
        });

        BatidoMora.setText("Batido de Mora");
        BatidoMora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatidoMoraActionPerformed(evt);
            }
        });

        BatidoFresa.setText("Batido de Fresa");
        BatidoFresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatidoFresaActionPerformed(evt);
            }
        });

        cantidadbatidomora.setText("0");
        cantidadbatidomora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadbatidomoraActionPerformed(evt);
            }
        });

        cantidadbatidofresa.setText("0");
        cantidadbatidofresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadbatidofresaActionPerformed(evt);
            }
        });

        Chocolate.setText("Chocolate");
        Chocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChocolateActionPerformed(evt);
            }
        });

        Cafe.setText("Café");
        Cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CafeActionPerformed(evt);
            }
        });

        cantidadchocolate.setText("0");
        cantidadchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadchocolateActionPerformed(evt);
            }
        });

        cantidadcafe.setText("0");
        cantidadcafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadcafeActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("₡");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jBGuardarcompra.setText("Guardar");
        jBGuardarcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarcompraActionPerformed(evt);
            }
        });

        jButtonRefrescasrPrecios.setText("Refrescar precios");
        jButtonRefrescasrPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefrescasrPreciosActionPerformed(evt);
            }
        });

        jTextPrecioHAmburguesasimple.setEditable(false);
        jTextPrecioHAmburguesasimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrecioHAmburguesasimpleActionPerformed(evt);
            }
        });

        jTextPrecioHamburguesadoble.setEditable(false);

        jTextPrecio_taco_pequeño.setEditable(false);

        jTextPrecio_taco_grande.setEditable(false);

        jTextPrecio_papas_pequeño.setEditable(false);

        jTextPrecio_papas_grandes.setEditable(false);

        jTextPrecio_nachos_pequeño.setEditable(false);

        jTextPrecio_nachos_grandes.setEditable(false);

        jTextPrecio_burrito_pequeño.setEditable(false);

        jTextPrecio_burrito_grande.setEditable(false);

        jTextFieldCocacola.setEditable(false);

        jTextFieldFresca.setEditable(false);

        jTextFieldJugo_de_naranja.setEditable(false);

        jTextFieldFresco_de_mora.setEditable(false);

        jTextFieldBatido_de_fresa.setEditable(false);
        jTextFieldBatido_de_fresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBatido_de_fresaActionPerformed(evt);
            }
        });

        jTextFieldBatido_de_mora.setEditable(false);

        jTextFieldCafe.setEditable(false);

        jTextFieldChocolate.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cantidadcocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(hamburguesaSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextPrecioHamburguesadoble, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cantidadhamDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextPrecioHAmburguesasimple, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cantidadhamSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(hamburguesaDoble, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tacos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RefrescoNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextPrecio_taco_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cantidadtacoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tacoPequeño, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldJugo_de_naranja, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cantidadjugonaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextPrecio_taco_grande, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadtacoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JugoNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tacoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PapasSupremas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Batidos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jTextFieldBatido_de_mora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cantidadbatidomora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(BatidoMora, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextFieldBatido_de_fresa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cantidadbatidofresa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(BatidoFresa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(papasGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextPrecio_papas_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cantidadpapasPequeñas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(papasPequeñas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_papas_grandes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cantidadpapasGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OtrasBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cantidadchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cantidadcafe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(NachosSupremos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nachosGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_nachos_grandes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cantidadnachosGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_nachos_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cantidadnachosPequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nachosPequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(burritosGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Burritos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(burritosPequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_burrito_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cantidadburritopequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_burrito_grande, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cantidadburritogrande, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRefrescasrPrecios)
                                .addGap(83, 83, 83))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBGuardarcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(Button3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Gaseosas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldFresca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cantidadfresca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Fresca, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Frutas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldFresco_de_mora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cantidadfrescomora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Tacos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NachosSupremos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Burritos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PapasSupremas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(papasPequeñas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecio_papas_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadpapasPequeñas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(burritosPequeños)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecio_burrito_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadburritopequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(burritosGrande)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecio_burrito_grande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadburritogrande, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nachosPequeños)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecio_nachos_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadnachosPequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(nachosGrandes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecio_nachos_grandes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadnachosGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hamburguesaSimple)
                            .addComponent(tacoPequeño))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextPrecio_taco_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cantidadtacoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextPrecioHAmburguesasimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cantidadhamSimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tacoGrande)
                                .addComponent(papasGrandes))
                            .addComponent(hamburguesaDoble, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPrecioHamburguesadoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadhamDoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPrecio_taco_grande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadtacoGrande)
                            .addComponent(jTextPrecio_papas_grandes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadpapasGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Gaseosas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OtrasBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Batidos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonRefrescasrPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))
                                    .addComponent(RefrescoNatural, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BatidoFresa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldBatido_de_fresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(cantidadbatidofresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addComponent(BatidoMora)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldBatido_de_mora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cantidadbatidomora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Cafe)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jTextFieldCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cantidadcafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(Chocolate)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextFieldChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(cantidadchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(2, 2, 2))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(CocaCola)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jTextFieldCocacola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(cantidadcocacola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(Fresca, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(60, 60, 60)
                                                        .addComponent(Frutas)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldFresco_de_mora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cantidadfrescomora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldFresca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cantidadfresca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(0, 3, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(JugoNaranja)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldJugo_de_naranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadjugonaranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBGuardarcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadcafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadcafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadcafeActionPerformed

    private void cantidadchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadchocolateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadchocolateActionPerformed

    private void CafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CafeActionPerformed
        cantidadcafe.setText("");
    }//GEN-LAST:event_CafeActionPerformed

    private void ChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChocolateActionPerformed
        cantidadchocolate.setText("");
    }//GEN-LAST:event_ChocolateActionPerformed

    private void cantidadbatidofresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadbatidofresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadbatidofresaActionPerformed

    private void cantidadbatidomoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadbatidomoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadbatidomoraActionPerformed

    private void BatidoFresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatidoFresaActionPerformed
        cantidadbatidofresa.setText("");
    }//GEN-LAST:event_BatidoFresaActionPerformed

    private void BatidoMoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatidoMoraActionPerformed
        cantidadbatidomora.setText("");
    }//GEN-LAST:event_BatidoMoraActionPerformed

    private void cantidadfrescomoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadfrescomoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadfrescomoraActionPerformed

    private void FrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrutasActionPerformed
        cantidadfrescomora.setText("");
    }//GEN-LAST:event_FrutasActionPerformed

    private void cantidadjugonaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadjugonaranjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadjugonaranjaActionPerformed

    private void JugoNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugoNaranjaActionPerformed
        cantidadjugonaranja.setText("");
    }//GEN-LAST:event_JugoNaranjaActionPerformed

    private void cantidadfrescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadfrescaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadfrescaActionPerformed

    private void FrescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrescaActionPerformed
        cantidadfresca.setText("");
    }//GEN-LAST:event_FrescaActionPerformed

    private void cantidadcocacolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadcocacolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadcocacolaActionPerformed

    private void CocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocaColaActionPerformed
        cantidadcocacola.setText("");
    }//GEN-LAST:event_CocaColaActionPerformed

    private void cantidadburritopequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadburritopequeñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadburritopequeñoActionPerformed

    private void cantidadburritograndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadburritograndeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadburritograndeActionPerformed

    private void NachosSupremosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NachosSupremosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NachosSupremosActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed


        try {

            //COMIDAS
            Double total = C.getCantidadhamSimple() * P.getHamburguesa_sim();
            Double total2 = C.getCantidadhamdoble() * P.getHamburguesa_doble();
            Double total3 = C.getCantidadtacosPequeño() *P.getTaco_pequeno();
            Double total4 = C.getCantidadtacosGrande() * P.getTaco_grande();
            Double total5 = C.getCantidadpapasPequeñas() * P.getPapas_pequeno();
            Double total6 = C.getCantidadpapasGrandes() * P.getPapas_grande();
            Double total7 = C.getCantidadnachosPequeños() * P.getNachos_pequeno();
            Double total8 = C.getCantidadnachosGrandes() * P.getNachos_grande();
            Double total9 = C.getCantidadburritoPequeños() * P.getBurrito_pequeno();
            Double total10 = C.getCantidadburritosGrandes() * P.getBurrito_grande();

            //BEBIDAS
            Double total11 = C.getCantidadCocaCola() * P.getCoca_cola();
            Double total12 = C.getCantidadfresca() * P.getFresca();
            Double total13 = C.getCantidadFrescoDeNaranja() * P.getJugo_naranja();
            Double total14 = C.getCantidadFrescoDeMora() * P.getFresco_mora();
            Double total15 = C.getCantidadBatidoDeFresa() * P.getBatido_fresa();
            Double total16 = C.getCantidadBatidoDeMora() * P.getBatido_mora();
            Double total17 = C.getCantidadCafe() * P.getCafe();
            Double total18 = C.getCantidadChocolate() * P.getChocolate();

            Double subtotal = total + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10 + total11 + total12 + total13 + total14 + total15 + total16 + total17 + total18;
            String Subtotal = String.valueOf(subtotal);
            txtotal.setText(Subtotal);

            if (subtotal < 0) {
                JOptionPane.showMessageDialog(null, "Error numero negativo ", "MENSAJE", JOptionPane.WARNING_MESSAGE);
                txtotal.setText("");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en numero ingresado ", "MENSAJE", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_Button3ActionPerformed

    private void cantidadnachosPequeñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadnachosPequeñosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadnachosPequeñosActionPerformed

    private void cantidadpapasGrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadpapasGrandesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadpapasGrandesActionPerformed

    private void cantidadpapasPequeñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadpapasPequeñasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadpapasPequeñasActionPerformed

    private void cantidadtacoGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadtacoGrandeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadtacoGrandeActionPerformed

    private void cantidadhamDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadhamDobleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadhamDobleActionPerformed

    private void txtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotalActionPerformed

    private void cantidadhamSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadhamSimpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadhamSimpleActionPerformed

    private void papasGrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papasGrandesActionPerformed
        cantidadpapasGrandes.setText("");
    }//GEN-LAST:event_papasGrandesActionPerformed

    private void papasPequeñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papasPequeñasActionPerformed
        cantidadpapasPequeñas.setText("");
    }//GEN-LAST:event_papasPequeñasActionPerformed

    private void tacoPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tacoPequeñoActionPerformed
        cantidadtacoPequeño.setText("");
    }//GEN-LAST:event_tacoPequeñoActionPerformed

    private void hamburguesaDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamburguesaDobleActionPerformed
        cantidadhamDoble.setText("");
    }//GEN-LAST:event_hamburguesaDobleActionPerformed

    private void hamburguesaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamburguesaSimpleActionPerformed
        cantidadhamSimple.setText("");
    }//GEN-LAST:event_hamburguesaSimpleActionPerformed

    private void BurritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurritosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BurritosActionPerformed

    private void HamburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HamburguesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HamburguesaActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed

        Factura f = new Factura();
        f.setVisible(true);
        this.dispose();
        Factura.txtrecibirsubtotal.setText(txtotal.getText());
    }//GEN-LAST:event_ComprarActionPerformed

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        Principal P = new Principal();
        P.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BtnInicioStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInicioStateChanged

    private void tacoGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tacoGrandeActionPerformed
        cantidadtacoGrande.setText("");
    }//GEN-LAST:event_tacoGrandeActionPerformed

    private void nachosPequeñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachosPequeñosActionPerformed
        cantidadnachosPequeños.setText("");
    }//GEN-LAST:event_nachosPequeñosActionPerformed

    private void nachosGrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachosGrandesActionPerformed
        cantidadnachosGrandes.setText("");
    }//GEN-LAST:event_nachosGrandesActionPerformed

    private void burritosPequeñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burritosPequeñosActionPerformed
        cantidadburritopequeño.setText("");
    }//GEN-LAST:event_burritosPequeñosActionPerformed

    private void burritosGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burritosGrandeActionPerformed
        cantidadburritogrande.setText("");
    }//GEN-LAST:event_burritosGrandeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
//////////////////////////////////////////////////Crear los setter////////////////////////////////
    private void jBGuardarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarcompraActionPerformed
        //comidas
        double cantidadhamsimple = Double.parseDouble(cantidadhamSimple.getText().trim());
        double cantidadhamdoble = Double.parseDouble(cantidadhamDoble.getText().trim());

        double cantidadtacopequeno = Double.parseDouble(cantidadtacoPequeño.getText().trim());
        double cantidadtacogrande = Double.parseDouble(cantidadtacoGrande.getText().trim());

        double cantidadpapaspequena = Double.parseDouble(cantidadpapasPequeñas.getText().trim());
        double cantidadpapasgrande = Double.parseDouble(cantidadpapasGrandes.getText().trim());

        double cantidadnachospequeno = Double.parseDouble(cantidadnachosPequeños.getText().trim());
        double cantidadnachosgrande = Double.parseDouble(cantidadnachosGrandes.getText().trim());

        double cantidadburritospequeno = Double.parseDouble(cantidadburritopequeño.getText().trim());
        double cantidadburritosgrande = Double.parseDouble(cantidadburritogrande.getText().trim());
        //bebidas

        double cantidadcoca_cola = Double.parseDouble(cantidadcocacola.getText().trim());
        double cantidad_fresca = Double.parseDouble(cantidadfresca.getText().trim());

        double cantidad_jugonaranja = Double.parseDouble(cantidadjugonaranja.getText().trim());
        double cantidad_frescomora = Double.parseDouble(cantidadfrescomora.getText().trim());

        double cantidad_batidofresa = Double.parseDouble(cantidadbatidofresa.getText().trim());
        double cantidad_batidomora = Double.parseDouble(cantidadbatidomora.getText().trim());

        double cantidad_cafe = Double.parseDouble(cantidadcafe.getText().trim());
        double cantidad_chocolate = Double.parseDouble(cantidadchocolate.getText().trim());

        //Comidas
        C.setCantidadhamSimple(cantidadhamsimple);
        C.setCantidadhamdoble(cantidadhamdoble);

        C.setCantidadtacosPequeño(cantidadtacopequeno);
        C.setCantidadtacosGrande(cantidadtacogrande);

        C.setCantidadpapasPequeñas(cantidadpapaspequena);
        C.setCantidadpapasGrandes(cantidadpapasgrande);

        C.setCantidadnachosPequeños(cantidadnachospequeno);
        C.setCantidadnachosGrandes(cantidadnachosgrande);

        C.setCantidadburritoPequeños(cantidadburritospequeno);
        C.setCantidadburritosGrandes(cantidadburritosgrande);

        //bebidas
        C.setCantidadCocaCola(cantidadcoca_cola);
        C.setCantidadfresca(cantidad_fresca);

        C.setCantidadFrescoDeNaranja(cantidad_jugonaranja);
        C.setCantidadFrescoDeMora(cantidad_frescomora);
        
        C.setCantidadBatidoDeFresa(cantidad_batidofresa);
        C.setCantidadBatidoDeMora(cantidad_batidomora);

        C.setCantidadCafe(cantidad_cafe);
        C.setCantidadChocolate(cantidad_chocolate);


    }//GEN-LAST:event_jBGuardarcompraActionPerformed

    private void jTextPrecioHAmburguesasimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrecioHAmburguesasimpleActionPerformed

    }//GEN-LAST:event_jTextPrecioHAmburguesasimpleActionPerformed

    private void jButtonRefrescasrPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefrescasrPreciosActionPerformed
        //comidas
        String preciohamsimple = String.valueOf(P.getHamburguesa_sim());
        jTextPrecioHAmburguesasimple.setText("Precio = ¢" + preciohamsimple);
        String preciohamDoble = String.valueOf(P.getHamburguesa_doble());
        jTextPrecioHamburguesadoble.setText("Precio = ¢" + preciohamDoble);

        String precioTacospequeños = String.valueOf(P.getTaco_pequeno());
        jTextPrecio_taco_pequeño.setText("Precio = ¢" + precioTacospequeños);
        String precioTacosgrandes = String.valueOf(P.getTaco_grande());
        jTextPrecio_taco_grande.setText("Precio = ¢" + precioTacosgrandes);

        String preciopapaspequeñas = String.valueOf(P.getPapas_pequeno());
        jTextPrecio_papas_pequeño.setText("Precio = ¢" + preciopapaspequeñas);
        String preciopapasgrandes = String.valueOf(P.getPapas_grande());
        jTextPrecio_papas_grandes.setText("Precio = ¢" + preciopapasgrandes);

        String precionachospequeños = String.valueOf(P.getNachos_pequeno());
        jTextPrecio_nachos_pequeño.setText("Precio = ¢" + precionachospequeños);
        String precionachosgrandes = String.valueOf(P.getNachos_grande());
        jTextPrecio_nachos_grandes.setText("Precio = ¢" + precionachosgrandes);

        String precioburritospequeños = String.valueOf(P.getBurrito_pequeno());
        jTextPrecio_burrito_pequeño.setText("Precio = ¢" + precioburritospequeños);
        String precioburritosgrandes = String.valueOf(P.getBurrito_grande());
        jTextPrecio_burrito_grande.setText("Precio = ¢" + precioburritosgrandes);
        
        //bebidas
        String preciococacola = String.valueOf(P.getCoca_cola());
        jTextFieldCocacola.setText("Precio = ¢" +preciococacola);
        String preciofresca = String.valueOf(P.getFresca());
        jTextFieldFresca.setText("Precio = ¢" +preciofresca);
        
        String preciojugodenaranja = String.valueOf(P.getJugo_naranja());
        jTextFieldJugo_de_naranja.setText("Precio = ¢" +preciojugodenaranja);
        String preciofrescodemora = String.valueOf(P.getFresco_mora());
        jTextFieldFresco_de_mora.setText("Precio = ¢" +preciofrescodemora);
        
        String preciobatidodefresa = String.valueOf(P.getBatido_fresa());
        jTextFieldBatido_de_fresa.setText("Precio = ¢" +preciobatidodefresa);
        String preciobatidodemora = String.valueOf(P.getBatido_mora());
        jTextFieldBatido_de_mora.setText("Precio = ¢" +preciobatidodemora);
        
        String preciocafe = String.valueOf(P.getCafe());
        jTextFieldCafe.setText("Precio = ¢" +preciocafe);
        String preciochocolate = String.valueOf(P.getChocolate());
        jTextFieldChocolate.setText("Precio = ¢" +preciochocolate);
        
        
    }//GEN-LAST:event_jButtonRefrescasrPreciosActionPerformed

    private void jTextFieldBatido_de_fresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBatido_de_fresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBatido_de_fresaActionPerformed

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
            java.util.logging.Logger.getLogger(Mesa6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BatidoFresa;
    private javax.swing.JRadioButton BatidoMora;
    private javax.swing.JButton Batidos;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton Burritos;
    private javax.swing.JButton Button3;
    private javax.swing.JRadioButton Cafe;
    private javax.swing.JRadioButton Chocolate;
    private javax.swing.JRadioButton CocaCola;
    private javax.swing.JButton Comprar;
    private javax.swing.JRadioButton Fresca;
    private javax.swing.JRadioButton Frutas;
    private javax.swing.JButton Gaseosas;
    private javax.swing.JButton Hamburguesa;
    private javax.swing.JRadioButton JugoNaranja;
    private javax.swing.JButton NachosSupremos;
    private javax.swing.JButton OtrasBebidas;
    private javax.swing.JButton PapasSupremas;
    private javax.swing.JButton RefrescoNatural;
    private javax.swing.JButton Tacos;
    private javax.swing.JRadioButton burritosGrande;
    private javax.swing.JRadioButton burritosPequeños;
    private javax.swing.JTextField cantidadbatidofresa;
    private javax.swing.JTextField cantidadbatidomora;
    private javax.swing.JTextField cantidadburritogrande;
    private javax.swing.JTextField cantidadburritopequeño;
    private javax.swing.JTextField cantidadcafe;
    private javax.swing.JTextField cantidadchocolate;
    private javax.swing.JTextField cantidadcocacola;
    private javax.swing.JTextField cantidadfresca;
    private javax.swing.JTextField cantidadfrescomora;
    private javax.swing.JTextField cantidadhamDoble;
    private javax.swing.JTextField cantidadhamSimple;
    private javax.swing.JTextField cantidadjugonaranja;
    private javax.swing.JTextField cantidadnachosGrandes;
    private javax.swing.JTextField cantidadnachosPequeños;
    private javax.swing.JTextField cantidadpapasGrandes;
    private javax.swing.JTextField cantidadpapasPequeñas;
    private javax.swing.JTextField cantidadtacoGrande;
    private javax.swing.JTextField cantidadtacoPequeño;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JRadioButton hamburguesaDoble;
    private javax.swing.JRadioButton hamburguesaSimple;
    private javax.swing.JButton jBGuardarcompra;
    private javax.swing.JButton jButtonRefrescasrPrecios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldBatido_de_fresa;
    private javax.swing.JTextField jTextFieldBatido_de_mora;
    private javax.swing.JTextField jTextFieldCafe;
    private javax.swing.JTextField jTextFieldChocolate;
    private javax.swing.JTextField jTextFieldCocacola;
    private javax.swing.JTextField jTextFieldFresca;
    private javax.swing.JTextField jTextFieldFresco_de_mora;
    private javax.swing.JTextField jTextFieldJugo_de_naranja;
    private javax.swing.JTextField jTextPrecioHAmburguesasimple;
    private javax.swing.JTextField jTextPrecioHamburguesadoble;
    private javax.swing.JTextField jTextPrecio_burrito_grande;
    private javax.swing.JTextField jTextPrecio_burrito_pequeño;
    private javax.swing.JTextField jTextPrecio_nachos_grandes;
    private javax.swing.JTextField jTextPrecio_nachos_pequeño;
    private javax.swing.JTextField jTextPrecio_papas_grandes;
    private javax.swing.JTextField jTextPrecio_papas_pequeño;
    private javax.swing.JTextField jTextPrecio_taco_grande;
    private javax.swing.JTextField jTextPrecio_taco_pequeño;
    private javax.swing.JRadioButton nachosGrandes;
    private javax.swing.JRadioButton nachosPequeños;
    private javax.swing.JRadioButton papasGrandes;
    private javax.swing.JRadioButton papasPequeñas;
    private javax.swing.JRadioButton tacoGrande;
    private javax.swing.JRadioButton tacoPequeño;
    private javax.swing.JTextField txtotal;
    // End of variables declaration//GEN-END:variables
}
