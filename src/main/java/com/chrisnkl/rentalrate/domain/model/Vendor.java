package com.chrisnkl.rentalrate.domain.model;

import com.chrisnkl.rentalrate.domain.exception.VendorValidationFailedException;

public record Vendor(

        String name

) {

    public Vendor {
        if (name == null || name.isBlank()) {
            throw new VendorValidationFailedException(String.format("Vendor validation failed. Name: %s", name));
        }
    }

}
