package com.anuj.org.model.currency;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class Currency implements Serializable {

    @Size(min = 3, max = 5)
    String name;
    String symbol;
    Region region;

    public Currency(){
    }

    public Currency(@Size(min = 3, max = 5) String name, String symbol, Region region) {
        this.name = name;
        this.symbol = symbol;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
