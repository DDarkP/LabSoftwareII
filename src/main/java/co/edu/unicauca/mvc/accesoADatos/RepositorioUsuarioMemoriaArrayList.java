package co.edu.unicauca.mvc.accesoADatos;

import java.util.ArrayList;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Usuario;

public class RepositorioUsuarioMemoriaArrayList implements InterfaceRepositorioUsuario {

    private ArrayList<Usuario> listaUsuarios;

    public RepositorioUsuarioMemoriaArrayList() {
        this.listaUsuarios = new ArrayList();
    }

    @Override
    public boolean registrarUsuario(Usuario objUsuario) {
        boolean bandera = this.listaUsuarios.add(objUsuario);
        return bandera;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return this.listaUsuarios;
    }

}