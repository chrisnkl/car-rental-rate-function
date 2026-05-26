package com.chrisnkl.rentalrate.domain.model;

import com.chrisnkl.rentalrate.domain.exception.QuoteValidationFailedException;

import java.math.BigDecimal;

public record Quote(

        String vendor,
        BigDecimal price

) {

    public Quote {
        if ((vendor == null || vendor.isBlank()) || (price == null || price.compareTo(BigDecimal.ZERO) <= 0)) {
            throw new QuoteValidationFailedException(String.format("Quote validation failed. Vendor: %s, Price: %s", vendor, price));
        }
    }

}
