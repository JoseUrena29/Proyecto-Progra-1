/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Getter_and_Setter.Nombre;
import static Proyecto.Componentes.productos;
import java.awt.Desktop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author José
 */
public class Factura extends javax.swing.JFrame {

    /**
     * Creates new form Factura
     */
    DefaultTableModel T = new DefaultTableModel();
    DefaultTableModel x;

    public Factura() {
        initComponents();

        Tablafactura.setModel(T);
        T.addColumn("Producto");
        T.addColumn("Cantidad");
        T.addColumn("Precio Unitario");
        T.addColumn("Precio Total");

        ComboboxTarjetas.addItem("Efectivo");
        ComboboxTarjetas.addItem("Visa");
        ComboboxTarjetas.addItem("Mastercard");
        ComboboxTarjetas.addItem("BAC");
        ComboboxTarjetas.addItem("BCR");

        cargar();

    }

    public void tarjetas() {
        Double iva = 0.13;
        Double Visa = 0.10;
        Double Mastercard = 0.15;
        Double BAC = 0.13;
        Double BCR = 0.09;

        String descuentos = (String) ComboboxTarjetas.getSelectedItem();

        //PAGO EN EFECTIVO
        if (descuentos.equals("Efectivo")) {
            double totalcompra = Double.parseDouble(txtrecibirsubtotal.getText().trim());
            double totaliva = totalcompra * iva;
            double total = totalcompra + totaliva;
            txttotalcompra.setText(String.valueOf(total));
        }

        //DESCUENTO TARJETA VISA
        if (descuentos.equals("Visa")) {

            double totalcompra = Double.parseDouble(txtrecibirsubtotal.getText().trim());

            double descuentovisa = totalcompra * Visa;
            double totaldescuentovisa = totalcompra - descuentovisa;

            double totaliva = totaldescuentovisa * iva;
            double total = totaldescuentovisa + totaliva;

            txttotalcompra.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 10% en la compra por el pago con Tarjeta VISA", "Descuento Visa", JOptionPane.INFORMATION_MESSAGE);
        }

        //DESCUENTO TARJETA MASTERCARD
        if (descuentos.equals("Mastercard")) {

            double totalcompra = Double.parseDouble(txtrecibirsubtotal.getText().trim());

            double descuentomastercard = totalcompra * Mastercard;
            double totaldescuentomastercard = totalcompra - descuentomastercard;

            double totaliva = totaldescuentomastercard * iva;
            double total = totaldescuentomastercard + totaliva;

            txttotalcompra.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 15% en la compra por el pago con Tarjeta Mastercard", "Descuento Mastercard", JOptionPane.INFORMATION_MESSAGE);
        }

        //DESCUENTO TARJETA BAC
        if (descuentos.equals("BAC")) {
            double totalcompra = Double.parseDouble(txtrecibirsubtotal.getText().trim());

            double descuentoBAC = totalcompra * BAC;
            double totaldescuentoBAC = totalcompra - descuentoBAC;

            double totaliva = totaldescuentoBAC * iva;
            double total = totaldescuentoBAC + totaliva;

            txttotalcompra.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 13% en la compra por el pago con Tarjeta BAC", "Descuento BAC", JOptionPane.INFORMATION_MESSAGE);
        }

        //DESCUENTO TARJETA BCR
        if (descuentos.equals("BCR")) {
            double totalcompra = Double.parseDouble(txtrecibirsubtotal.getText().trim());

            double descuentoBCR = totalcompra * BCR;
            double totaldescuentoBCR = totalcompra - descuentoBCR;

            double totaliva = totaldescuentoBCR * iva;
            double total = totaldescuentoBCR + totaliva;

            txttotalcompra.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 9% en la compra por el pago con Tarjeta BCR", "Descuento BCR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cargar() {
        T.setRowCount(0);
        for (int i = 0; i < Componentes.productos.size(); i++) {
            T.addRow(new Object[]{
                Componentes.productos.get(i).getProductos(),
                Componentes.productos.get(i).getCantidad(),
                Componentes.productos.get(i).getPreciounitario(),
                Componentes.productos.get(i).getPreciototal(),});
        }

    }

    Nombre N = new Nombre();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel1 = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        facturacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablafactura = new javax.swing.JTable();
        ButtonCargar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabladividir = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txttotalcompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpago = new javax.swing.JTextField();
        jButtonIngresarPago = new javax.swing.JButton();
        txtcambio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Buttonpagar = new javax.swing.JButton();
        Buttonabrirreporte = new javax.swing.JButton();
        txtrecibirsubtotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboboxTarjetas = new javax.swing.JComboBox<>();
        jButtonMetodoPago = new javax.swing.JButton();
        jButtonDividirCuentas = new javax.swing.JButton();
        txtcuenta1 = new javax.swing.JTextField();
        txtcuenta2 = new javax.swing.JTextField();
        jButtonseleccionarfila = new javax.swing.JButton();
        jButtonseleccionarfila1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        facturacion.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 30)); // NOI18N
        facturacion.setForeground(new java.awt.Color(210, 7, 7));
        facturacion.setText("Facturación");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Introduzca el nombre del cliente:");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Introduzca el apellido del cliente:");

        Tablafactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tablafactura.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TablafacturaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(Tablafactura);

        ButtonCargar.setBackground(new java.awt.Color(0, 0, 51));
        ButtonCargar.setForeground(new java.awt.Color(255, 255, 51));
        ButtonCargar.setText("Cargar Productos");
        ButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCargarActionPerformed(evt);
            }
        });

        Tabladividir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio unitario", "Precio total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabladividir);
        if (Tabladividir.getColumnModel().getColumnCount() > 0) {
            Tabladividir.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Total de la compra.");

        txttotalcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalcompraActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Ingresar el pago.");

        txtpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpagoActionPerformed(evt);
            }
        });

        jButtonIngresarPago.setBackground(new java.awt.Color(0, 0, 51));
        jButtonIngresarPago.setForeground(new java.awt.Color(255, 255, 0));
        jButtonIngresarPago.setText("Aceptar");
        jButtonIngresarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarPagoActionPerformed(evt);
            }
        });

        txtcambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcambioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Fecha:");

        Buttonpagar.setBackground(new java.awt.Color(255, 255, 0));
        Buttonpagar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        Buttonpagar.setText("Pagar / Generar Reporte");
        Buttonpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpagarActionPerformed(evt);
            }
        });

        Buttonabrirreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pdf.JPG"))); // NOI18N
        Buttonabrirreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonabrirreporteActionPerformed(evt);
            }
        });

        txtrecibirsubtotal.setToolTipText("");
        txtrecibirsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrecibirsubtotalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Subtotal de la compra.");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Metodo de pago.");

        ComboboxTarjetas.setToolTipText("");
        ComboboxTarjetas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboboxTarjetasItemStateChanged(evt);
            }
        });
        ComboboxTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboboxTarjetasActionPerformed(evt);
            }
        });

        jButtonMetodoPago.setBackground(new java.awt.Color(0, 0, 51));
        jButtonMetodoPago.setForeground(new java.awt.Color(255, 255, 0));
        jButtonMetodoPago.setText("Aceptar");
        jButtonMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMetodoPagoActionPerformed(evt);
            }
        });

        jButtonDividirCuentas.setBackground(new java.awt.Color(0, 0, 51));
        jButtonDividirCuentas.setForeground(new java.awt.Color(255, 255, 0));
        jButtonDividirCuentas.setText("Dividir Cuenta");
        jButtonDividirCuentas.setToolTipText("");
        jButtonDividirCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirCuentasActionPerformed(evt);
            }
        });

        txtcuenta1.setEditable(false);
        txtcuenta1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtcuenta2.setEditable(false);
        txtcuenta2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonseleccionarfila.setText("Seleccionar");
        jButtonseleccionarfila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonseleccionarfilaActionPerformed(evt);
            }
        });

        jButtonseleccionarfila1.setText("Eliminar de esta tabla");
        jButtonseleccionarfila1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonseleccionarfila1ActionPerformed(evt);
            }
        });

        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Cambio:");

        txtfecha.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(ComboboxTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtrecibirsubtotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 461, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txttotalcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtpago, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .addComponent(txtcambio))
                                    .addComponent(Buttonpagar))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonIngresarPago))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Buttonabrirreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonDividirCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                                .addComponent(ButtonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonseleccionarfila1)
                                    .addComponent(jButtonseleccionarfila)
                                    .addComponent(jButton1))
                                .addContainerGap())
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(818, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(272, 272, 272)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txttotalcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonDividirCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtcuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonIngresarPago))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtcambio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtfecha)
                                                        .addContainerGap())
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Buttonpagar)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(Buttonabrirreporte)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtrecibirsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(ComboboxTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonMetodoPago))
                                        .addGap(47, 47, 47))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonseleccionarfila1)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonseleccionarfila)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(528, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonseleccionarfilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonseleccionarfilaActionPerformed
        int fila = Tablafactura.getSelectedRow();
        try {
            String producto, cantidad, preciounitario, preciototal;
            if (fila == -1) {
                JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un producto");

            } else {
                Tablafactura.getModel();
                producto = Tablafactura.getValueAt(fila, 0).toString();
                cantidad = Tablafactura.getValueAt(fila, 1).toString();
                preciounitario = Tablafactura.getValueAt(fila, 2).toString();
                preciototal = Tablafactura.getValueAt(fila, 3).toString();

                x = (DefaultTableModel) Tabladividir.getModel();
                String Seleccion[] = {producto, cantidad, preciounitario, preciototal};
                x.addRow(Seleccion);
                eliminarfilasfactura();
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButtonseleccionarfilaActionPerformed

    private void jButtonDividirCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirCuentasActionPerformed
        Double S = 0.0;
        Double total2 = 0.0;

        Double a = 0.0;

        Double total33 = 0.0;

        for (int i = 0; i < Tabladividir.getRowCount(); i++) {
            S = S + Double.parseDouble(Tabladividir.getValueAt(i, 3).toString());

            total2 = S;

        }
        for (int i = 0; i < Tablafactura.getRowCount(); i++) {
            a = a + Double.parseDouble(Tablafactura.getValueAt(i, 3).toString());

            total33 = a;

        }

        txtcuenta2.setText(String.valueOf(total2));
        txtcuenta1.setText(String.valueOf(total33));
    }//GEN-LAST:event_jButtonDividirCuentasActionPerformed

    private void jButtonMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMetodoPagoActionPerformed

        tarjetas();
    }//GEN-LAST:event_jButtonMetodoPagoActionPerformed

    private void ComboboxTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboboxTarjetasActionPerformed

    }//GEN-LAST:event_ComboboxTarjetasActionPerformed

    private void ComboboxTarjetasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboboxTarjetasItemStateChanged

    }//GEN-LAST:event_ComboboxTarjetasItemStateChanged

    private void txtrecibirsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrecibirsubtotalActionPerformed

    }//GEN-LAST:event_txtrecibirsubtotalActionPerformed

    private void ButtonabrirreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonabrirreporteActionPerformed
        try {

            File ruta = new File(txtnombre.getText() + txtapellido.getText() + "Comprobante" + ".pdf");
            Desktop.getDesktop().open(ruta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No existe el comprobrante solicitado, por favor verifique los datos seleccionados");
        }

    }//GEN-LAST:event_ButtonabrirreporteActionPerformed

    private void ButtonpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpagarActionPerformed
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/dd/YYYY");

        txtfecha.setText(formatoFecha.format(fecha));

        Calendar calendario = Calendar.getInstance();

        calendario.setTime(fecha);

        String dia = calendario.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("es", "ES"));

        int horas = calendario.get(Calendar.HOUR);
        int minutos = calendario.get(Calendar.MINUTE);

        txtfecha.setText("Día:   " + dia + "   Hora:  " + horas + "  con  " + minutos + "   Minutos.   ");

        Comprobante reporte = new Comprobante(txtnombre.getText(), txtapellido.getText(), txtfecha.getText(), productos, "src\\Imagenes\\comprobante.png", txttotalcompra.getText(), txtcambio.getText());
        reporte.crearReporte();

    }//GEN-LAST:event_ButtonpagarActionPerformed

    private void txtcambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcambioActionPerformed

    private void jButtonIngresarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarPagoActionPerformed
        if (Double.parseDouble(txtpago.getText().trim()) < Double.parseDouble(txttotalcompra.getText())) {
            JOptionPane.showMessageDialog(rootPane, "El monto digitado es menor al total de la compra", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            txtpago.setText("");
            txtcambio.setText("");

        } else {
            double pago = Double.parseDouble(txtpago.getText().trim());
            double total = Double.parseDouble(txttotalcompra.getText());
            double cambio = pago - total;

            txtcambio.setText(String.valueOf(cambio));

        }
    }//GEN-LAST:event_jButtonIngresarPagoActionPerformed

    private void txtpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpagoActionPerformed

    private void txttotalcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalcompraActionPerformed

    }//GEN-LAST:event_txttotalcompraActionPerformed

    private void ButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCargarActionPerformed
        cargar();
        JOptionPane.showMessageDialog(rootPane, "Productos Agregados");
    }//GEN-LAST:event_ButtonCargarActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jButtonseleccionarfila1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonseleccionarfila1ActionPerformed
        int fila = Tabladividir.getSelectedRow();
        try {
            String producto, cantidad, preciounitario, preciototal;
            if (fila == -1) {
                JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un producto");

            } else {
                Tabladividir.getModel();
                producto = Tabladividir.getValueAt(fila, 0).toString();
                cantidad = Tabladividir.getValueAt(fila, 1).toString();
                preciounitario = Tabladividir.getValueAt(fila, 2).toString();
                preciototal = Tabladividir.getValueAt(fila, 3).toString();

                x = (DefaultTableModel) Tablafactura.getModel();
                String Seleccion[] = {producto, cantidad, preciounitario, preciototal};
                x.addRow(Seleccion);
                eliminarfilasdividir();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButtonseleccionarfila1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminarfilasfactura();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablafacturaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TablafacturaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablafacturaAncestorAdded

    public void eliminarfilasfactura() {
        DefaultTableModel U = (DefaultTableModel) Tablafactura.getModel();
        U.removeRow(Tablafactura.getSelectedRow());

    }

    public void eliminarfilasdividir() {
        DefaultTableModel U = (DefaultTableModel) Tabladividir.getModel();
        U.removeRow(Tabladividir.getSelectedRow());
    }

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCargar;
    private javax.swing.JButton Buttonabrirreporte;
    private javax.swing.JButton Buttonpagar;
    public static javax.swing.JComboBox<String> ComboboxTarjetas;
    private javax.swing.JTable Tabladividir;
    private javax.swing.JTable Tablafactura;
    private javax.swing.JLabel facturacion;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonDividirCuentas;
    private javax.swing.JButton jButtonIngresarPago;
    private javax.swing.JButton jButtonMetodoPago;
    private javax.swing.JButton jButtonseleccionarfila;
    private javax.swing.JButton jButtonseleccionarfila1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcambio;
    private javax.swing.JTextField txtcuenta1;
    private javax.swing.JTextField txtcuenta2;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpago;
    public static javax.swing.JTextField txtrecibirsubtotal;
    private javax.swing.JTextField txttotalcompra;
    // End of variables declaration//GEN-END:variables
}
