/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestioncalidad6;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class menuPadre extends javax.swing.JFrame {

    /**
     * Creates new form menuPadre
     */
    public menuPadre() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuIngreso = new javax.swing.JMenu();
        ingresarTurista = new javax.swing.JMenuItem();
        MenuConsulta = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuModificar = new javax.swing.JMenu();
        modificarTurista = new javax.swing.JMenuItem();
        eliminarTurista = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setText("Salir");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar);
        btnCerrar.setBounds(180, 250, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestioncalidad6/ag.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 440, 300);

        MenuIngreso.setText("Ingresar");
        MenuIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIngresoActionPerformed(evt);
            }
        });

        ingresarTurista.setText("Ingresar turista");
        ingresarTurista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarTuristaActionPerformed(evt);
            }
        });
        MenuIngreso.add(ingresarTurista);

        Menu.add(MenuIngreso);

        MenuConsulta.setText("Realizar consultas");

        jMenuItem1.setText("Buscar lugar turístico por turista");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuConsulta.add(jMenuItem1);

        jMenuItem4.setText("Buscar lugar turístico por hotel");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MenuConsulta.add(jMenuItem4);

        jMenuItem2.setText("Buscar lugar turístico por ciudad");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuConsulta.add(jMenuItem2);

        jMenuItem3.setText("Buscar lugar turístico por región");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuConsulta.add(jMenuItem3);

        Menu.add(MenuConsulta);

        MenuModificar.setText("Modificar");

        modificarTurista.setText("Modificar Turista");
        modificarTurista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTuristaActionPerformed(evt);
            }
        });
        MenuModificar.add(modificarTurista);

        Menu.add(MenuModificar);

        eliminarTurista.setText("Eliminar");

        jMenuItem6.setText("Eliminar turista");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        eliminarTurista.add(jMenuItem6);

        Menu.add(eliminarTurista);

        setJMenuBar(Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        consultaHotel consultahotel = new consultaHotel();
        consultahotel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del programa?",
                "Cerrar programa", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void MenuIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIngresoActionPerformed
        
    }//GEN-LAST:event_MenuIngresoActionPerformed

    private void ingresarTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarTuristaActionPerformed
        ingreso Ingreso = new ingreso();
        Ingreso.setVisible(true);
        dispose();
    }//GEN-LAST:event_ingresarTuristaActionPerformed

    private void modificarTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTuristaActionPerformed
        modificacion Modificacion = new modificacion();
        Modificacion.setVisible(true);
        dispose();
    }//GEN-LAST:event_modificarTuristaActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        eliminacion Eliminar = new eliminacion();
        Eliminar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        consultaTurista consulta = new consultaTurista();
        consulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        consultaRegion consultaregion = new consultaRegion();
        consultaregion.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        consultaCiudad consultaciudad = new consultaCiudad();
        consultaciudad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPadre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuConsulta;
    private javax.swing.JMenu MenuIngreso;
    private javax.swing.JMenu MenuModificar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JMenu eliminarTurista;
    private javax.swing.JMenuItem ingresarTurista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem modificarTurista;
    // End of variables declaration//GEN-END:variables
}
