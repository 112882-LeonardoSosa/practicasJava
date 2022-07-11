package Formularios;

import Entidades.Hotel;
import Entidades.Reserva;
import javax.swing.JOptionPane;

public class frmAlta extends javax.swing.JFrame {

    private Hotel gestor;

    public frmAlta(Hotel g) {
        initComponents();
        this.setLocationRelativeTo(null);

        gestor = g;
        cboTipoReserva.addItem("Negocios");
        cboTipoReserva.addItem("Conferencia");
        cboTipoReserva.addItem("Vacaciones");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidadNini = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboTipoReserva = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        txtNroHabitacion = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtTarifaDiaria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        checkVigente = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTarifaNin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 0));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Nro Habitacion");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad Niños");

        txtCantidadNini.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Dias Reservados");

        btnAceptar.setBackground(java.awt.Color.green);
        btnAceptar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtNroHabitacion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        btnCancelar.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtTarifaDiaria.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtTarifaDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarifaDiariaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Tarifa Diaria");

        txtDias.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        checkVigente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        checkVigente.setText("Vigente");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Tipo Reserva");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("Tarifa Niños");

        txtTarifaNin.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTarifaNin, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(txtNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(checkVigente)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTarifaDiaria, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cboTipoReserva, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                            .addComponent(txtCantidadNini, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(checkVigente)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(cboTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTarifaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtCantidadNini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTarifaNin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //1° VALIDAR QUE LOS CAMPOS ESTEN COMPLETOS
        try {
            if (!validarCampos()) {
                JOptionPane.showMessageDialog(this, "Formulario Incompleto!", "Validaciones", JOptionPane.ERROR_MESSAGE);
                return;//PARA CORTAR EL CICLO
            }

            Reserva nuevo = new Reserva();
            nuevo.setNroHabitacion(Integer.parseInt(txtNroHabitacion.getText()));
            nuevo.setDiasReservados(Integer.parseInt(txtDias.getText()));
            nuevo.setTipoReserva(cboTipoReserva.getSelectedItem().toString());
            nuevo.setVigente(checkVigente.isSelected());
            nuevo.setTarifaDiaria(Float.parseFloat(txtTarifaDiaria.getText()));
            nuevo.setCantidadNinios(Integer.parseInt(txtCantidadNini.getText()));
            nuevo.setTarifaNinio(Float.parseFloat(txtTarifaNin.getText()));

            gestor.addReserva(nuevo);
            JOptionPane.showMessageDialog(this, "Pedido Registrado!", "Info", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datos Ingresados Incorrectos!", "Catch", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtTarifaDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarifaDiariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarifaDiariaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limpiarCampos() {
        txtNroHabitacion.setText("");
        txtDias.setText("");
        txtCantidadNini.setText("");
        txtTarifaDiaria.setText("");
        txtTarifaNin.setText("");
        cboTipoReserva.setSelectedIndex(-1);
    }

    private boolean validarCampos() {

        boolean result = true;
        if (txtNroHabitacion.getText().isBlank() || txtNroHabitacion.getText().isEmpty()) {
            result = false;
            return result;
        }
        if (txtDias.getText().isBlank() || txtDias.getText().isEmpty()) {
            result = false;
            return result;
        }
        if (txtTarifaDiaria.getText().isBlank() || txtTarifaDiaria.getText().isEmpty()) {
            result = false;
            return result;
        }
        if (cboTipoReserva.getSelectedIndex() == -1) {
            result = false;
            return result;
        }
//        if (checkVigente.isSelected() == false) {
//            result = false;
//            return result;
//        }

        return result;

//        if (checkUso.isSelected()) {
//            txtCantidadInq.setEnabled(false);
//        }
//        else
//            txtCantidadInq.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboTipoReserva;
    private javax.swing.JCheckBox checkVigente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCantidadNini;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtNroHabitacion;
    private javax.swing.JTextField txtTarifaDiaria;
    private javax.swing.JTextField txtTarifaNin;
    // End of variables declaration//GEN-END:variables
}
