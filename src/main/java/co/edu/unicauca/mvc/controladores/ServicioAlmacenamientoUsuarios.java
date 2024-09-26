package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioUsuario;
import co.edu.unicauca.mvc.infraestructura.Subject;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Usuario;

public class ServicioAlmacenamientoUsuarios extends Subject{

    private InterfaceRepositorioUsuario referenciaRepositorioUsuario;

    public ServicioAlmacenamientoUsuarios(InterfaceRepositorioUsuario refeInterfaceRepositorio) {
        this.referenciaRepositorioUsuario = refeInterfaceRepositorio;
    }

    public boolean registrarUsuario(Usuario objUsuario) {
        this.notifyAllObserves();
        return this.referenciaRepositorioUsuario.registrarUsuario(objUsuario);
    }

    public List<Usuario> listarUsuarios() {
        return this.referenciaRepositorioUsuario.listarUsuarios();
    }
}
