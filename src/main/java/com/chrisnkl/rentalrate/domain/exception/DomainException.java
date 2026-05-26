package com.chrisnkl.rentalrate.domain.exception;

import lombok.Getter;

@Getter
public sealed class DomainException extends RuntimeException permits BookingValidationFailedException, QuoteValidationFailedException, VendorValidationFailedException {

    public DomainException() {
        super();
    }

    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }

    public DomainException(Throwable cause) {
        super(cause);
    }
}
