package edu.eci.arsw.MercadoValores.Service;

import edu.eci.arsw.MercadoValores.Controller.MercadoProveedor;
import edu.eci.arsw.MercadoValores.Model.Valores;
import edu.eci.arsw.MercadoValores.Persistence.ValoresPersistence;
import jdk.jfr.Frequency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MercadoValoresService {

    private String lapso;
    @Autowired
    ValoresPersistence mvp;

    public void addNewValores(Valores valores){
        mvp.saveValores(valores);
    }

    public Set<Valores> getAllValores(){
        return mvp.getAllValores();
    }

    public ValoresPersistence getData(String symbol, String frequency) {
        switch (frequency) {
            case INTRADAY:
                return MercadoProveedor.getIntraday(symbol);
            case DAILY:
                return MercadoProveedor.getDaily(symbol);
            case WEEKLY:
                return MercadoProveedor.getWeekly(symbol);
            case MONTHLY:
                return MercadoProveedor.getMonthly(symbol);
            default:
                throw new IllegalArgumentException("");
        }
    }
}
