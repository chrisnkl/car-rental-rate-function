package com.chrisnkl.rentalrate.domain.exception;

public final class BookingValidationFailedException extends DomainException {

    public BookingValidationFailedException() {
        super();
    }

    public BookingValidationFailedException(String message) {
        super(message);
    }

    public BookingValidationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookingValidationFailedException(Throwable cause) {
        super(cause);
    }

}
