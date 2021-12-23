package com.b0ve.cmepps.calcpf.gui;

import com.b0ve.cmepps.calcpf.gui.elementos.VentanaListaElementos;
import static com.b0ve.cmepps.calcpf.helpers.PFHelper.openFrame;
import com.b0ve.cmepps.calcpf.modelo.Estimacion;

public final class VentanaPrincipal extends javax.swing.JFrame {

    private Estimacion estimacion;

    public VentanaPrincipal() {
        estimacion = new Estimacion();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemCerrar = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        menuElementosFuncionales = new javax.swing.JMenu();
        menuItemListaElementos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalcPF");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel5.setText("CalcPF CMEPPS UHU 2022");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/b0ve/cmepps/calcpf/src/bg.jpg"))); // NOI18N

        menuArchivo.setText("Archivo");

        menuItemCerrar.setText("Cerrar");
        menuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemCerrar);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemSalir);

        menubar.add(menuArchivo);

        menuElementosFuncionales.setText("Elementos Funcionales");

        menuItemListaElementos.setText("Lista de elementos");
        menuItemListaElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaElementosActionPerformed(evt);
            }
        });
        menuElementosFuncionales.add(menuItemListaElementos);

        menubar.add(menuElementosFuncionales);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 278, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarActionPerformed
        estimacion = new Estimacion();
    }//GEN-LAST:event_menuItemCerrarActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemListaElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaElementosActionPerformed
        openFrame(new VentanaListaElementos(estimacion.getElementosFuncionales()));
    }//GEN-LAST:event_menuItemListaElementosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuElementosFuncionales;
    private javax.swing.JMenuItem menuItemCerrar;
    private javax.swing.JMenuItem menuItemListaElementos;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuBar menubar;
    // End of variables declaration//GEN-END:variables
}
