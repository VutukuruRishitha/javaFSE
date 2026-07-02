package com.cognizant.spring_data_jpa_demo.service.exception;

public class CountryNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CountryNotFoundException() {
        super();
    }

    public CountryNotFoundException(String message) {
        super(message);
    }
}