package com.example.marjanpromotionapiv2test.Errors;

public enum ErrorMessageCaissier {
    MISSING_REQUIRED_FIELD("missing required field."),
    RECORD_ALREADY_EXISTS("Record already exist "),
    INTERNAL_SERVER_ERROR("server error"),
    NO_RECORD_FOUND("record with provided id is not found"),;

    private final String errorMessage;

    ErrorMessageCaissier(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessageCaissier() {
        return errorMessage;
    }
}
