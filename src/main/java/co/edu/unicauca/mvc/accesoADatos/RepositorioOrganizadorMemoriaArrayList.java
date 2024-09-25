package co.edu.unicauca.mvc.accesoADatos;

import java.util.ArrayList;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Organizador;

public class RepositorioOrganizadorMemoriaArrayList implements InterfaceRepositorioOrganizador {

    private ArrayList<Organizador> listaOrganizadores;

    public RepositorioOrganizadorMemoriaArrayList() {
        this.listaOrganizadores = new ArrayList();
    }

    @Override
    public boolean registrarOrganizador(Organizador objOrganizador) {
        boolean bandera = this.listaOrganizadores.add(objOrganizador);
        return bandera;
    }

    @Override
    public List<Organizador> listarOrganizadores() {
        return this.listaOrganizadores;
    }

}