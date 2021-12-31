package com.b0ve.cmepps.calcpf.modelo.estimacion;

import com.b0ve.cmepps.calcpf.modelo.Actualizable;
import java.io.Serializable;

public class ISBSG implements Serializable {

    private static final CategoriaISBSG[] CATEGORIAS_ESFUERZO = {
        new CategoriaISBSG("MF", 49.02, 0.736),
        new CategoriaISBSG("MR", 78.88, 0.646),
        new CategoriaISBSG("PC", 48.90, 0.661),
        new CategoriaISBSG("Multi", 16.01, 0.865),
        new CategoriaISBSG("3GL", 54.65, 0.717),
        new CategoriaISBSG("4GL", 29.50, 0.758),
        new CategoriaISBSG("GenAp", 68.11, 0.660),
        new CategoriaISBSG("Mantenimineto", 52.58, 0.683),
        new CategoriaISBSG("Nuevo", 39.05, 0.731),
        new CategoriaISBSG("MF-3GL", 65.37, 0.705),
        new CategoriaISBSG("MF-4GL", 52.09, 0.640),
        new CategoriaISBSG("MF-GenAp", 65.68, 0.692),
        new CategoriaISBSG("MR-3GL", 126.3, 0.565),
        new CategoriaISBSG("MR-4GL", 62.35, 0.694),
        new CategoriaISBSG("PC-3GL", 60.46, 0.648),
        new CategoriaISBSG("PC-4GL", 36.48, 0.694),
        new CategoriaISBSG("Multi-3GL", 19.82, 0.666),
        new CategoriaISBSG("Multi-4GL", 6.49, 0.983),
        new CategoriaISBSG("MF-3GL-Mantenimineto", 83.27, 0.650)
    };
    private static final CategoriaISBSG[] CATEGORIAS_DURACION = {
        new CategoriaISBSG("PC", 0.503, 0.409),
        new CategoriaISBSG("Multi", 0.679, 0.341),
        new CategoriaISBSG("4GL", 0.578, 0.393),
        new CategoriaISBSG("Nuevo", 0.739, 0.359),
        new CategoriaISBSG("PC-4GL", 0.348, 0.471),
        new CategoriaISBSG("Multi-4GL", 0.366, 0.451),
        new CategoriaISBSG("PC-4GL-Nuevo", 0.250, 0.515),
        new CategoriaISBSG("Multi-4GL-Nuevo", 0.240, 0.518),
        new CategoriaISBSG("Otros", 0.411, 0.328)
    };

    private CategoriaISBSG categoriaEsfuerzo, categoriaDuracion;
    private transient Actualizable actualizable;

    public ISBSG() {
        categoriaEsfuerzo = CATEGORIAS_ESFUERZO[0];
        categoriaDuracion = CATEGORIAS_DURACION[0];
    }

    public static CategoriaISBSG[] getCategoriasEsferuzo() {
        return CATEGORIAS_ESFUERZO;
    }

    public static CategoriaISBSG[] getCategoriasDuracion() {
        return CATEGORIAS_DURACION;
    }

    public CategoriaISBSG getCategoriaEsfuerzo() {
        return categoriaEsfuerzo;
    }

    public CategoriaISBSG getCategoriaDuracion() {
        return categoriaDuracion;
    }

    public void setCategoriaEsfuerzo(CategoriaISBSG categoriaEsfuerzo) {
        this.categoriaEsfuerzo = categoriaEsfuerzo;
        actualizable.actualizar();
    }

    public void setCategoriaDuracion(CategoriaISBSG categoriaDuracion) {
        this.categoriaDuracion = categoriaDuracion;
        actualizable.actualizar();
    }

    public void setActualizable(Actualizable actualizable) {
        this.actualizable = actualizable;
    }

}
