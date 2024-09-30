package co.edu.unicauca.mvc.modelos;

import java.util.List;

public class ArticuloO {
   private int idArticulo;
   private String titulo;
   private String autores;
   private Revision revision;
   
   private Conferencia objConferencia;

   public ArticuloO()
   {
       
   }
    public ArticuloO(int idArticulo, String titulo, String autores) {
        this.idArticulo = idArticulo;
        this.titulo = titulo;
        this.autores = autores;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Conferencia getObjConferencia() {
        return objConferencia;
    }

    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }

    public Revision getRevision() {
        return revision;
    }

    public void setRevision(Revision revision) {
        this.revision = revision;
    }
   
   
}
