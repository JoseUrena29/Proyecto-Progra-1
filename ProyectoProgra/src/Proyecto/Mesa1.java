/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Getter_and_Setter.Cantidades;
import Getter_and_Setter.Datos;
import Getter_and_Setter.Precios;
import javax.swing.JOptionPane;

/**
 *
 * @author José
 */
public class Mesa1 extends javax.swing.JFrame {

    /**
     * Creates new form Mesa1
     */
    public Mesa1() {
        initComponents();
    }

    Cantidades C = new Cantidades(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    Precios P = new Precios(1000.0, 2000.0, 1200.0, 1500.0, 1300.0, 1600.0, 900.0, 1350.0, 1100.0, 1700.0, 1000.0, 1000.0, 600.0, 700.0, 1300.0, 1350.0, 700.0, 850.0);

    
    public void cargarproductos(){
    try {
            String hamburguesasimple = "";
            String hamburguesadoble = "";
            String tacopequeño = "";
            String tacogrande = "";
            String papaspequeñas= "";
            String papasgrandes= "";
            String nachospequeños= "";
            String nachosgrandes= "";
            String burritopequeño= "";
            String burritogrande= "";
            String cocacola= "";
            String fresca= "";
            String jugonaranja= "";
            String frescomora= "";
            String batidofresa= "";
            String batidomora= "";
            String cafe= "";
            String chocolate= "";
            
            if(Rbhamburguesasimple.isSelected()){
                hamburguesasimple = "Hamburguesa Simple";
                int cantidadhamsimple = Integer.parseInt(Txtcantidadhamsimple.getText());
  
                Datos H_Simple = new Datos();
                H_Simple.setProductos(hamburguesasimple);
                H_Simple.setCantidad(cantidadhamsimple);
                
                Componentes.productos.add(H_Simple);
            }
                  
            if(Rbhamburguesadoble.isSelected()){
                hamburguesadoble = "Hamburguesa Doble";
                int cantidadhamdoble = Integer.parseInt(Txtcantidadhamdoble.getText());

                Datos H_Doble = new Datos();
                H_Doble.setProductos(hamburguesadoble);
                H_Doble.setCantidad(cantidadhamdoble);
                
                Componentes.productos.add(H_Doble);
            }
            
            if(Rbtacopequeño.isSelected()){
                tacopequeño = "Taco Pequeño";
                int cantidadtacopequeño = Integer.parseInt(Txtcantidadtacopequeño.getText());
                
                Datos T_Pequeño = new Datos();
                T_Pequeño.setProductos(tacopequeño);
                T_Pequeño.setCantidad(cantidadtacopequeño);
                
                Componentes.productos.add(T_Pequeño);
            }
            
            if(Rbtacogrande.isSelected()){
                tacogrande = "Taco Grande";
                int cantidadtacopequeño = Integer.parseInt(Txtcantidadtacogrande.getText());
                
                Datos T_Grande = new Datos();
                T_Grande.setProductos(tacogrande);
                T_Grande.setCantidad(cantidadtacopequeño);
                
                Componentes.productos.add(T_Grande);
            }
            
            if(Rbpapaspequeñas.isSelected()){
                papaspequeñas = "Papas Pequeñas";
                int cantidadpapaspequeñas = Integer.parseInt(Txtcantidadpapaspequeñas.getText());
                
                Datos P_Pequeñas = new Datos();
                P_Pequeñas.setProductos(papaspequeñas);
                P_Pequeñas.setCantidad(cantidadpapaspequeñas);
                
                Componentes.productos.add(P_Pequeñas);
            }
            
            if(Rbpapasgrandes.isSelected()){
                papasgrandes = "Papas Grandes";
                int cantidadpapasgrandes = Integer.parseInt(Txtcantidadpapasgrandes.getText());
                
                Datos P_Grandes = new Datos();
                P_Grandes.setProductos(papasgrandes);
                P_Grandes.setCantidad(cantidadpapasgrandes);
                
                Componentes.productos.add(P_Grandes);
            }
            
            if(Rbnachospequeños.isSelected()){
                nachospequeños = "Nachos Pequeños";
                int cantidadnachospequeños = Integer.parseInt(Txtcantidadnachospequeños.getText());
                
                Datos N_Pequeños = new Datos();
                N_Pequeños.setProductos(nachospequeños);
                N_Pequeños.setCantidad(cantidadnachospequeños);
                
                Componentes.productos.add(N_Pequeños);
            }
            
            if(Rbnachosgrandes.isSelected()){
                nachosgrandes = "Nachos Grandes";
                int cantidadnachosgrandes = Integer.parseInt(Txtcantidadnachosgrandes.getText());
                
                Datos N_Grandes = new Datos();
                N_Grandes.setProductos(nachosgrandes);
                N_Grandes.setCantidad(cantidadnachosgrandes);
                
                Componentes.productos.add(N_Grandes);
            }
            
            if(Rbburritopequeño.isSelected()){
                burritopequeño = "Burrito Pequeño";
                int cantidadburritopequeño = Integer.parseInt(Txtcantidadburritopequeño.getText());
                
                Datos B_Pequeño = new Datos();
                B_Pequeño.setProductos(burritopequeño);
                B_Pequeño.setCantidad(cantidadburritopequeño);
                
                Componentes.productos.add(B_Pequeño);
            }
            
            if(Rbburritogrande.isSelected()){
                burritogrande = "Burrito Grande";
                int cantidadburritogrande = Integer.parseInt(Txtcantidadburritogrande.getText());
                
                Datos B_Grande = new Datos();
                B_Grande.setProductos(burritogrande);
                B_Grande.setCantidad(cantidadburritogrande);
                
                Componentes.productos.add(B_Grande);
            }
            
            if(Rbcocacola.isSelected()){
                cocacola = "Gaseosa Coca-Cola";
                int cantidadcocacola = Integer.parseInt(Txtcantidadcocacola.getText());
                
                Datos Cocacola = new Datos();
                Cocacola.setProductos(cocacola);
                Cocacola.setCantidad(cantidadcocacola);
                
                Componentes.productos.add(Cocacola);
            }
            
            if(Rbfresca.isSelected()){
                fresca = "Gaseosa Fresca";
                int cantidadfresca = Integer.parseInt(Txtcantidadfresca.getText());
                
                Datos Fresca = new Datos();
                Fresca.setProductos(fresca);
                Fresca.setCantidad(cantidadfresca);
                
                Componentes.productos.add(Fresca);
            }
            
            if(Rbjugonaranja.isSelected()){
                jugonaranja = "Jugo de Naranja";
                int cantidadjugonaranja = Integer.parseInt(Txtcantidadjugonaranja.getText());
                
                Datos Jugo_Naranja = new Datos();
                Jugo_Naranja.setProductos(jugonaranja);
                Jugo_Naranja.setCantidad(cantidadjugonaranja);
                
                Componentes.productos.add(Jugo_Naranja);
            }
            
            if(Rbfrescomora.isSelected()){
                frescomora = "Fresco de Mora";
                int cantidadfrescomora = Integer.parseInt(Txtcantidadfrescomora.getText());
                
                Datos Fresco_Mora = new Datos();
                Fresco_Mora.setProductos(frescomora);
                Fresco_Mora.setCantidad(cantidadfrescomora);
                
                Componentes.productos.add(Fresco_Mora);
            }
            
            if(Rbbatidofresa.isSelected()){
                batidofresa = "Batido de Fresa";
                int cantidadbatidofresa = Integer.parseInt(Txtcantidadbatidofresa.getText());
                
                Datos Batido_Fresa = new Datos();
                Batido_Fresa.setProductos(batidofresa);
                Batido_Fresa.setCantidad(cantidadbatidofresa);
                
                Componentes.productos.add(Batido_Fresa);
            }
            
            if(Rbbatidofresa.isSelected()){
                batidomora = "Batido de Mora";
                int cantidadbatidomora = Integer.parseInt(Txtcantidadbatidomora.getText());
                
                Datos Batido_Mora = new Datos();
                Batido_Mora.setProductos(batidomora);
                Batido_Mora.setCantidad(cantidadbatidomora);
                
                Componentes.productos.add(Batido_Mora);
            }
            
            if(Rbcafe.isSelected()){
                cafe = "Café";
                int cantidadcafe = Integer.parseInt(Txtcantidadcafe.getText());
                
                Datos Cafe = new Datos();
                Cafe.setProductos(cafe);
                Cafe.setCantidad(cantidadcafe);
                
                Componentes.productos.add(Cafe);
            }
            
            if(Rbchocolate.isSelected()){
                chocolate = "Chocolate";
                int cantidadchocolate = Integer.parseInt(Txtcantidadchocolate.getText());
                
                Datos Chocolate = new Datos();
                Chocolate.setProductos(chocolate);
                Chocolate.setCantidad(cantidadchocolate);
                
                Componentes.productos.add(Chocolate);
            }
                           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Verifique los productos agregados en la mesa","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnInicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ButtonComprar = new javax.swing.JButton();
        Tacos = new javax.swing.JButton();
        Hamburguesa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Burritos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PapasSupremas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Rbhamburguesasimple = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        Rbhamburguesadoble = new javax.swing.JRadioButton();
        Rbtacopequeño = new javax.swing.JRadioButton();
        Rbtacogrande = new javax.swing.JRadioButton();
        Rbpapaspequeñas = new javax.swing.JRadioButton();
        Rbpapasgrandes = new javax.swing.JRadioButton();
        Rbnachospequeños = new javax.swing.JRadioButton();
        Rbnachosgrandes = new javax.swing.JRadioButton();
        Txtcantidadhamsimple = new javax.swing.JTextField();
        txtotal = new javax.swing.JTextField();
        Txtcantidadhamdoble = new javax.swing.JTextField();
        Txtcantidadtacopequeño = new javax.swing.JTextField();
        Txtcantidadtacogrande = new javax.swing.JTextField();
        Txtcantidadpapaspequeñas = new javax.swing.JTextField();
        Txtcantidadpapasgrandes = new javax.swing.JTextField();
        Txtcantidadnachospequeños = new javax.swing.JTextField();
        Txtcantidadnachosgrandes = new javax.swing.JTextField();
        Button3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        NachosSupremos = new javax.swing.JButton();
        Rbburritogrande = new javax.swing.JRadioButton();
        Rbburritopequeño = new javax.swing.JRadioButton();
        Txtcantidadburritogrande = new javax.swing.JTextField();
        Txtcantidadburritopequeño = new javax.swing.JTextField();
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
        Rbcocacola = new javax.swing.JRadioButton();
        Txtcantidadcocacola = new javax.swing.JTextField();
        Rbfresca = new javax.swing.JRadioButton();
        Txtcantidadfresca = new javax.swing.JTextField();
        Rbjugonaranja = new javax.swing.JRadioButton();
        Txtcantidadjugonaranja = new javax.swing.JTextField();
        Rbfrescomora = new javax.swing.JRadioButton();
        Txtcantidadfrescomora = new javax.swing.JTextField();
        Rbbatidomora = new javax.swing.JRadioButton();
        Rbbatidofresa = new javax.swing.JRadioButton();
        Txtcantidadbatidomora = new javax.swing.JTextField();
        Txtcantidadbatidofresa = new javax.swing.JTextField();
        Rbchocolate = new javax.swing.JRadioButton();
        Rbcafe = new javax.swing.JRadioButton();
        Txtcantidadchocolate = new javax.swing.JTextField();
        Txtcantidadcafe = new javax.swing.JTextField();
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
        jLabel1.setText("Bienvenido a Mesa #1");

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

        ButtonComprar.setBackground(new java.awt.Color(0, 0, 51));
        ButtonComprar.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        ButtonComprar.setForeground(new java.awt.Color(255, 255, 0));
        ButtonComprar.setText("Comprar");
        ButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonComprarActionPerformed(evt);
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

        Rbhamburguesasimple.setText("Hamburguesa Simple");
        Rbhamburguesasimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbhamburguesasimpleActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Nachos Supremos");

        Rbhamburguesadoble.setText("Hamburguesa Doble");
        Rbhamburguesadoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbhamburguesadobleActionPerformed(evt);
            }
        });

