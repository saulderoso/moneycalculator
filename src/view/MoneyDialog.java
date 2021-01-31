package view;

import model.Currency;
import model.Money;

/**
 *
 * @author sauld
 */

public interface MoneyDialog {
    public Money get();
    public Currency getNewCurrency();
}
