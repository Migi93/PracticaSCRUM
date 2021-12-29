package com.b0ve.cmepps.calcpf.modelo;

import com.b0ve.cmepps.calcpf.enums.Complejidad;
import static com.b0ve.cmepps.calcpf.enums.Complejidad.*;
import com.b0ve.cmepps.calcpf.enums.TipoElemento;
import static com.b0ve.cmepps.calcpf.enums.TipoElemento.*;
import com.b0ve.cmepps.calcpf.modelo.elementos.ElementoFuncional;
import com.b0ve.cmepps.calcpf.modelo.estimacion.ISBSG;
import com.b0ve.cmepps.calcpf.modelo.influencias.TablaInfluencias;
import java.io.Serializable;
import java.util.ArrayList;
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

    private final List<ElementoFuncional> elementosFuncionales;
    private final TablaInfluencias tablaInfluencias;
    private final ISBSG isbsg;

    public Estimacion() {
        elementosFuncionales = new ArrayList<>();
        tablaInfluencias = new TablaInfluencias();
        isbsg = new ISBSG();
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

    public static Map<TipoElemento, Map<Complejidad, Integer>> getPonderacion() {
        return ponderacion;
    }

}
