/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.mvc.vistas.adminConferencia;

import co.edu.unicauca.mvc.vistas.organizadores.VtnListarConferencias;
import co.edu.unicauca.mvc.vistas.revisores.VtnPrincipalRevisor;
import co.edu.unicauca.mvc.vistas.autorPublicacion.VtnListarArticulos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoOrganizadores;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoUsuarios;
import co.edu.unicauca.mvc.vistas.asistente.VtnListarOrganizadores;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public final class VtnPrincipalAdmin extends javax.swing.JFrame {

    private VtnPrincipalRevisor objVtnVerEstadisticas;
    private VtnListarConferencias objVtnListarConferencias;
    private VtnListarArticulos objVtnListarArticulos;
    private VtnListarOrganizadores objListarOrganizadores;
    private ServicioAlmacenamientoConferencias objServicio;
    private ServicioAlmacenamientoArticulos objServicio1;
    private ServicioAlmacenamientoOrganizadores objServicio2;
    private ServicioAlmacenamientoUsuarios objServicio3;
    
    public VtnPrincipalAdmin() {
        initComponents();
        establecerIconoOrganización();
        asociarServiciosAlmacenamiento(objServicio, objServicio1, objServicio2, objServicio3);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void asociarServiciosAlmacenamiento(
            ServicioAlmacenamientoConferencias objServicio,
            ServicioAlmacenamientoArticulos objServicio1,
            ServicioAlmacenamientoOrganizadores objServicio2,
            ServicioAlmacenamientoUsuarios objServicio3) {
        this.objServicio = objServicio;
        this.objServicio1 = objServicio1;
        this.objServicio2 = objServicio2;
        this.objServicio3 = objServicio3;
        relacionarInternalFrameConJdesptokPane();
    }

    public void asociarServicioAlmacenamientoConferencias(ServicioAlmacenamientoConferencias objServicio) {
        this.objServicio = objServicio;
        relacionarInternalFrameConJdesptokPane();
    }

    public void asociarServicioAlmacenamientoArticulos(ServicioAlmacenamientoArticulos objServicio1) {
        this.objServicio1 = objServicio1;
        relacionarInternalFrameConJdesptokPane();
    }

    public void asociarServicioAlmacenamientoOrganizadores(ServicioAlmacenamientoOrganizadores objServicio2) {
        this.objServicio2 = objServicio2;
        relacionarInternalFrameConJdesptokPane();
    }
    
    public void asociarServicioAlmacenamientoUsuarios(ServicioAlmacenamientoUsuarios objServicio3) {
        this.objServicio3 = objServicio3;
        relacionarInternalFrameConJdesptokPane();
    }

    private void relacionarInternalFrameConJdesptokPane() {
//        this.objVtnVerEstadisticas = new VtnVerEstadisticas();

        this.objVtnListarConferencias = new VtnListarConferencias(this.objServicio);
        this.jDesktopPanelPrincipal.add(this.objVtnListarConferencias);

        this.objVtnListarArticulos = new VtnListarArticulos(this.objServicio1, this.objServicio);
        this.jDesktopPanelPrincipal.add(this.objVtnListarArticulos);

        this.objListarOrganizadores = new VtnListarOrganizadores(this.objServicio2);
        this.jDesktopPanelPrincipal.add(this.objListarOrganizadores);
    }

    private void establecerIconoOrganización() {
        Image img1 = new ImageIcon(getClass().getResource("/recursos/logo.png")).getImage();
        ImageIcon img2 = new ImageIcon(img1.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.jLabelImagenOrganizacion.setIcon(img2);
        this.jLabelImagenOrganizacion.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelImagenOrganizacion = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jButtonGestionarConferencias = new javax.swing.JButton();
        jButtonVerArticulosEnviados = new javax.swing.JButton();
        jButtonVerEstadisticas = new javax.swing.JButton();
        jButtonGestionarOrganizadores = new javax.swing.JButton();
        jButtonGestionarArticulos = new javax.swing.JButton();
        jPanelInferior = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jDesktopPanelPrincipal = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelImagenOrganizacion.setText("jLabel1");

        jPanelMenu.setBackground(new java.awt.Color(153, 153, 255));

        jButtonGestionarConferencias.setText("Gestionar conferencias");
        jButtonGestionarConferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarConferenciasActionPerformed(evt);
            }
        });

        jButtonVerArticulosEnviados.setText("Ver articulos enviados");
        jButtonVerArticulosEnviados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerArticulosEnviadosActionPerformed(evt);
            }
        });

        jButtonVerEstadisticas.setText("Ver estadisticas");
        jButtonVerEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerEstadisticasActionPerformed(evt);
            }
        });

        jButtonGestionarOrganizadores.setText("Gestionar Organizadores");
        jButtonGestionarOrganizadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarOrganizadoresActionPerformed(evt);
            }
        });

        jButtonGestionarArticulos.setText("Gestionar Articulos");
        jButtonGestionarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarArticulosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButtonGestionarConferencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGestionarOrganizadores, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGestionarArticulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerArticulosEnviados, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGestionarConferencias)
                    .addComponent(jButtonVerArticulosEnviados)
                    .addComponent(jButtonGestionarOrganizadores)
                    .addComponent(jButtonVerEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGestionarArticulos))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabelImagenOrganizacion)
                .addContainerGap(784, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagenOrganizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jDesktopPanelPrincipalLayout = new javax.swing.GroupLayout(jDesktopPanelPrincipal);
        jDesktopPanelPrincipal.setLayout(jDesktopPanelPrincipalLayout);
        jDesktopPanelPrincipalLayout.setHorizontalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );
        jDesktopPanelPrincipalLayout.setVerticalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanelPrincipal)
                .addContainerGap())
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanelPrincipal)
                .addContainerGap())
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerArticulosEnviadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerArticulosEnviadosActionPerformed
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
    }//GEN-LAST:event_jButtonVerArticulosEnviadosActionPerformed

    private void jButtonVerEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerEstadisticasActionPerformed
        this.objVtnVerEstadisticas.setVisible(true);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
    }//GEN-LAST:event_jButtonVerEstadisticasActionPerformed

    private void jButtonGestionarConferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarConferenciasActionPerformed
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnListarConferencias.setVisible(true);
        this.objVtnVerEstadisticas.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarConferenciasActionPerformed

    private void jButtonGestionarOrganizadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarOrganizadoresActionPerformed
        this.objListarOrganizadores.setVisible(true);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnVerEstadisticas.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarOrganizadoresActionPerformed

    private void jButtonGestionarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarArticulosActionPerformed
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnListarArticulos.setVisible(true);
        this.objListarOrganizadores.setVisible(false);
        this.objVtnVerEstadisticas.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarArticulosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestionarArticulos;
    private javax.swing.JButton jButtonGestionarConferencias;
    private javax.swing.JButton jButtonGestionarOrganizadores;
    private javax.swing.JButton jButtonVerArticulosEnviados;
    private javax.swing.JButton jButtonVerEstadisticas;
    private javax.swing.JDesktopPane jDesktopPanelPrincipal;
    private javax.swing.JLabel jLabelImagenOrganizacion;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
