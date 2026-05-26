package com.chrisnkl.rentalrate.application.usecase;

import com.chrisnkl.rentalrate.domain.model.Quote;
import com.chrisnkl.rentalrate.domain.port.in.FindBestRateUseCase;

import java.util.List;

public class FindBestRateService implements FindBestRateUseCase {

    @Override
    public List<Quote> findBestRates(String tripId) {
        return List.of();
    }
}
