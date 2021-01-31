package main;

import persistance.CurrencyListLoader;
import persistance.file.FileCurrencyListLoader;

/**
 *
 * @author sauld
 */

public class MoneyCalculator {

    public static void main(String[] args) throws Exception{
        CurrencyListLoader Loader=new FileCurrencyListLoader("Divisas.txt");
        MoneyCalculatorFrame calc=new MoneyCalculatorFrame(Loader.currencies());
    }
}
