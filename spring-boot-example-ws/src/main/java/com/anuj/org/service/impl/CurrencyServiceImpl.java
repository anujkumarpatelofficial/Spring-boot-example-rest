package com.anuj.org.service.impl;

import com.anuj.org.model.currency.Currency;
import com.anuj.org.model.currency.Region;
import com.anuj.org.service.CurrencyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CurrencyServiceImpl implements CurrencyService {
    @Override
    public List<Currency> getAllCurrency() {
        List<Currency> currencies = new ArrayList<>();
        currencies.add(new Currency("US Dollar", "$", Region.ASIA));
        currencies.add(new Currency("AUS Dollar", "$", Region.EUROPE));
        currencies.add(new Currency("CAN Dollar", "$", Region.USA));
        return currencies;
    }

    public  List<Currency> add(Currency currency){
        List<Currency> currencies  =   getAllCurrency();
        currencies.add(currency);
        return currencies;
    }
}
