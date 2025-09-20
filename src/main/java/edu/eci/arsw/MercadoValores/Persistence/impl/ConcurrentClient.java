package edu.eci.arsw.MercadoValores.Persistence.impl;

import edu.eci.arsw.MercadoValores.Model.Valores;
import edu.eci.arsw.MercadoValores.Persistence.ValoresPersistence;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ConcurrentClient extends Thread implements ValoresPersistence {

    private static final Map<Valores, Integer> mercadoValores = new HashMap<>();

    public ConcurrentClient(String id) {

        Valores v1 = new Valores("MSFT", new ArrayList<>());
        Valores v2 = new Valores("IBM", new ArrayList<>());
        Valores v3 = new Valores("DAX", new ArrayList<>());

        mercadoValores.put(v1, 2);
        mercadoValores.put(v2, 45);
        mercadoValores.put(v3, 55);
    }

    @Override
    public Set<Valores> getAllValores() {
        return (Set<Valores>) mercadoValores;
    }


    @Override
    public void saveValores(Valores valores, int n){
        mercadoValores.put(valores, n);
    }

    public void run() {

        try {
            ConcurrentClient.getAllValores();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
