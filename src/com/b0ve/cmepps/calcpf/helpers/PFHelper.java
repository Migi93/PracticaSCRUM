package com.b0ve.cmepps.calcpf.helpers;

import com.b0ve.cmepps.calcpf.gui.VentanaPrincipal;
import javax.swing.JFrame;

public class PFHelper {

    private static JFrame ventanaPrincipal;

    public static void openFrame(JFrame frame) {
        frame.setVisible(true);
        frame.setLocationRelativeTo(ventanaPrincipal);
        if (frame instanceof VentanaPrincipal) {
            ventanaPrincipal = frame;
        }
    }
}
