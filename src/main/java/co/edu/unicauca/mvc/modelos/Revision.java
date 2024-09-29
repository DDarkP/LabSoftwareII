/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mvc.modelos;

/**
 *
 * @author Dark
 */
public class Revision {

    private int id;
    private Articulo articulo;
    private Autor autor;
    private ResultadoRevision resultado; // Enum: APROBADO, DESAPROBADO, PENDIENTE
    private String comentarios;

    public enum ResultadoRevision {
        APROBADO,
        DESAPROBADO,
        PENDIENTE
    }

    public Revision() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public ResultadoRevision getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoRevision resultado) {
        this.resultado = resultado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

}
