package edu.eci.arsw.MercadoValores.Model;

import java.util.List;

public class Valores {

    private final String id;
    private List<Integer> precios;


    public Valores(String id, List<Integer> precios) {
        this.id = id;
        this.precios = precios;
    }

    public String getId(){
        return id;
    }

    public List<Integer> getPrecios(){
        return precios;
    }
}
