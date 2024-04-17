package com.bogdan.alura.modelos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TipoConversion {
    private HashMap<Integer, String[]> conversiones= new HashMap<>();

    public TipoConversion() {
        this.conversiones.put(1, new String[]{"USD","ARS"});
        this.conversiones.put(2, new String[]{"ARS","USD"});
        this.conversiones.put(3, new String[]{"USD","BRL"});
        this.conversiones.put(4, new String[]{"BRL","USD"});
        this.conversiones.put(5, new String[]{"USD","COP"});
        this.conversiones.put(6, new String[]{"COP","USD"});
        this.conversiones.put(7, new String[]{"USD","MXN"});
        this.conversiones.put(8, new String[]{"MXN","USD"});
    }


    public HashMap<Integer, String[]> getConversiones() {
        return conversiones;
    }
}
