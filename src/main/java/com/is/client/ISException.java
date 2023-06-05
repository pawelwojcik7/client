package com.is.client;

import com.is.client.laptopservice.Processor;

import java.util.Arrays;

public class ISException extends RuntimeException {

    public ISException(ErrorMesages e) {
        super(e.getCode() + ": " + e.getMessage());

        Arrays.stream(ErrorMesages.values()).filter(eM -> eM.getCauseClass().equals(Processor.class)).toList();
    }
}
