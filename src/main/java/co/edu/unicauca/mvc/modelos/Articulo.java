package co.edu.unicauca.mvc.modelos;

import java.io.File;

public class Articulo {

    private int idArticulo;
    private String titulo;
    private String autores;
    private Revision revision;
    private File archivoPdf;
    private Conferencia objConferencia;

    public Articulo() {
    }

    public Articulo(int idArticulo, String titulo, String autores, Revision revision, File archivoPdf, Conferencia objConferencia) {
        this.idArticulo = idArticulo;
        this.titulo = titulo;
        this.autores = autores;
        this.revision = revision;
        this.archivoPdf = archivoPdf;
        this.objConferencia = objConferencia;
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

    public Revision getRevision() {
        return revision;
    }

    public void setRevision(Revision revision) {
        this.revision = revision;
    }

    public File getArchivoPdf() {
        return archivoPdf;
    }

    public void setArchivoPdf(File archivoPdf) {
        this.archivoPdf = archivoPdf;
    }

    public Conferencia getObjConferencia() {
        return objConferencia;
    }

    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }
}
