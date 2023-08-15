package com.aadeveloping.microservices.currencyexchangeservice.controller;

import com.aadeveloping.microservices.currencyexchangeservice.entity.CurrencyExchange;
import com.aadeveloping.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CurrencyExchangeController {
    private final CurrencyExchangeRepository currencyExchangeRepository;
    private final Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to)
            { CurrencyExchange currencyExchange =
                    currencyExchangeRepository.findByFromAndTo(from, to);
        if (currencyExchange == null)
            throw new RuntimeException("unable to find the data for"+ from + "to" +to);
       // CurrencyExchange currencyExchange = new CurrencyExchange(1000L,from,to,
         //       BigDecimal.valueOf(50));
        String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }

    }

