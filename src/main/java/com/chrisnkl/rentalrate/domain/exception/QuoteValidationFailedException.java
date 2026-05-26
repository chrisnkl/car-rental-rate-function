package com.chrisnkl.rentalrate.domain.exception;

public final class QuoteValidationFailedException extends DomainException {

    public QuoteValidationFailedException() {
        super();
    }

    public QuoteValidationFailedException(String message) {
        super(message);
    }

    public QuoteValidationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuoteValidationFailedException(Throwable cause) {
        super(cause);
    }
}
