package edu.eci.arsw.MercadoValores.Controller;

public interface MercadoValoresAPIController {
    StockData getIntraday(String symbol);
    StockData getDaily(String symbol);
    StockData getWeekly(String symbol);
    StockData getMonthly(String symbol);
}
