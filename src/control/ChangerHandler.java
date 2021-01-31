package control;

import model.ExchangeRate;
import model.Money;

/**
 *
 * @author sauld
 */

public class ChangerHandler implements Changer{
    @Override
    public Money calculate(Money dinero, ExchangeRate exchangeRate){
        double newAmount = (dinero.getAmount() * exchangeRate.getRate());  
        Money newMoney = new Money(newAmount,exchangeRate.getTo());  
        return newMoney;
    }    
}