        Rbtacopequeño.setText("Taco Pequeño");
        Rbtacopequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtacopequeñoActionPerformed(evt);
            }
        });

        Rbtacogrande.setText("Taco Grande");
        Rbtacogrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtacograndeActionPerformed(evt);
            }
        });

        Rbpapaspequeñas.setText("Papas Pequeñas");
        Rbpapaspequeñas.setToolTipText("");
        Rbpapaspequeñas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbpapaspequeñasActionPerformed(evt);
            }
        });

        Rbpapasgrandes.setText("Papas Grandes");
        Rbpapasgrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbpapasgrandesActionPerformed(evt);
            }
        });

        Rbnachospequeños.setText("Nachos Pequeños");
        Rbnachospequeños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbnachospequeñosActionPerformed(evt);
            }
        });

        Rbnachosgrandes.setText("Nachos Grandes");
        Rbnachosgrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbnachosgrandesActionPerformed(evt);
            }
        });

        Txtcantidadhamsimple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadhamsimple.setText("0");
        Txtcantidadhamsimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadhamsimpleActionPerformed(evt);
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

        Txtcantidadhamdoble.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadhamdoble.setText("0");
        Txtcantidadhamdoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadhamdobleActionPerformed(evt);
            }
        });

        Txtcantidadtacopequeño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadtacopequeño.setText("0");

        Txtcantidadtacogrande.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadtacogrande.setText("0");
        Txtcantidadtacogrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadtacograndeActionPerformed(evt);
            }
        });

        Txtcantidadpapaspequeñas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadpapaspequeñas.setText("0");
        Txtcantidadpapaspequeñas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadpapaspequeñasActionPerformed(evt);
            }
        });

        Txtcantidadpapasgrandes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadpapasgrandes.setText("0");
        Txtcantidadpapasgrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadpapasgrandesActionPerformed(evt);
            }
        });

        Txtcantidadnachospequeños.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadnachospequeños.setText("0");
        Txtcantidadnachospequeños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadnachospequeñosActionPerformed(evt);
            }
        });

        Txtcantidadnachosgrandes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadnachosgrandes.setText("0");

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

        Rbburritogrande.setText("Burrito Grande");
        Rbburritogrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbburritograndeActionPerformed(evt);
            }
        });

        Rbburritopequeño.setText("Burrito Pequeño");
        Rbburritopequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbburritopequeñoActionPerformed(evt);
            }
        });

        Txtcantidadburritogrande.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadburritogrande.setText("0");
        Txtcantidadburritogrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadburritograndeActionPerformed(evt);
            }
        });

        Txtcantidadburritopequeño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadburritopequeño.setText("0");
        Txtcantidadburritopequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadburritopequeñoActionPerformed(evt);
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

        Rbcocacola.setText("Coca Cola");
        Rbcocacola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbcocacolaActionPerformed(evt);
            }
        });

        Txtcantidadcocacola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadcocacola.setText("0");
        Txtcantidadcocacola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadcocacolaActionPerformed(evt);
            }
        });

        Rbfresca.setText("Fresca");
        Rbfresca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbfrescaActionPerformed(evt);
            }
        });

        Txtcantidadfresca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadfresca.setText("0");
        Txtcantidadfresca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadfrescaActionPerformed(evt);
            }
        });

        Rbjugonaranja.setText("Jugo de Naranja");
        Rbjugonaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbjugonaranjaActionPerformed(evt);
            }
        });

        Txtcantidadjugonaranja.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadjugonaranja.setText("0");
        Txtcantidadjugonaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadjugonaranjaActionPerformed(evt);
            }
        });

        Rbfrescomora.setText("Fresco de Mora");
        Rbfrescomora.setActionCommand("Fresco de Frutas");
        Rbfrescomora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbfrescomoraActionPerformed(evt);
            }
        });

        Txtcantidadfrescomora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadfrescomora.setText("0");
        Txtcantidadfrescomora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadfrescomoraActionPerformed(evt);
            }
        });

        Rbbatidomora.setText("Batido de Mora");
        Rbbatidomora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbbatidomoraActionPerformed(evt);
            }
        });

        Rbbatidofresa.setText("Batido de Fresa");
        Rbbatidofresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbbatidofresaActionPerformed(evt);
            }
        });

        Txtcantidadbatidomora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadbatidomora.setText("0");
        Txtcantidadbatidomora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadbatidomoraActionPerformed(evt);
            }
        });

        Txtcantidadbatidofresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadbatidofresa.setText("0");
        Txtcantidadbatidofresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadbatidofresaActionPerformed(evt);
            }
        });

        Rbchocolate.setText("Chocolate");
        Rbchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbchocolateActionPerformed(evt);
            }
        });

        Rbcafe.setText("Café");
        Rbcafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbcafeActionPerformed(evt);
            }
        });

        Txtcantidadchocolate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadchocolate.setText("0");
        Txtcantidadchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadchocolateActionPerformed(evt);
            }
        });

        Txtcantidadcafe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txtcantidadcafe.setText("0");
        Txtcantidadcafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcantidadcafeActionPerformed(evt);
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
                                .addComponent(Txtcantidadcocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Rbhamburguesasimple, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextPrecioHamburguesadoble, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Txtcantidadhamdoble, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextPrecioHAmburguesasimple, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Txtcantidadhamsimple, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Rbhamburguesadoble, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                    .addComponent(Txtcantidadtacopequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Rbtacopequeño, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldJugo_de_naranja, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txtcantidadjugonaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextPrecio_taco_grande, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txtcantidadtacogrande, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Rbjugonaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rbtacogrande, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                    .addComponent(Txtcantidadbatidomora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(Rbbatidomora, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jTextFieldBatido_de_fresa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(Txtcantidadbatidofresa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(Rbbatidofresa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_papas_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Txtcantidadpapaspequeñas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Rbpapaspequeñas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_papas_grandes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Txtcantidadpapasgrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Rbpapasgrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(Txtcantidadchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Rbchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Txtcantidadcafe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Rbcafe, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(NachosSupremos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Rbnachosgrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_nachos_grandes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Txtcantidadnachosgrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_nachos_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Txtcantidadnachospequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Rbnachospequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rbburritogrande, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Burritos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rbburritopequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_burrito_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Txtcantidadburritopequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextPrecio_burrito_grande, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Txtcantidadburritogrande, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRefrescasrPrecios)
                                .addGap(80, 80, 80))))
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
                                        .addComponent(Txtcantidadfresca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Rbcocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rbfresca, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Rbfrescomora, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldFresco_de_mora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Txtcantidadfrescomora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(Rbpapaspequeñas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txtcantidadpapaspequeñas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(Rbpapasgrandes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecio_papas_grandes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtcantidadpapasgrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Rbburritopequeño)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecio_burrito_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtcantidadburritopequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rbburritogrande)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecio_burrito_grande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtcantidadburritogrande, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Rbnachospequeños)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecio_nachos_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtcantidadnachospequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(Rbnachosgrandes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecio_nachos_grandes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtcantidadnachosgrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rbhamburguesasimple)
                            .addComponent(Rbtacopequeño))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextPrecio_taco_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txtcantidadtacopequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextPrecioHAmburguesasimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txtcantidadhamsimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Rbtacogrande, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Rbhamburguesadoble, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPrecioHamburguesadoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtcantidadhamdoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPrecio_taco_grande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtcantidadtacogrande)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextPrecio_papas_pequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
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
                                            .addComponent(Batidos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))
                                    .addComponent(RefrescoNatural, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Rbcocacola)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextFieldCocacola, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                                    .addComponent(Txtcantidadcocacola))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Rbfresca))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(Rbfrescomora)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jTextFieldFresco_de_mora))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldFresca)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextFieldBatido_de_mora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Txtcantidadbatidomora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(Txtcantidadfrescomora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Txtcantidadfresca)))
                                        .addGap(0, 13, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(Rbbatidofresa)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addComponent(Txtcantidadbatidofresa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Rbbatidomora))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextFieldBatido_de_fresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(Rbcafe)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Txtcantidadcafe)
                                                    .addComponent(jTextFieldCafe, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Rbchocolate)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextFieldChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addComponent(Txtcantidadchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(Rbjugonaranja)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldJugo_de_naranja, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtcantidadjugonaranja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBGuardarcompra)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButtonRefrescasrPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtcantidadcafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadcafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadcafeActionPerformed

    private void TxtcantidadchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadchocolateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadchocolateActionPerformed

    private void RbcafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbcafeActionPerformed
        Txtcantidadcafe.setText("");
    }//GEN-LAST:event_RbcafeActionPerformed

    private void RbchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbchocolateActionPerformed
        Txtcantidadchocolate.setText("");
    }//GEN-LAST:event_RbchocolateActionPerformed

    private void TxtcantidadbatidofresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadbatidofresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadbatidofresaActionPerformed

    private void TxtcantidadbatidomoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadbatidomoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadbatidomoraActionPerformed

    private void RbbatidofresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbbatidofresaActionPerformed
        Txtcantidadbatidofresa.setText("");
    }//GEN-LAST:event_RbbatidofresaActionPerformed

    private void RbbatidomoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbbatidomoraActionPerformed
        Txtcantidadbatidomora.setText("");
    }//GEN-LAST:event_RbbatidomoraActionPerformed

    private void TxtcantidadfrescomoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadfrescomoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadfrescomoraActionPerformed

    private void RbfrescomoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbfrescomoraActionPerformed
        Txtcantidadfrescomora.setText("");
    }//GEN-LAST:event_RbfrescomoraActionPerformed

    private void TxtcantidadjugonaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadjugonaranjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadjugonaranjaActionPerformed

    private void RbjugonaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbjugonaranjaActionPerformed
        Txtcantidadjugonaranja.setText("");
    }//GEN-LAST:event_RbjugonaranjaActionPerformed

    private void TxtcantidadfrescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadfrescaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadfrescaActionPerformed

    private void RbfrescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbfrescaActionPerformed
        Txtcantidadfresca.setText("");
    }//GEN-LAST:event_RbfrescaActionPerformed

    private void TxtcantidadcocacolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadcocacolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadcocacolaActionPerformed

    private void RbcocacolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbcocacolaActionPerformed
        Txtcantidadcocacola.setText("");
    }//GEN-LAST:event_RbcocacolaActionPerformed

    private void TxtcantidadburritopequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadburritopequeñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadburritopequeñoActionPerformed

    private void TxtcantidadburritograndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadburritograndeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadburritograndeActionPerformed

    private void NachosSupremosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NachosSupremosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NachosSupremosActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed

        try {

            //COMIDAS
            Double total = C.getCantidadhamSimple() * P.getHamburguesa_sim();
            Double total2 = C.getCantidadhamdoble() * P.getHamburguesa_doble();
            Double total3 = C.getCantidadtacosPequeño() * P.getTaco_pequeno();
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
            if (subtotal < 0) {
                JOptionPane.showMessageDialog(null, "Error numero negativo ", "MENSAJE", JOptionPane.WARNING_MESSAGE);
                txtotal.setText("");
            } else {
                String Subtotal = String.valueOf(subtotal);
                txtotal.setText(Subtotal);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en numero ingresado ", "MENSAJE", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_Button3ActionPerformed

    private void TxtcantidadnachospequeñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadnachospequeñosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadnachospequeñosActionPerformed

    private void TxtcantidadpapasgrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadpapasgrandesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadpapasgrandesActionPerformed

    private void TxtcantidadpapaspequeñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadpapaspequeñasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadpapaspequeñasActionPerformed

    private void TxtcantidadtacograndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadtacograndeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadtacograndeActionPerformed

    private void TxtcantidadhamdobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadhamdobleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadhamdobleActionPerformed

    private void txtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotalActionPerformed

    private void TxtcantidadhamsimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcantidadhamsimpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcantidadhamsimpleActionPerformed

    private void RbpapasgrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbpapasgrandesActionPerformed
        Txtcantidadpapasgrandes.setText("");
    }//GEN-LAST:event_RbpapasgrandesActionPerformed

    private void RbpapaspequeñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbpapaspequeñasActionPerformed
        Txtcantidadpapaspequeñas.setText("");
    }//GEN-LAST:event_RbpapaspequeñasActionPerformed

    private void RbtacopequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtacopequeñoActionPerformed
        Txtcantidadtacopequeño.setText("");
    }//GEN-LAST:event_RbtacopequeñoActionPerformed

    private void RbhamburguesadobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbhamburguesadobleActionPerformed
        Txtcantidadhamdoble.setText("");
    }//GEN-LAST:event_RbhamburguesadobleActionPerformed

    private void RbhamburguesasimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbhamburguesasimpleActionPerformed
        Txtcantidadhamsimple.setText("");
    }//GEN-LAST:event_RbhamburguesasimpleActionPerformed

    private void BurritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurritosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BurritosActionPerformed

    private void HamburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HamburguesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HamburguesaActionPerformed

    private void ButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonComprarActionPerformed

        Factura f = new Factura();
        f.setVisible(true);
        this.dispose();
        Factura.txtrecibirsubtotal.setText(txtotal.getText());
        
       cargarproductos();
    }//GEN-LAST:event_ButtonComprarActionPerformed

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        Principal P = new Principal();
        P.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BtnInicioStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInicioStateChanged

    private void RbtacograndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtacograndeActionPerformed
        Txtcantidadtacogrande.setText("");
    }//GEN-LAST:event_RbtacograndeActionPerformed

    private void RbnachospequeñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbnachospequeñosActionPerformed
        Txtcantidadnachospequeños.setText("");
    }//GEN-LAST:event_RbnachospequeñosActionPerformed

    private void RbnachosgrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbnachosgrandesActionPerformed
        Txtcantidadnachosgrandes.setText("");
    }//GEN-LAST:event_RbnachosgrandesActionPerformed

    private void RbburritopequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbburritopequeñoActionPerformed
        Txtcantidadburritopequeño.setText("");
    }//GEN-LAST:event_RbburritopequeñoActionPerformed

    private void RbburritograndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbburritograndeActionPerformed
        Txtcantidadburritogrande.setText("");
    }//GEN-LAST:event_RbburritograndeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
