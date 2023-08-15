package com.aadeveloping.microservices.currencyconversionservice;

import com.aadeveloping.microservices.currencyconversionservice.model.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "Currency-exchange", url = "localhost:8000")
@FeignClient(name = "Currency-exchange")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue (
            @PathVariable String from,
            @PathVariable String to);
}
