
package Formularios;

import Entidades.Inmobiliaria;
import Entidades.Propiedad;
import javax.swing.table.DefaultTableModel;


public class frmListado extends javax.swing.JFrame {

    private Inmobiliaria gestor;
    
    public frmListado(Inmobiliaria g) {
        initComponents();
        this.setLocationRelativeTo(null);
        gestor = g;
        loadInfo();
    }
    
    private void loadInfo() {
        DefaultTableModel model = new DefaultTableModel();
        Propiedad[] todos = gestor.obtenerTodos();
        model.setColumnIdentifiers(new String[]{"Direccion","Cant Habitaciones","Precio Base","Uso Comercial", "cantidad Inquilinos"});
        for (Propiedad p : todos) {
            model.addRow(p.toArray());
        }
        
        jtPropiedades.setModel(model);
        
//        txtSumatoria.setText(String.valueOf(taller.sumatoriaPresupuestos()));
//        txtDuracion.setText(String.valueOf(taller.supera30Dias()));
//        txtPromedio.setText(String.valueOf(taller.promedioRecaudacion()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtPropiedades = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtPropiedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtPropiedades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPropiedades;
    // End of variables declaration//GEN-END:variables
}
