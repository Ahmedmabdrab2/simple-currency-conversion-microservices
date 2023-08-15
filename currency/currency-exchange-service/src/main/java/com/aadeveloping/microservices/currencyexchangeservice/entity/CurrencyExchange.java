package com.aadeveloping.microservices.currencyexchangeservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;
@Getter
@Setter

@NoArgsConstructor
@Entity(name = "currency_exchange")
public class CurrencyExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "currency_from" )
    @NonNull
    private String from;
    @Column(name = "currency_to")
    @NonNull
    private String to;
    @Column(name = "conversion_multiple")
    @NonNull
    private BigDecimal conversionMultiple;
    private String environment;

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }
}

