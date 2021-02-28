package com.anuj.org.service;

import com.anuj.org.model.currency.Currency;

import java.util.List;

public interface CurrencyService {

    public List<Currency> getAllCurrency();

    public  List<Currency> add(Currency currency);
}
