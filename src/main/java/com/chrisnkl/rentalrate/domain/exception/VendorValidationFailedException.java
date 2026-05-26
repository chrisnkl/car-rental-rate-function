package com.chrisnkl.rentalrate.domain.exception;

public final class VendorValidationFailedException extends DomainException {

    public VendorValidationFailedException() {
        super();
    }

    public VendorValidationFailedException(String message) {
        super(message);
    }

    public VendorValidationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public VendorValidationFailedException(Throwable cause) {
        super(cause);
    }

}
