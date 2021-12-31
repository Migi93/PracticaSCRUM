package com.b0ve.cmepps.calcpf.modelo;

import com.b0ve.cmepps.calcpf.enums.Complejidad;
import static com.b0ve.cmepps.calcpf.enums.Complejidad.*;
import com.b0ve.cmepps.calcpf.enums.TipoElemento;
import static com.b0ve.cmepps.calcpf.enums.TipoElemento.*;
import com.b0ve.cmepps.calcpf.modelo.elementos.ElementoFuncional;
import com.b0ve.cmepps.calcpf.modelo.estimacion.ISBSG;
import com.b0ve.cmepps.calcpf.modelo.influencias.TablaInfluencias;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Estimacion implements Serializable {

    private static final Map<TipoElemento, Map<Complejidad, Integer>> ponderacion = Stream.of(new Object[][]{
        {EE, Stream.of(new Object[][]{{SIMPLE, 3}, {MEDIA, 4}, {COMPLEJA, 6}}).collect(Collectors.toMap(data -> (Complejidad) data[0], data -> (Integer) data[1]))},
        {SE, Stream.of(new Object[][]{{SIMPLE, 4}, {MEDIA, 5}, {COMPLEJA, 7}}).collect(Collectors.toMap(data -> (Complejidad) data[0], data -> (Integer) data[1]))},
        {CE, Stream.of(new Object[][]{{SIMPLE, 3}, {MEDIA, 4}, {COMPLEJA, 6}}).collect(Collectors.toMap(data -> (Complejidad) data[0], data -> (Integer) data[1]))},
        {FLI, Stream.of(new Object[][]{{SIMPLE, 7}, {MEDIA, 10}, {COMPLEJA, 15}}).collect(Collectors.toMap(data -> (Complejidad) data[0], data -> (Integer) data[1]))},
        {FLE, Stream.of(new Object[][]{{SIMPLE, 5}, {MEDIA, 7}, {COMPLEJA, 10}}).collect(Collectors.toMap(data -> (Complejidad) data[0], data -> (Integer) data[1]))}
    }).collect(Collectors.toMap(data -> (TipoElemento) data[0], data -> (Map<Complejidad, Integer>) data[1]));

    private double costeTrabajadorPorHora;
    private transient Actualizable actualizable;
    private final SerializableObservableListWrapper<ElementoFuncional> elementosFuncionales;
    private final TablaInfluencias tablaInfluencias;
    private final ISBSG isbsg;

    public Estimacion() {
        elementosFuncionales = new SerializableObservableListWrapper<>();
        tablaInfluencias = new TablaInfluencias();
        isbsg = new ISBSG();
    }

    public void setCosteTrabajadorPorHora(double costeTrabajadorPorHora) {
        this.costeTrabajadorPorHora = costeTrabajadorPorHora;
        if (actualizable != null) {
            actualizable.actualizar();
        }
    }

    public double getCosteTrabajadorPorHora() {
        return costeTrabajadorPorHora;
    }

    public List<ElementoFuncional> getElementosFuncionales() {
        return elementosFuncionales;
    }

    public TablaInfluencias getTablaInfluencias() {
        return tablaInfluencias;
    }

    public ISBSG getISBSG() {
        return isbsg;
    }

    public int getPFNA() {
        return elementosFuncionales.stream().mapToInt(e -> ponderacion.get(e.getTipo()).get(e.getComplegidad())).sum();
    }

    public double getFA() {
        return tablaInfluencias.getFA();
    }

    public int getSVA() {
        return tablaInfluencias.getSVA();
    }

    public double getPFA() {
        return getPFNA() * tablaInfluencias.getFA();
    }

    public double getEsfuerzo() {
        return isbsg.getCategoriaEsfuerzo().calcular(getPFA());
    }

    public double getDuracion() {
        return isbsg.getCategoriaDuracion().calcular(getPFA());
    }

    public double getCandidadDePersonas() {
        return getEsfuerzo() / (getDuracion() * 20D * 8D);
    }

    public double getCoste() {
        return getEsfuerzo() * costeTrabajadorPorHora;
    }

    public double getProductividad() {
        return getEsfuerzo() / getPFA();
    }

    public double getVelocidadDeEntrega() {
        return getPFA() / getDuracion();
    }

    public static Map<TipoElemento, Map<Complejidad, Integer>> getPonderacion() {
        return ponderacion;
    }

    public void setActualizable(Actualizable act) {
        actualizable = act;
        elementosFuncionales.setActualizable(act);
        tablaInfluencias.setActualizable(act);
        isbsg.setActualizable(act);
    }

    @Override
    public String toString() {
        return String.format("<html><h2>CalcPF</h2><h3>PFNA %d</h3><h3>FA %.2f</h3><h3>PFA %.2f</h3><h3>Esfuerzo %.2f horas</h3><h3>Duración %.2f horas</h3></html>", getPFNA(), getFA(), getPFA(), getEsfuerzo(), getDuracion() * 20D * 8D);
    }

}
