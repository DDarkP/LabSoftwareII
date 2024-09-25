package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioOrganizador;
import co.edu.unicauca.mvc.infraestructura.Subject;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Organizador;

public class ServicioAlmacenamientoOrganizadores extends Subject{

    private InterfaceRepositorioOrganizador referenciaRepositorioOrganizador;

    public ServicioAlmacenamientoOrganizadores(InterfaceRepositorioOrganizador refeInterfaceRepositorio) {
        this.referenciaRepositorioOrganizador = refeInterfaceRepositorio;
    }

    public boolean registrarOrganizador(Organizador objOrganizador) {
        this.notifyAllObserves();
        return this.referenciaRepositorioOrganizador.registrarOrganizador(objOrganizador);
    }

    public List<Organizador> listarOrganizadores() {
        return this.referenciaRepositorioOrganizador.listarOrganizadores();
    }
}
