package Proyecto;

import Getter_and_Setter.Datos;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LEANDRO
 */
public class Comprobante {

    String nombre;
    String apellido;
    String fecha;
    String rutaimagen;
    ArrayList<Datos> productos;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Comprobante(String nombre, String apellido, String fecha, ArrayList<Datos> productos, String rutaImagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.productos = productos;
        this.rutaimagen = rutaImagen;

        documento = new Document();
        titulo = new Paragraph("Comprobante de Pago Punto de Venta");
    }

    public void crearReporte() {
        try {
            archivo = new FileOutputStream(nombre + apellido + "Comprobante" + ".pdf");
            PdfWriter.getInstance(documento, archivo);

            documento.open();
            titulo.setAlignment(1);

            Image imagen = null;
            try {
                imagen = Image.getInstance(rutaimagen);
                imagen.scaleAbsolute(140, 100);
                imagen.setAbsolutePosition(41, 750);

            } catch (Exception e) {
            }

            documento.add(imagen);
            documento.add(titulo);

            documento.close();

            JOptionPane.showMessageDialog(null, "Reporte Creado Correctamente");

        } catch (Exception e) {
        }
    }

}
