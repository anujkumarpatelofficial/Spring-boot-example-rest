package com.anuj.org.controller.v1;

import com.anuj.org.model.currency.Currency;
import com.anuj.org.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    public static final String VERSION = "/v1";
    public static final String ALL_CURRENCIES = VERSION;


    @Autowired
    CurrencyService currencyService;

    @GetMapping(ALL_CURRENCIES)
    public List<Currency>  getAllCurrencies(){
        return currencyService.getAllCurrency();
    }

    @PostMapping (ALL_CURRENCIES)
    public List<Currency>  add(@RequestBody @Valid Currency currency){
        return currencyService.add(currency);
    }
}
