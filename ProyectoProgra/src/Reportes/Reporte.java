package Reportes;

import Proyecto.Componentes;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author LEANDRO
 */
public class Reporte {

    String Nombre;
    String Apellido;
    ArrayList<Componentes> productos;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Reporte(String Nombre, String Apellido, ArrayList<Componentes> productos) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.productos = productos;

        documento = new Document();
        titulo = new Paragraph("Reporte de Comidas/Bebidas");

    }

}
