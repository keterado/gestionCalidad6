/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestioncalidad6;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class modificacion extends javax.swing.JFrame {
public static conexion conexion = new conexion();
    /**
     * Creates new form modificacion
     */
    int bandera=0;
    public modificacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelOculto.setVisible(false);
        contenedor.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        ingresoDireccion = new javax.swing.JTextField();
        panelOculto = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        numAdultos = new javax.swing.JTextField();
        numNiños = new javax.swing.JTextField();
        siSeguro = new javax.swing.JRadioButton();
        ingresoApellidos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ingresoNombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ingresoCiudad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        siFrecuente = new javax.swing.JRadioButton();
        siAcompañantes = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ingresoCorreo = new javax.swing.JTextField();
        ingresoCedula = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        btnGuardar.setText("Guardar cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir al menú principal");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel14.setText("Turista a modificar");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestioncalidad6/iconobuscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        ingresoDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoDireccionKeyTyped(evt);
            }
        });

        jLabel11.setText("Adultos");

        jLabel12.setText("Niños");

        numAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAdultosActionPerformed(evt);
            }
        });
        numAdultos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numAdultosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numAdultosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numAdultosKeyTyped(evt);
            }
        });

        numNiños.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numNiñosKeyTyped(evt);
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

        siSeguro.setText("Si");
        siSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siSeguroActionPerformed(evt);
            }
        });

        ingresoApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoApellidosKeyTyped(evt);
            }
        });

        jLabel10.setText("Acompañantes");

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        ingresoNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoNombresActionPerformed(evt);
            }
        });
        ingresoNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ingresoNombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoNombresKeyTyped(evt);
            }
        });

        jLabel8.setText("Cliente frecuente");

        ingresoCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoCiudadKeyTyped(evt);
            }
        });

        jLabel9.setText("Seguro de viaje");

        siFrecuente.setText("Si");
        siFrecuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siFrecuenteActionPerformed(evt);
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

        jLabel4.setText("Correo Electronico");

        jLabel6.setText("Dirección");

        jLabel3.setText("Número de cédula");

        jLabel5.setText("Ciudad");

        ingresoCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ingresoCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoCedulaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelOculto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenedorLayout.createSequentialGroup()
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addGap(26, 26, 26)
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ingresoCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ingresoApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(siAcompañantes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ingresoCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(siFrecuente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(siSeguro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ingresoCiudad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ingresoNombres, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ingresoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap(24, Short.MAX_VALUE)
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(contenedorLayout.createSequentialGroup()
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(ingresoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(ingresoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(ingresoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(ingresoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(ingresoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(ingresoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addComponent(jLabel8))
                        .addComponent(siFrecuente))
                    .addGap(18, 18, 18)
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(siSeguro))
                    .addGap(18, 18, 18)
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(siAcompañantes))
                    .addGap(18, 18, 18)
                    .addComponent(panelOculto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("MODIFICACIÓN DE TURISTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnGuardar)
                        .addGap(123, 123, 123)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel14)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(btnBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        menuPadre menu = new menuPadre();
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir al menú principal?",
                "Salir al menú principal", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
        menu.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (conexion.validadorDeCedula(ingresoCedula.getText())) {
             if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente modificar la informacion del turista?",
                "confirmar acción", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
       {
        if (conexion.crearConexion()) {
            String seguro = String.valueOf(siSeguro.isSelected());
            String frecuente = String.valueOf(siFrecuente.isSelected());
            String acompa = String.valueOf(siAcompañantes.isSelected());
            String numNino, numAdulto;
            if (acompa.equals("true")) {
                numAdulto=numAdultos.getText();
                numNino= numNiños.getText();
                /*if ((numNino.equals("0") && numAdulto.equals("0"))||(numNino.equals("00") && numAdulto.equals("00"))) {
                    JOptionPane.showMessageDialog(rootPane,"ingrese acompañante");
                }else{
                
                        }*/
            }else{
                numNino = "0";
                numAdulto ="0";
            }
            //
            if ((numNino.equals("0") && numAdulto.equals("0"))
                    ||
                    (numNino.equals("00") && numAdulto.equals("00"))
                    ||
                    (numNino.equals("0") && numAdulto.equals("00"))
                    ||
                    (numNino.equals("00") && numAdulto.equals("0"))
                    ) {
                    JOptionPane.showMessageDialog(rootPane,"ingrese acompañante");
                }else{
                        String sql="UPDATE infoturista SET nombres = '"+ingresoNombres.getText()+"',apellidos = '"+ingresoApellidos.getText()+"', cedula = '"+ingresoCedula.getText()+"', correo = '"+ingresoCorreo.getText()+"', ciudad = '"+ingresoCiudad.getText()+"', direccion = '"+ingresoDireccion.getText()+"'"
                     + ",cliente_frecuente = '"+frecuente+"',seguro_viaje ='"+seguro+"',acompanantes = '"+acompa+"',adultos='"+numAdulto+"',ninos = '"+numNino+"' where cedula = "+id.getText();
             try{
            conexion.ejecutarSQL(sql);
            JOptionPane.showMessageDialog(rootPane,"se han guardado los cambios");
             ingresoNombres.setText("");
                ingresoApellidos.setText("");
                ingresoCedula.setText("");
                ingresoCorreo.setText("");
                ingresoCiudad.setText("");
                ingresoDireccion.setText("");
                siFrecuente.setSelected(false);
                siSeguro.setSelected(false);
                siAcompañantes.setSelected(false);
                numAdultos.setText("");
                numNiños.setText("");
                
            
            }
                catch(Exception ex){
               JOptionPane.showMessageDialog(rootPane,"exception: "+ex);
                }
                        }
             
             //
             
            }
          
        }
      }else{JOptionPane.showMessageDialog(rootPane,"datos incorrectos");}
    }//GEN-LAST:event_btnGuardarActionPerformed

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

    private void siAcompañantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siAcompañantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siAcompañantesActionPerformed

    private void siSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siSeguroActionPerformed

    private void siFrecuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siFrecuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siFrecuenteActionPerformed

    private void ingresoNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoNombresActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                
        if (conexion.crearConexion()&& conexion.validadorDeCedula(id.getText())) {
            ingresoNombres.setText("");
                ingresoApellidos.setText("");
                ingresoCedula.setText("");
                ingresoCorreo.setText("");
                ingresoCiudad.setText("");
                ingresoDireccion.setText("");
                siFrecuente.setSelected(false);
                siSeguro.setSelected(false);
                siAcompañantes.setSelected(false);
                numAdultos.setText("");
                numNiños.setText("");
            String nombres,apellidos, cedula, correo, ciudad, direccion, cliente_frecuente, seguro_viaje,acompanantes,adultos,ninos;
             String sql="select nombres,apellidos, cedula, correo, ciudad, direccion, cliente_frecuente, seguro_viaje,acompanantes,adultos,ninos "
                     + "from \"infoturista\" where cedula = "+id.getText();
             
             try{
            ResultSet rs = conexion.ejecutarSQLSelect(sql);
            while(rs.next()){
                nombres = rs.getString(1);
                apellidos = rs.getString(2);
                cedula = rs.getString(3);
                correo = rs.getString(4);
                ciudad = rs.getString(5);
                direccion = rs.getString(6);
                cliente_frecuente = rs.getString(7);
                seguro_viaje = rs.getString(8);
                acompanantes = rs.getString(9);
                adultos =rs.getString(10);
               ninos =rs.getString(11);
               
                ingresoNombres.setText(nombres);
                ingresoApellidos.setText(apellidos);
                ingresoCedula.setText(cedula);
                ingresoCorreo.setText(correo);
                ingresoCiudad.setText(ciudad);
                ingresoDireccion.setText(direccion);
                numAdultos.setText(adultos);
                numNiños.setText(ninos);
                
                if (cliente_frecuente.equals("f")) {
                    siFrecuente.setSelected(false);
                }else{siFrecuente.setSelected(true);}
                if (seguro_viaje.equals("f")) {
                    siSeguro.setSelected(false);
                }else{siSeguro.setSelected(true);}
                
                if (acompanantes.equals("f")) {
                    siAcompañantes.setSelected(false);
                    panelOculto.setVisible(false);
                    bandera=0;
                }else{
                    siAcompañantes.setSelected(true);
                    panelOculto.setVisible(true);
                    bandera=1;
                }
                
                
                
            }
        }catch(Exception ex){
                //txtApellidos.setText("");
                //txtCedula.setText("");
            JOptionPane.showMessageDialog(rootPane,"exception: "+ex);
        }
             contenedor.setVisible(true);
             
        }else{JOptionPane.showMessageDialog(rootPane,"ingresa una cedula correcta");
                ingresoNombres.setText("");
                ingresoApellidos.setText("");
                ingresoCedula.setText("");
                ingresoCorreo.setText("");
                ingresoCiudad.setText("");
                ingresoDireccion.setText("");
                siFrecuente.setSelected(false);
                siSeguro.setSelected(false);
                siAcompañantes.setSelected(false);
                numAdultos.setText("");
                numNiños.setText("");
        }
                
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyPressed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
       char c=evt.getKeyChar(); 
          
         if(!Character.isDigit(c)) {  
              evt.consume(); 
          }
         if (id.getText().length()>=10){
            evt.consume();     
        }
    }//GEN-LAST:event_idKeyTyped

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        if (id.getText().length()==10){
            
             if (conexion.validadorDeCedula(id.getText())) {
                 JOptionPane.showMessageDialog(rootPane,"cedula correcta");
             }else{JOptionPane.showMessageDialog(rootPane,"cedula incorrecta");}
             
        }
    }//GEN-LAST:event_idKeyReleased

    private void ingresoNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoNombresKeyReleased
        
    }//GEN-LAST:event_ingresoNombresKeyReleased

    private void ingresoNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoNombresKeyTyped
        Character c = evt.getKeyChar();
                if(Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }else{
                    
                    evt.consume();
                }
    }//GEN-LAST:event_ingresoNombresKeyTyped

    private void numAdultosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numAdultosKeyTyped
        char c=evt.getKeyChar();

        if(!Character.isDigit(c)) {
            evt.consume();
        }
        if (numAdultos.getText().length()>=2){
            evt.consume();

        }
    }//GEN-LAST:event_numAdultosKeyTyped

    private void numNiñosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numNiñosKeyTyped
        char c=evt.getKeyChar();

        if(!Character.isDigit(c)) {
            evt.consume();
        }
        if (numNiños.getText().length()>=2){
            evt.consume();

        }
    }//GEN-LAST:event_numNiñosKeyTyped

    private void numAdultosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numAdultosKeyReleased
        
    }//GEN-LAST:event_numAdultosKeyReleased

    private void numAdultosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numAdultosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAdultosKeyPressed

    private void ingresoCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoCedulaKeyTyped
        char c=evt.getKeyChar(); 
          
         if(!Character.isDigit(c)) {  
              evt.consume(); 
          }
         if (ingresoCedula.getText().length()>=10){
            evt.consume();     
        }
    }//GEN-LAST:event_ingresoCedulaKeyTyped

    private void ingresoCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoCedulaKeyReleased
        if (ingresoCedula.getText().length()==10){
            
             if (conexion.validadorDeCedula(ingresoCedula.getText())) {
                 ingresoCedula.setBackground(Color.WHITE);
                 JOptionPane.showMessageDialog(rootPane,"cedula correcta");
             }else{JOptionPane.showMessageDialog(rootPane,"cedula incorrecta");
                    ingresoCedula.setBackground(Color.red);
             }
             
        }
    }//GEN-LAST:event_ingresoCedulaKeyReleased

    private void ingresoApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoApellidosKeyTyped
        Character c = evt.getKeyChar();
                if(Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }else{
                    
                    evt.consume();
                }
    }//GEN-LAST:event_ingresoApellidosKeyTyped

    private void ingresoCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoCiudadKeyTyped
        Character c = evt.getKeyChar();
                if(Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }else{
                    
                    evt.consume();
                }
    }//GEN-LAST:event_ingresoCiudadKeyTyped

    private void ingresoDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoDireccionKeyTyped
        Character c = evt.getKeyChar();
                if(Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }else{
                    
                    evt.consume();
                }
    }//GEN-LAST:event_ingresoDireccionKeyTyped

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
            java.util.logging.Logger.getLogger(modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JTextField id;
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numAdultos;
    private javax.swing.JTextField numNiños;
    public static javax.swing.JPanel panelOculto;
    private javax.swing.JRadioButton siAcompañantes;
    private javax.swing.JRadioButton siFrecuente;
    private javax.swing.JRadioButton siSeguro;
    // End of variables declaration//GEN-END:variables
}
