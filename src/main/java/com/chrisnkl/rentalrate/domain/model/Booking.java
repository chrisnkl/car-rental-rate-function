package com.chrisnkl.rentalrate.domain.model;

import com.chrisnkl.rentalrate.domain.exception.BookingValidationFailedException;

public record Booking(

        String tripId
) {

    public Booking {
        if ((tripId == null || tripId.isBlank())) {
            throw new BookingValidationFailedException(String.format("Booking validation failed. Trip ID: %s", tripId));
        }
    }

}
