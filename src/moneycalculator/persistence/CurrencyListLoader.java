package moneycalculator.persistence;

import moneycalculator.model.Currency;

/**
 * @author julioblanco
 */
public interface CurrencyListLoader {
    Currency[] currencies();
}
