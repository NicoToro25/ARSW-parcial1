package edu.eci.arsw.MercadoValores.Persistence;

import edu.eci.arsw.MercadoValores.Model.Valores;

import java.util.Set;

public interface ValoresPersistence {

    public default void saveValores(Valores valores){
    }

    public Set<Valores> getAllValores();

    public Set<Valores> getAllValores();

    void saveValores(Valores valores, int n);
}
