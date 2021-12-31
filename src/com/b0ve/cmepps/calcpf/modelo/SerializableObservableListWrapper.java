package com.b0ve.cmepps.calcpf.modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class SerializableObservableListWrapper<T> extends ArrayList<T> implements Serializable {

    private transient Actualizable actualizable;

    public void setActualizable(Actualizable actualizable) {
        this.actualizable = actualizable;
    }

    @Override
    public boolean remove(Object o) {
        boolean res = super.remove(o);
        if (actualizable != null) {
            actualizable.actualizar();
        }
        return res;
    }

    @Override
    public boolean add(T e) {
        boolean res = super.add(e);
        if (actualizable != null) {
            actualizable.actualizar();
        }
        return res;
    }

}
