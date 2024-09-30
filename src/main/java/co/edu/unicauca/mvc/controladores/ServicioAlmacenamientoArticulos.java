package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioArticulo;
import co.edu.unicauca.mvc.infraestructura.Subject;
import co.edu.unicauca.mvc.modelos.Articulo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


public class ServicioAlmacenamientoArticulos extends Subject{
    private InterfaceRepositorioArticulo referenciaRepositorioArticulo;
    private static final String PDF_DIRECTORY = "pdfs/";

    public ServicioAlmacenamientoArticulos(InterfaceRepositorioArticulo referenciaRepositorioArticulo) {
        new File(PDF_DIRECTORY).mkdirs(); // Asegura que el directorio para PDFs existe
        this.referenciaRepositorioArticulo = referenciaRepositorioArticulo;
    }

    public boolean almacenarArticulo(Articulo objArticulo) {
        // Guardar el archivo PDF en la ubicación deseada
        if (objArticulo.getArchivoPdf() != null) {
            try {
                File pdfFile = objArticulo.getArchivoPdf();
                File destinationFile = new File(PDF_DIRECTORY + pdfFile.getName());
                
                // Copiar el archivo PDF al nuevo destino
                try (FileInputStream inStream = new FileInputStream(pdfFile);
                     FileOutputStream outStream = new FileOutputStream(destinationFile)) {
                    
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = inStream.read(buffer)) > 0) {
                        outStream.write(buffer, 0, length);
                    }
                }
                
                // Establecer la ruta del archivo PDF en el objeto Articulo
                objArticulo.setArchivoPdf(destinationFile);
            } catch (IOException e) {
                // Manejar excepciones al copiar el archivo
                e.printStackTrace();
                return false; // Indicar que el almacenamiento falló
            }
        }

        // Almacenar el objeto Articulo en el repositorio
        return this.referenciaRepositorioArticulo.almacenarArticulo(objArticulo);
    }


      
    public List<Articulo> listarArticulos()
    {
        return this.referenciaRepositorioArticulo.listarArticulos();
    }
    
    public boolean eliminarArticulo(int idArticulo)
    {
        return this.referenciaRepositorioArticulo.eliminarArticulo(idArticulo);
    }
    
    public Articulo consultarArticulo(int idArticulo)
    {
        return this.referenciaRepositorioArticulo.consultarArticulo(idArticulo);
    }
    
    public boolean actualizarArticulo(Articulo objArticulo)
    {
        return this.referenciaRepositorioArticulo.actualizarArticulo(objArticulo);
    }
}
