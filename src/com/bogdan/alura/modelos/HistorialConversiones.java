package com.bogdan.alura.modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class HistorialConversiones {
    private ArrayList <Moneda> listaConversiones;
    private ArrayList <Integer> nConversion;
    private ArrayList <String> fechaHoraActual;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static int contador = 0;

    public HistorialConversiones() {
        this.listaConversiones = new ArrayList<>();
        this.nConversion = new ArrayList<>();
        this.fechaHoraActual = new ArrayList<>();
    }

    public void agregaConversion(Moneda moneda){
        LocalDateTime fechaYHora = LocalDateTime.now();
        String fechaHoraFormateada = fechaYHora.format(formatter);
        fechaHoraActual.add(fechaHoraFormateada);
        this.listaConversiones.add(moneda);
        ++contador;
        nConversion.add(contador);
    }

    public void muestraHistorialConversiones(){
        if (!(listaConversiones.isEmpty())) {
            for (int i = 0; i < contador; i++) {
                Moneda moneda = listaConversiones.get(i);
                String valorFormateado = String.format("%.2f", moneda.getValor());
                String conversionFormateada = String.format("%.2f", moneda.getConversion());
                String elemento = fechaHoraActual.get(i) + " Conversión " + nConversion.get(i) + ": " +
                        valorFormateado + " [" + moneda.getTipo() + "] =>> " +
                        conversionFormateada + " [" + moneda.getCambioMoneda() + "]";
                System.out.println(elemento);
            }
            System.out.println();
        }else {
            System.out.println("No hay registros de conversiones hasta ahora\n");
        }
    }
}
