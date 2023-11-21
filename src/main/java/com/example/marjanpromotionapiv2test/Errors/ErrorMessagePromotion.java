package com.example.marjanpromotionapiv2test.Errors;

import lombok.*;



public enum ErrorMessagePromotion {
    MISSING_REQUIRED_FIELD("missing required field."),
    RECORD_ALREADY_EXISTS("Record already exist "),
    INTERNAL_SERVER_ERROR("server error"),
    CATEGORIE_NOT_FOUND("Category with provided id is not found"),
    NO_RECORD_FOUND("record with provided id is not found"),
    OVER_THAN_50("percentage is over 50"),;

    private String errorMessage;

    ErrorMessagePromotion(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessagePromotion() {
        return errorMessage;
    }
}
