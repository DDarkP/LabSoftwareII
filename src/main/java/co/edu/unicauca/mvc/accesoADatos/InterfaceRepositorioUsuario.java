package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Usuario;
import java.util.List;

public interface InterfaceRepositorioUsuario {
    public boolean registrarUsuario(Usuario objUsuario);
    public List<Usuario> listarUsuarios();
    
}
