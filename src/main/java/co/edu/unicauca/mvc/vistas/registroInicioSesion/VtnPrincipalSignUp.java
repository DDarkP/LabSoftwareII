/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.mvc.vistas.registroInicioSesion;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoUsuarios;
import co.edu.unicauca.mvc.modelos.Usuario;
import co.edu.unicauca.mvc.utilidades.Utilidades;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

public class VtnPrincipalSignUp extends javax.swing.JFrame {

    private ServicioAlmacenamientoUsuarios objServicio;
    VtnPrincipalLogin objVtnPrincipalLogin = new VtnPrincipalLogin();

    public VtnPrincipalSignUp(ServicioAlmacenamientoUsuarios objServicioAlmacenamiento) {
        initComponents();
        this.objServicio = objServicioAlmacenamiento;
        
        MatteBorder bordeInferior = new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY);
        jTextFieldUsuario.setBorder(bordeInferior);
        jTextFieldPassword.setBorder(bordeInferior);
        jTextFieldEmail.setBorder(bordeInferior);
        jTextFieldNombreCompleto.setBorder(bordeInferior);

        this.jComboBoxRol.addItem("Organizador");
        this.jComboBoxRol.addItem("Autor");
        this.jComboBoxRol.addItem("Revisor");

        establecerIconoOrganización();
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
        jLabelRegistro = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelNombreCompleto = new javax.swing.JLabel();
        jComboBoxRol = new javax.swing.JComboBox<>();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldNombreCompleto = new javax.swing.JTextField();
        jLabelPassword1 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSuperior.setBackground(new java.awt.Color(255, 255, 255));

        jLabelImagenOrganizacion.setText("jLabel1");

        jLabelRegistro.setFont(new java.awt.Font("Roboto Condensed Light", 1, 24)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(255, 0, 102));
        jLabelRegistro.setText("Registrarse");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabelImagenOrganizacion)
                .addGap(103, 103, 103)
                .addComponent(jLabelRegistro)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelImagenOrganizacion))
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelRegistro)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBackground(new java.awt.Color(255, 0, 102));

        jTextFieldEmail.setBackground(new java.awt.Color(255, 0, 102));
        jTextFieldEmail.setFont(new java.awt.Font("Roboto Condensed Light", 2, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(null);

        jButtonRegistrar.setBackground(new java.awt.Color(255, 0, 102));
        jButtonRegistrar.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Registrarse");
        jButtonRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jTextFieldPassword.setBackground(new java.awt.Color(255, 0, 102));
        jTextFieldPassword.setFont(new java.awt.Font("Roboto Condensed Light", 2, 14)); // NOI18N
        jTextFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPassword.setBorder(null);

        jLabelEmail.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email");

        jLabelNombreCompleto.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        jLabelNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreCompleto.setText("Nombre completo");

        jComboBoxRol.setBackground(new java.awt.Color(255, 0, 102));
        jComboBoxRol.setFont(new java.awt.Font("Roboto Condensed Light", 2, 14)); // NOI18N
        jComboBoxRol.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxRol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jComboBoxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRolActionPerformed(evt);
            }
        });

        jLabelPassword.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Contraseña");

        jLabelUsuario.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario");

        jTextFieldNombreCompleto.setBackground(new java.awt.Color(255, 0, 102));
        jTextFieldNombreCompleto.setFont(new java.awt.Font("Roboto Condensed Light", 2, 14)); // NOI18N
        jTextFieldNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNombreCompleto.setBorder(null);

        jLabelPassword1.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        jLabelPassword1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword1.setText("Selecciona tu rol");

        jTextFieldUsuario.setBackground(new java.awt.Color(255, 0, 102));
        jTextFieldUsuario.setFont(new java.awt.Font("Roboto Condensed Light", 2, 14)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreCompleto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombreCompleto, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelCentralLayout.createSequentialGroup()
                            .addComponent(jLabelEmail)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCentralLayout.createSequentialGroup()
                            .addComponent(jLabelPassword)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanelCentralLayout.createSequentialGroup()
                            .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldPassword)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCentralLayout.createSequentialGroup()
                                    .addComponent(jLabelPassword1)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jComboBoxRol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(104, 104, 104)))))
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 210, Short.MAX_VALUE))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabelUsuario)
                .addGap(2, 2, 2)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombreCompleto)
                .addGap(1, 1, 1)
                .addComponent(jTextFieldNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPassword1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        String nombreUser, email, password, rol;
        boolean bandera;

        nombreUser = this.jTextFieldUsuario.getText();
        email = this.jTextFieldEmail.getText();
        password = this.jTextFieldPassword.getText();
        rol = this.jComboBoxRol.getSelectedItem().toString();

        Usuario objUsuario = new Usuario();
        objUsuario.setNombreUser(nombreUser);
        objUsuario.setEmail(email);
        objUsuario.setPassword(password);
        objUsuario.setRol(rol);

        bandera = this.objServicio.registrarUsuario(objUsuario);

        if (bandera == true) {
            Utilidades.mensajeExito("Registro exitoso", "Registro exitoso");
        } else {
            Utilidades.mensajeError("Articulo no almacenado", "Error al almacenar el articulo");
        }
        int size=objServicio.listarUsuarios().size();
        System.out.println(objServicio.listarUsuarios().get(size-1).toString());
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jComboBoxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxRol;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelImagenOrganizacion;
    private javax.swing.JLabel jLabelNombreCompleto;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombreCompleto;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
