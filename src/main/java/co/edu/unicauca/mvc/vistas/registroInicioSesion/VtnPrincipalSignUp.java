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

        jLabelImagenOrganizacion.setText("jLabel1");

        jLabelRegistro.setFont(new java.awt.Font("Roboto Thin", 0, 24)); // NOI18N
        jLabelRegistro.setText("Registrarse");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabelImagenOrganizacion))
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabelRegistro)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagenOrganizacion)
                .addGap(28, 28, 28)
                .addComponent(jLabelRegistro)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBackground(new java.awt.Color(204, 204, 255));

        jTextFieldEmail.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldEmail.setBorder(null);

        jButtonRegistrar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonRegistrar.setFont(new java.awt.Font("Roboto Thin", 0, 12)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(153, 0, 153));
        jButtonRegistrar.setText("Registrarse");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jTextFieldPassword.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPassword.setBorder(null);

        jLabelEmail.setFont(new java.awt.Font("Roboto Thin", 0, 12)); // NOI18N
        jLabelEmail.setText("Email");

        jLabelNombreCompleto.setFont(new java.awt.Font("Roboto Thin", 0, 12)); // NOI18N
        jLabelNombreCompleto.setText("Nombre completo");

        jComboBoxRol.setFont(new java.awt.Font("Roboto Thin", 2, 14)); // NOI18N
        jComboBoxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRolActionPerformed(evt);
            }
        });

        jLabelPassword.setFont(new java.awt.Font("Roboto Thin", 0, 12)); // NOI18N
        jLabelPassword.setText("Contraseña");

        jLabelUsuario.setFont(new java.awt.Font("Roboto Thin", 0, 12)); // NOI18N
        jLabelUsuario.setText("Usuario");

        jTextFieldNombreCompleto.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldNombreCompleto.setBorder(null);

        jLabelPassword1.setFont(new java.awt.Font("Roboto Thin", 0, 12)); // NOI18N
        jLabelPassword1.setText("Selecciona tu rol");

        jTextFieldUsuario.setBackground(new java.awt.Color(204, 204, 255));
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
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCentralLayout.createSequentialGroup()
                                    .addComponent(jLabelPassword)
                                    .addGap(52, 52, 52))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                                    .addComponent(jLabelPassword1)
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanelCentralLayout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addGap(83, 83, 83)))
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreCompleto)
                            .addComponent(jLabelUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(148, 148, 148))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreCompleto)
                    .addComponent(jTextFieldNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword1)
                    .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
