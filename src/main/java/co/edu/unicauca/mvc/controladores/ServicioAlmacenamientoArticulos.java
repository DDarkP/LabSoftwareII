package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioArticulo;
import co.edu.unicauca.mvc.infraestructura.Subject;
import co.edu.unicauca.mvc.modelos.Articulo;
import java.io.File;
import java.util.List;


public class ServicioAlmacenamientoArticulos extends Subject{
    private InterfaceRepositorioArticulo referenciaRepositorioArticulo;
    private static final String PDF_DIRECTORY = "pdfs/";
    public ServicioAlmacenamientoArticulos(InterfaceRepositorioArticulo referenciaRepositorioArticulo)
    {
        new File(PDF_DIRECTORY).mkdirs(); // Asegura que el directorio para PDFs existe

        this.referenciaRepositorioArticulo=referenciaRepositorioArticulo;
    }
    
    public boolean almacenarArticulo(Articulo objArticulo)
    {
        
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
