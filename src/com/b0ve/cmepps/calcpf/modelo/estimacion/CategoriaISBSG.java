package com.b0ve.cmepps.calcpf.modelo.estimacion;

import java.io.Serializable;

public class CategoriaISBSG implements Serializable {

    private double C;
    private double E;
    private String nombre;

    public CategoriaISBSG(String nombre, double C, double E) {
        this.nombre = nombre;
        this.C = C;
        this.E = E;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getE() {
        return E;
    }

    public void setE(double E) {
        this.E = E;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcular(double pf) {
        return Math.pow(pf, E) * C;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
