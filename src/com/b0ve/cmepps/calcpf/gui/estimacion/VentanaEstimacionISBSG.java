package com.b0ve.cmepps.calcpf.gui.estimacion;

import com.b0ve.cmepps.calcpf.modelo.Estimacion;

public class VentanaEstimacionISBSG extends javax.swing.JFrame {

    public VentanaEstimacionISBSG(Estimacion estimacion) {
        initComponents();
        labelEsfuerzo.setText(String.format("Esfuerzo = C*PF^E = %.2f*%.2f^%.2f = %.2f", estimacion.getISBSG().getCategoriaEsfuerzo().getC(), estimacion.getPFA(), estimacion.getISBSG().getCategoriaEsfuerzo().getE(), estimacion.getEsfuerzo()));
        labelDuracion.setText(String.format("Duración = C*PF^E = %.2f*%.2f^%.2f = %.2f", estimacion.getISBSG().getCategoriaDuracion().getC(), estimacion.getPFA(), estimacion.getISBSG().getCategoriaDuracion().getE(), estimacion.getDuracion()));
        labelCantidadDePersonas.setText(String.format("Cantidad de personas = esfuerzo/(duración*20*8) = %.2f/(%.2f*20*8) = %.2f", estimacion.getEsfuerzo(), estimacion.getDuracion(), estimacion.getCandidadDePersonas()));
        labelCoste.setText(String.format("Coste = esfuerzo*costeMedioPorHora = %.2f*%.2f = %.2f", estimacion.getEsfuerzo(), estimacion.getCosteTrabajadorPorHora(), estimacion.getCoste()));
        labelProductividad.setText(String.format("Productividad = esfuerzo/PF = %.2f/%.2f = %.2f", estimacion.getEsfuerzo(), estimacion.getPFA(), estimacion.getProductividad()));
        labelVeloidadEntrega.setText(String.format("Velocidad de entrega = PF/duración = %.2f/%.2f = %.2f", estimacion.getPFA(), estimacion.getDuracion(), estimacion.getVelocidadDeEntrega()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEsfuerzo = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        labelCantidadDePersonas = new javax.swing.JLabel();
        labelCoste = new javax.swing.JLabel();
        labelVeloidadEntrega = new javax.swing.JLabel();
        labelProductividad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estimación ISBSB");
        setAlwaysOnTop(true);
        setResizable(false);

        labelEsfuerzo.setText("Esfuerzo");

        labelDuracion.setText("Duración");

        labelCantidadDePersonas.setText("Cantidad de personas");

        labelCoste.setText("Coste");

        labelVeloidadEntrega.setText("Velocidad de entrega");

        labelProductividad.setText("Productividad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEsfuerzo)
                    .addComponent(labelDuracion)
                    .addComponent(labelCantidadDePersonas)
                    .addComponent(labelCoste)
                    .addComponent(labelVeloidadEntrega)
                    .addComponent(labelProductividad))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEsfuerzo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDuracion)
                .addGap(18, 18, 18)
                .addComponent(labelCantidadDePersonas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCoste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelProductividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVeloidadEntrega)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelCantidadDePersonas;
    private javax.swing.JLabel labelCoste;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelEsfuerzo;
    private javax.swing.JLabel labelProductividad;
    private javax.swing.JLabel labelVeloidadEntrega;
    // End of variables declaration//GEN-END:variables
}
