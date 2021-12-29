package com.b0ve.cmepps.calcpf.gui;

import com.b0ve.cmepps.calcpf.gui.ajuste.VentanaCaracteristicas;
import com.b0ve.cmepps.calcpf.gui.ajuste.VentanaPFA;
import com.b0ve.cmepps.calcpf.gui.elementos.VentanaListaElementos;
import com.b0ve.cmepps.calcpf.gui.elementos.VentanaPFNA;
import com.b0ve.cmepps.calcpf.gui.estimacion.VentanaCategoriaISBSG;
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
        menuItemPFNA = new javax.swing.JMenuItem();
        menuFactorCorreccion = new javax.swing.JMenu();
        menuItemCaracteristicas = new javax.swing.JMenuItem();
        menuItemPFA = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuItemCategoria = new javax.swing.JMenuItem();

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

        menuItemPFNA.setText("PFNA");
        menuItemPFNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPFNAActionPerformed(evt);
            }
        });
        menuElementosFuncionales.add(menuItemPFNA);

        menubar.add(menuElementosFuncionales);

        menuFactorCorreccion.setText("Factor de corrección");

        menuItemCaracteristicas.setText("Características");
        menuItemCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCaracteristicasActionPerformed(evt);
            }
        });
        menuFactorCorreccion.add(menuItemCaracteristicas);

        menuItemPFA.setText("PFA");
        menuItemPFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPFAActionPerformed(evt);
            }
        });
        menuFactorCorreccion.add(menuItemPFA);

        menubar.add(menuFactorCorreccion);

        jMenu1.setText("Estimación");

        menuItemCategoria.setText("Seleccionar categoria");
        menuItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemCategoria);

        menubar.add(jMenu1);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
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

    private void menuItemPFNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPFNAActionPerformed
        openFrame(new VentanaPFNA(estimacion.getElementosFuncionales()));
    }//GEN-LAST:event_menuItemPFNAActionPerformed

    private void menuItemCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCaracteristicasActionPerformed
        openFrame(new VentanaCaracteristicas(estimacion.getTablaInfluencias()));
    }//GEN-LAST:event_menuItemCaracteristicasActionPerformed

    private void menuItemPFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPFAActionPerformed
        openFrame(new VentanaPFA(estimacion));
    }//GEN-LAST:event_menuItemPFAActionPerformed

    private void menuItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCategoriaActionPerformed
        openFrame(new VentanaCategoriaISBSG(estimacion));
    }//GEN-LAST:event_menuItemCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuElementosFuncionales;
    private javax.swing.JMenu menuFactorCorreccion;
    private javax.swing.JMenuItem menuItemCaracteristicas;
    private javax.swing.JMenuItem menuItemCategoria;
    private javax.swing.JMenuItem menuItemCerrar;
    private javax.swing.JMenuItem menuItemListaElementos;
    private javax.swing.JMenuItem menuItemPFA;
    private javax.swing.JMenuItem menuItemPFNA;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuBar menubar;
    // End of variables declaration//GEN-END:variables
}
