/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.UsuariosJDBC;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.*;
import javax.swing.JOptionPane;
import domain.Usuarios;
import javax.swing.JRadioButton;

/**
 *
 * @author AFIP
 */
public class FRegistro extends javax.swing.JFrame {

    private Usuarios usu=new Usuarios();
    private UsuariosJDBC lista_usuarios=new UsuariosJDBC();
    

    /**
     * Creates new form Registro
     */
    public FRegistro() {
        initComponents();
        label.setEnabled(false);
        textfield.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jTextFieldContraseñaRegis = new javax.swing.JTextField();
        jTextFieldUsuarioRegis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldContraseñaRegis1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Empleado = new javax.swing.JRadioButton();
        Encargado = new javax.swing.JRadioButton();
        textfield = new javax.swing.JTextField();
        label = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Iniciar Sesión");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldContraseñaRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaRegisActionPerformed(evt);
            }
        });
        jTextFieldContraseñaRegis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldContraseñaRegisKeyTyped(evt);
            }
        });

        jTextFieldUsuarioRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioRegisActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingresar Contraseña");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ingresar Usuario");

        jTextFieldContraseñaRegis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaRegis1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirmar Contraseña");

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registrarse");

        buttonGroup1.add(Empleado);
        Empleado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Empleado.setSelected(true);
        Empleado.setText("Empleado");
        Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Encargado);
        Encargado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Encargado.setText("Encargado");
        Encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncargadoActionPerformed(evt);
            }
        });

        label.setText("Ingrese su codigo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldUsuarioRegis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldContraseñaRegis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldContraseñaRegis1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(textfield)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Empleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Encargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(168, 168, 168)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldUsuarioRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldContraseñaRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldContraseñaRegis1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(Empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldContraseñaRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaRegisActionPerformed
        //        jTextFieldUsuario.getText();
    }//GEN-LAST:event_jTextFieldContraseñaRegisActionPerformed

    private void jTextFieldUsuarioRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioRegisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioRegisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (!jTextFieldUsuarioRegis.getText().equals("") && (!jTextFieldContraseñaRegis.getText().equals("") && (!jTextFieldContraseñaRegis1.getText().equals("")))) {
            if (jTextFieldContraseñaRegis.getText().equals(jTextFieldContraseñaRegis1.getText())) {
                ArrayList <Usuarios> regis = new ArrayList();
                Usuarios us4=new Usuarios();
                us4.setUsuario(jTextFieldUsuarioRegis.getText());
                us4.setContraseña(jTextFieldContraseñaRegis.getText());
                regis.add(us4);
            for (int i1 = 0; i1 < regis.size(); i1++) {
                String a = regis.get(i1).getUsuario();
                String b = regis.get(i1).getContraseña();
//                usu.setId(i1+1);
                usu.setUsuario(a);
                usu.setContraseña(b);
                
                
            if (Encargado.isSelected()) {
                    usu.setPuesto("Encargado");
                   label.setEnabled(true);
                   textfield.setEnabled(true);                 
                   Usuarios codigo1=new Usuarios("0303");
                   if (textfield.getText().equals("")){
                      JOptionPane.showMessageDialog(null, "El campo de texto del código está vacio. Complételo por favor", "Error", JOptionPane.ERROR_MESSAGE);
                   }else{
                   if(textfield.getText().equals(codigo1.getCodigo_autorización())){
                     lista_usuarios.insert(usu);
                     this.setVisible(false);
                     FEncargado enc = new FEncargado();
                     enc.setVisible(true);
                     JOptionPane.showMessageDialog(null, "Hola "+jTextFieldUsuarioRegis.getText()+" Te has registrado correctamente");
                   }else{
                     JOptionPane.showMessageDialog(null, "Codigo Erroneo", "Error", JOptionPane.ERROR_MESSAGE);
                   }
            }
                   
                }
            if (Empleado.isSelected()) {
                     usu.setPuesto("Empleado");
                     lista_usuarios.insert(usu);
                     this.setVisible(false);
                     FEmpleado emp = new FEmpleado();
                     emp.setVisible(true);
                     JOptionPane.showMessageDialog(null, "Hola "+jTextFieldUsuarioRegis.getText()+" Te has registrado correctamente");
                }
                
            }
                

            }else {
                JOptionPane.showMessageDialog(null, "La contraseña no coincide");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha ingresado los datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldContraseñaRegis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaRegis1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaRegis1ActionPerformed

    private void jTextFieldContraseñaRegisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaRegisKeyTyped

    }//GEN-LAST:event_jTextFieldContraseñaRegisKeyTyped

    private void EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoActionPerformed
          if (Empleado.isSelected()) {
           label.setEnabled(false);
           textfield.setEnabled(false);
         }
    }//GEN-LAST:event_EmpleadoActionPerformed

    private void EncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncargadoActionPerformed
        if (Encargado.isSelected()) {
           label.setEnabled(true);
           textfield.setEnabled(true);
         }
    }//GEN-LAST:event_EncargadoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FRegistro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Empleado;
    private javax.swing.JRadioButton Encargado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldContraseñaRegis;
    private javax.swing.JTextField jTextFieldContraseñaRegis1;
    private javax.swing.JTextField jTextFieldUsuarioRegis;
    private javax.swing.JLabel label;
    private javax.swing.JTextField textfield;
    // End of variables declaration//GEN-END:variables
}