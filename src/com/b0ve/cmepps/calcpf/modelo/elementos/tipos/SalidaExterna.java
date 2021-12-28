package com.b0ve.cmepps.calcpf.modelo.elementos.tipos;

import com.b0ve.cmepps.calcpf.enums.Complejidad;
import com.b0ve.cmepps.calcpf.enums.TipoElemento;
import com.b0ve.cmepps.calcpf.modelo.elementos.Transaccion;

public class SalidaExterna extends Transaccion {

    public SalidaExterna(String nombre) {
        super(nombre, TipoElemento.SE);
    }

    @Override
    public Complejidad getComplegidad() {
        return consultarTabla(1, 3, 5, 19, null);
    }

}
