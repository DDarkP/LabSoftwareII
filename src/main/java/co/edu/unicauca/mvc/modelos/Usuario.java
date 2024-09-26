package co.edu.unicauca.mvc.modelos;

public class Usuario {
    
    private String nombreUser;
    private String email;
    private String password;
    private String rol;

    public Usuario(String nombreUser, String email, String password, String rol) {
        this.nombreUser = nombreUser;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    public Usuario() {
        
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUser=" + nombreUser + ", email=" + email + ", password=" + password + ", rol=" + rol + '}';
    }
    
}

