package persistance;

import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

/**
 *
 * @author sauld
 */

public interface ExchangeRateLoader{
    public ExchangeRate load(Currency origen, Currency cambio);
}
