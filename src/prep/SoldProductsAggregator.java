package prep;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Stream.*;
import static java.util.stream.Collectors.*;

package com.codility;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Stream.*;
import static java.util.stream.Collectors.*;


public class SoldProductsAggregator {

    private final EURExchangeService exchangeService;

    SoldProductsAggregator(EURExchangeService EURExchangeService) {
        this.exchangeService = EURExchangeService;
    }

    SoldProductsAggregate aggregate(Stream<SoldProduct> products) {

        mapProducts(products);

        return null;
    }

    public List<SoldProductsAggregate> mapProducts(Stream<SoldProduct> products) {

        List<SoldProductsAggregate> sPA = products.stream().map(p -> {
            SoldProductsAggregate s = new SoldProductsAggregate();
            s.getProducts.setName(p.getName());
            s.getProducts.setPrice(p.getPrice().exchangeService.ExchangeService());

            return s;
        }).collect(Collectors.toList());
    }

}

