package co.edu.unicauca.mvc.modelos;

public class Organizador {
    private String nombres;
    private String apellidos;
    private String universidad;

    // Constructor
    public Organizador(String nombres, String apellidos, String universidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.universidad = universidad;
    }

    // Getters
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getUniversidad() {
        return universidad;
    }

    // Setters
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    // Método para mostrar información del organizador
    public void mostrarInfo() {
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Universidad: " + universidad);
    }
}