//////////////////////////////////////////////////Crear los setter////////////////////////////////
    private void jBGuardarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarcompraActionPerformed
        //comidas
        double cantidadhamsimple = Double.parseDouble(Txtcantidadhamsimple.getText().trim());
        double cantidadhamdoble = Double.parseDouble(Txtcantidadhamdoble.getText().trim());

        double cantidadtacopequeno = Double.parseDouble(Txtcantidadtacopequeño.getText().trim());
        double cantidadtacogrande = Double.parseDouble(Txtcantidadtacogrande.getText().trim());

        double cantidadpapaspequena = Double.parseDouble(Txtcantidadpapaspequeñas.getText().trim());
        double cantidadpapasgrande = Double.parseDouble(Txtcantidadpapasgrandes.getText().trim());

        double cantidadnachospequeno = Double.parseDouble(Txtcantidadnachospequeños.getText().trim());
        double cantidadnachosgrande = Double.parseDouble(Txtcantidadnachosgrandes.getText().trim());

        double cantidadburritospequeno = Double.parseDouble(Txtcantidadburritopequeño.getText().trim());
        double cantidadburritosgrande = Double.parseDouble(Txtcantidadburritogrande.getText().trim());
        //bebidas

        double cantidadcoca_cola = Double.parseDouble(Txtcantidadcocacola.getText().trim());
        double cantidad_fresca = Double.parseDouble(Txtcantidadfresca.getText().trim());

        double cantidad_jugonaranja = Double.parseDouble(Txtcantidadjugonaranja.getText().trim());
        double cantidad_frescomora = Double.parseDouble(Txtcantidadfrescomora.getText().trim());

        double cantidad_batidofresa = Double.parseDouble(Txtcantidadbatidofresa.getText().trim());
        double cantidad_batidomora = Double.parseDouble(Txtcantidadbatidomora.getText().trim());

        double cantidad_cafe = Double.parseDouble(Txtcantidadcafe.getText().trim());
        double cantidad_chocolate = Double.parseDouble(Txtcantidadchocolate.getText().trim());

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
        jTextFieldCocacola.setText("Precio = ¢" + preciococacola);
        String preciofresca = String.valueOf(P.getFresca());
        jTextFieldFresca.setText("Precio = ¢" + preciofresca);

        String preciojugodenaranja = String.valueOf(P.getJugo_naranja());
        jTextFieldJugo_de_naranja.setText("Precio = ¢" + preciojugodenaranja);
        String preciofrescodemora = String.valueOf(P.getFresco_mora());
        jTextFieldFresco_de_mora.setText("Precio = ¢" + preciofrescodemora);

        String preciobatidodefresa = String.valueOf(P.getBatido_fresa());
        jTextFieldBatido_de_fresa.setText("Precio = ¢" + preciobatidodefresa);
        String preciobatidodemora = String.valueOf(P.getBatido_mora());
        jTextFieldBatido_de_mora.setText("Precio = ¢" + preciobatidodemora);

        String preciocafe = String.valueOf(P.getCafe());
        jTextFieldCafe.setText("Precio = ¢" + preciocafe);
        String preciochocolate = String.valueOf(P.getChocolate());
        jTextFieldChocolate.setText("Precio = ¢" + preciochocolate);


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
            java.util.logging.Logger.getLogger(Mesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batidos;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton Burritos;
    private javax.swing.JButton Button3;
    private javax.swing.JButton ButtonComprar;
    private javax.swing.JButton Gaseosas;
    private javax.swing.JButton Hamburguesa;
    private javax.swing.JButton NachosSupremos;
    private javax.swing.JButton OtrasBebidas;
    private javax.swing.JButton PapasSupremas;
    private javax.swing.JRadioButton Rbbatidofresa;
    private javax.swing.JRadioButton Rbbatidomora;
    private javax.swing.JRadioButton Rbburritogrande;
    private javax.swing.JRadioButton Rbburritopequeño;
    private javax.swing.JRadioButton Rbcafe;
    private javax.swing.JRadioButton Rbchocolate;
    private javax.swing.JRadioButton Rbcocacola;
    private javax.swing.JRadioButton Rbfresca;
    private javax.swing.JRadioButton Rbfrescomora;
    private javax.swing.JRadioButton Rbhamburguesadoble;
    private javax.swing.JRadioButton Rbhamburguesasimple;
    private javax.swing.JRadioButton Rbjugonaranja;
    private javax.swing.JRadioButton Rbnachosgrandes;
    private javax.swing.JRadioButton Rbnachospequeños;
    private javax.swing.JRadioButton Rbpapasgrandes;
    private javax.swing.JRadioButton Rbpapaspequeñas;
    private javax.swing.JRadioButton Rbtacogrande;
    private javax.swing.JRadioButton Rbtacopequeño;
    private javax.swing.JButton RefrescoNatural;
    private javax.swing.JButton Tacos;
    private javax.swing.JTextField Txtcantidadbatidofresa;
    private javax.swing.JTextField Txtcantidadbatidomora;
    private javax.swing.JTextField Txtcantidadburritogrande;
    private javax.swing.JTextField Txtcantidadburritopequeño;
    private javax.swing.JTextField Txtcantidadcafe;
    private javax.swing.JTextField Txtcantidadchocolate;
    private javax.swing.JTextField Txtcantidadcocacola;
    private javax.swing.JTextField Txtcantidadfresca;
    private javax.swing.JTextField Txtcantidadfrescomora;
    private javax.swing.JTextField Txtcantidadhamdoble;
    private javax.swing.JTextField Txtcantidadhamsimple;
    private javax.swing.JTextField Txtcantidadjugonaranja;
    private javax.swing.JTextField Txtcantidadnachosgrandes;
    private javax.swing.JTextField Txtcantidadnachospequeños;
    private javax.swing.JTextField Txtcantidadpapasgrandes;
    private javax.swing.JTextField Txtcantidadpapaspequeñas;
    private javax.swing.JTextField Txtcantidadtacogrande;
    private javax.swing.JTextField Txtcantidadtacopequeño;
    private javax.swing.Box.Filler filler1;
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
    private javax.swing.JTextField txtotal;
    // End of variables declaration//GEN-END:variables
}
