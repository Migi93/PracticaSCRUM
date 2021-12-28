package com.b0ve.cmepps.calcpf.modelo.influencias;

import java.util.Arrays;

public class TablaInfluencias {

    private static final String[] consideraciones = {"Comunicación de datos",
        "Funciones distribuidas",
        "Prestaciones",
        "Gran uso de la configuración",
        "Velocidad de las transacciones",
        "Entrada de datos en línea",
        "Diseño para la eficiencia del usuario final",
        "Actualización de datos en línea",
        "Complegidad del proceso lógico interno de la aplicación",
        "Reusabilidad del código",
        "Facilidad de instalación",
        "Facilidad de operación",
        "Localizaciones múltiples",
        "Facilidad de cambios"};

    public static String[] getConsideraciones() {
        return consideraciones;
    }

    private final int[] valores;

    public TablaInfluencias() {
        valores = new int[14];
    }

    public void setValor(int i, int valor) {
        if (valor >= 0 && valor <= 5) {
            valores[i] = valor;
        }
    }

    public int getValor(int i) {
        return valores[i];
    }

    public double getFA() {
        return 0.65d + (0.01d * (double) getSVA());
    }

    public int getSVA() {
        return Arrays.stream(valores).sum();
    }
}
