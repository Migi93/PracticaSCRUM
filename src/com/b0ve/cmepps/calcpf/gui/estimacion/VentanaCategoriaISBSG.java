package com.b0ve.cmepps.calcpf.gui.estimacion;

import com.b0ve.cmepps.calcpf.modelo.Estimacion;
import com.b0ve.cmepps.calcpf.modelo.estimacion.CategoriaISBSG;
import com.b0ve.cmepps.calcpf.modelo.estimacion.ISBSG;

public class VentanaCategoriaISBSG extends javax.swing.JFrame {

    private final Estimacion estimacion;

    public VentanaCategoriaISBSG(Estimacion estimacion) {
        this.estimacion = estimacion;
        initComponents();
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboEsfuerzo = new javax.swing.JComboBox<CategoriaISBSG>();
        jLabel2 = new javax.swing.JLabel();
        comboDuracion = new javax.swing.JComboBox<CategoriaISBSG>();
        labelEstimacion = new javax.swing.JLabel();
        labelECesfuerzo = new javax.swing.JLabel();
        labelECduracuin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Categoria ISBSB");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setText("Categoria para el esferuzo");

        comboEsfuerzo.setModel(new javax.swing.DefaultComboBoxModel<CategoriaISBSG>(ISBSG.getCategoriasEsferuzo()));
        comboEsfuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEsfuerzoActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria para la duración");

        comboDuracion.setModel(new javax.swing.DefaultComboBoxModel<CategoriaISBSG>(ISBSG.getCategoriasDuracion()));
        comboDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDuracionActionPerformed(evt);
            }
        });

        labelEstimacion.setText("Estimación: ");

        labelECesfuerzo.setText("C: E:");

        labelECduracuin.setText("C: E:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEsfuerzo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboDuracion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(labelEstimacion)
                            .addComponent(labelECesfuerzo)
                            .addComponent(labelECduracuin))
                        .addGap(0, 203, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEsfuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(labelECesfuerzo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelECduracuin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEstimacion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEsfuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEsfuerzoActionPerformed
        estimacion.getISBSG().setCategoriaEsfuerzo((CategoriaISBSG) comboEsfuerzo.getSelectedItem());
        actualizar();
    }//GEN-LAST:event_comboEsfuerzoActionPerformed

    private void comboDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDuracionActionPerformed
        estimacion.getISBSG().setCategoriaDuracion((CategoriaISBSG) comboDuracion.getSelectedItem());
        actualizar();
    }//GEN-LAST:event_comboDuracionActionPerformed

    private void actualizar() {
        labelECesfuerzo.setText(String.format("Esfuerzo C: %.3f E: %.3f", estimacion.getISBSG().getCategoriaEsfuerzo().getC(), estimacion.getISBSG().getCategoriaEsfuerzo().getE()));
        labelECduracuin.setText(String.format("Duracion C: %.3f E: %.3f", estimacion.getISBSG().getCategoriaDuracion().getC(), estimacion.getISBSG().getCategoriaDuracion().getE()));
        labelEstimacion.setText(String.format("Estimación Esfuerzo: %.2f Duración: %.2f", estimacion.getEsfuerzo(), estimacion.getDuracion()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<CategoriaISBSG> comboDuracion;
    private javax.swing.JComboBox<CategoriaISBSG> comboEsfuerzo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelECduracuin;
    private javax.swing.JLabel labelECesfuerzo;
    private javax.swing.JLabel labelEstimacion;
    // End of variables declaration//GEN-END:variables
}
