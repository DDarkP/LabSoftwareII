package co.edu.unicauca.mvc.test;

import co.edu.unicauca.mvc.accesoADatos.RepositorioOrganizadorMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioArticuloMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioConferenciaMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioUsuarioMemoriaArrayList;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoOrganizadores;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoUsuarios;
import co.edu.unicauca.mvc.vistas.adminConferencia.VtnPrincipalAdmin;
import co.edu.unicauca.mvc.vistas.registroInicioSesion.VtnPrincipalLogin;
import co.edu.unicauca.mvc.vistas.registroInicioSesion.VtnPrincipalSignUp;
import co.edu.unicauca.mvc.vistas.asistente.VtnPrincipalAsistente;
import co.edu.unicauca.mvc.vistas.autorPublicacion.VtnPrincipalAutor;
import javax.swing.UIManager;

public class Test {

    public static void main(String[] args) {

        seleccionarLookAndField();

        RepositorioConferenciaMemoriaArrayList objRepositorio1
                = new RepositorioConferenciaMemoriaArrayList();
        RepositorioArticuloMemoriaArrayList objRepositorio2
                = new RepositorioArticuloMemoriaArrayList();
        RepositorioOrganizadorMemoriaArrayList objRepositorio3
                = new RepositorioOrganizadorMemoriaArrayList();
        RepositorioUsuarioMemoriaArrayList objRepositorio4
                = new RepositorioUsuarioMemoriaArrayList();

        ServicioAlmacenamientoConferencias objServicio1
                = new ServicioAlmacenamientoConferencias(objRepositorio1);
        ServicioAlmacenamientoArticulos objServicio2
                = new ServicioAlmacenamientoArticulos(objRepositorio2);
        ServicioAlmacenamientoOrganizadores objServicio3
                = new ServicioAlmacenamientoOrganizadores(objRepositorio3);
        ServicioAlmacenamientoUsuarios objServicio4
                = new ServicioAlmacenamientoUsuarios(objRepositorio4);

        VtnPrincipalAsistente objVtnAsistente = new VtnPrincipalAsistente();
        VtnPrincipalAutor objVtnAutor = new VtnPrincipalAutor();
        VtnPrincipalSignUp objVtnPrincipalSignUp = new VtnPrincipalSignUp(objServicio4);

        objServicio1.addObserver(objVtnAsistente);
        objServicio1.addObserver(objVtnAutor);
        objServicio2.addObserver(objVtnAsistente);
        objServicio2.addObserver(objVtnAutor);
        objServicio3.addObserver(objVtnAsistente);
        objServicio3.addObserver(objVtnAutor);
        objServicio4.addObserver(objVtnAsistente);
        objServicio4.addObserver(objVtnAutor);
        
        VtnPrincipalLogin objVtnPrincipalLogin = new VtnPrincipalLogin();
        VtnPrincipalAdmin objVtnPrincipal = new VtnPrincipalAdmin();        
        objVtnPrincipal.asociarServicioAlmacenamientoConferencias(objServicio1);
        objVtnPrincipal.asociarServicioAlmacenamientoArticulos(objServicio2);//new
        objVtnPrincipal.asociarServicioAlmacenamientoOrganizadores(objServicio3);
        objVtnPrincipalLogin.asociarServiciosAlmacenamiento(objServicio4);
        
        objVtnPrincipalLogin.setVisible(true);
//        objVtnPrincipal.setVisible(true);
//        objVtnAsistente.setVisible(true);
//        objVtnAutor.setVisible(true);
    }

    private static void seleccionarLookAndField() {
        for (UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(laf.getName()))
                try {
                UIManager.setLookAndFeel(laf.getClassName());
            } catch (Exception ex) {
            }
        }
    }

}
