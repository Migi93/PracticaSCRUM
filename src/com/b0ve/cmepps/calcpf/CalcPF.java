package com.b0ve.cmepps.calcpf;

import com.b0ve.cmepps.calcpf.gui.VentanaPrincipal;
import static com.b0ve.cmepps.calcpf.helpers.PFHelper.openFrame;
import javax.swing.UIManager;

public class CalcPF {

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        openFrame(new VentanaPrincipal());
    }

}
