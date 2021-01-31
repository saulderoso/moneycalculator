package control;

import model.ExchangeRate;
import model.Money;

/**
 *
 * @author sauld
 */

public interface Changer {
    public Money calculate(Money dinero, ExchangeRate exchangeRate); 
}
