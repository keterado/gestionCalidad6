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
public class ingreso extends javax.swing.JFrame {
int bandera = 0;
    /**
     * Creates new form ingreso
     */
    public ingreso() {
        
        initComponents();
        panelOculto.setVisible(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ingresoNombres = new javax.swing.JTextField();
        ingresoApellidos = new javax.swing.JTextField();
        ingresoCedula = new javax.swing.JTextField();
        ingresoCorreo = new javax.swing.JTextField();
        ingresoCiudad = new javax.swing.JTextField();
        ingresoDireccion = new javax.swing.JTextField();
        siExtranjero = new javax.swing.JRadioButton();
        siFrecuente = new javax.swing.JRadioButton();
        siSeguro = new javax.swing.JRadioButton();
        btnMenuPrincipal = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        siAcompañantes = new javax.swing.JRadioButton();
        panelOculto = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        numAdultos = new javax.swing.JTextField();
        numNiños = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Número de cédula");

        jLabel4.setText("Correo Electronico");

        jLabel5.setText("Ciudad");

        jLabel6.setText("Dirección");

        jLabel7.setText("Extranjero");

        jLabel8.setText("Cliente frecuente");

        jLabel9.setText("Seguro de viaje");

        jLabel10.setText("Acompañantes");

        ingresoNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoNombresActionPerformed(evt);
            }
        });

        siExtranjero.setText("Si");
        siExtranjero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siExtranjeroActionPerformed(evt);
            }
        });

        siFrecuente.setText("Si");
        siFrecuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siFrecuenteActionPerformed(evt);
            }
        });

        siSeguro.setText("Si");
        siSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siSeguroActionPerformed(evt);
            }
        });

        btnMenuPrincipal.setText("SALIR AL MENÚ PRINCIPAL");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        btnVaciar.setText("VACIAR CAMPOS");

        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        siAcompañantes.setText("Si");
        siAcompañantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siAcompañantesMouseClicked(evt);
            }
        });
        siAcompañantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siAcompañantesActionPerformed(evt);
            }
        });

        jLabel11.setText("Adultos");

        jLabel12.setText("Niños");

        numAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAdultosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOcultoLayout = new javax.swing.GroupLayout(panelOculto);
        panelOculto.setLayout(panelOcultoLayout);
        panelOcultoLayout.setHorizontalGroup(
            panelOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
            .addGroup(panelOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelOcultoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelOcultoLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(26, 26, 26)
                            .addComponent(numAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addGap(87, 87, 87))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOcultoLayout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(numNiños, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        panelOcultoLayout.setVerticalGroup(
            panelOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(panelOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelOcultoLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(panelOcultoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(numAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(numNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("INGRESO DE TURISTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnGrabar)
                        .addGap(61, 61, 61)
                        .addComponent(btnVaciar)
                        .addGap(54, 54, 54)
                        .addComponent(btnMenuPrincipal))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelOculto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siAcompañantes)
                            .addComponent(ingresoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siExtranjero)
                            .addComponent(siFrecuente)
                            .addComponent(siSeguro)
                            .addComponent(ingresoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ingresoCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                                .addComponent(ingresoApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ingresoNombres, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(ingresoDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel13)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ingresoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ingresoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ingresoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ingresoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ingresoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ingresoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(siExtranjero))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(siFrecuente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(siSeguro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(siAcompañantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelOculto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnVaciar)
                    .addComponent(btnMenuPrincipal))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoNombresActionPerformed

    private void siExtranjeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siExtranjeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siExtranjeroActionPerformed

    private void siFrecuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siFrecuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siFrecuenteActionPerformed

    private void siSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siSeguroActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        menuPadre Menu =new menuPadre();
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir al menú principal?",
                "Salir al menú principal", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
        Menu.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void siAcompañantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siAcompañantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siAcompañantesActionPerformed

    private void numAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAdultosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAdultosActionPerformed

    private void siAcompañantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siAcompañantesMouseClicked
        if (bandera==0) {
             panelOculto.setVisible(true);
             bandera =1;
        } else { 
            bandera=0;
            panelOculto.setVisible(false);
        }
       
    }//GEN-LAST:event_siAcompañantesMouseClicked

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
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingreso().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JTextField ingresoApellidos;
    private javax.swing.JTextField ingresoCedula;
    private javax.swing.JTextField ingresoCiudad;
    private javax.swing.JTextField ingresoCorreo;
    private javax.swing.JTextField ingresoDireccion;
    private javax.swing.JTextField ingresoNombres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numAdultos;
    private javax.swing.JTextField numNiños;
    public static javax.swing.JPanel panelOculto;
    private javax.swing.JRadioButton siAcompañantes;
    private javax.swing.JRadioButton siExtranjero;
    private javax.swing.JRadioButton siFrecuente;
    private javax.swing.JRadioButton siSeguro;
    // End of variables declaration//GEN-END:variables
}
