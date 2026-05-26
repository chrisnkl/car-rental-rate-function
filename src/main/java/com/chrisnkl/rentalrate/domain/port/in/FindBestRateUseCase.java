package com.chrisnkl.rentalrate.domain.port.in;

import com.chrisnkl.rentalrate.domain.model.Quote;

import java.util.List;

public interface FindBestRateUseCase {

    List<Quote> findBestRates(String tripId);

}
