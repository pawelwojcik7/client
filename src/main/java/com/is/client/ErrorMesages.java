package com.is.client;

import com.is.client.laptopservice.Processor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ErrorMesages {

    RECORD_NOT_FOUND(904, "Record not found", Processor.class);

    @Getter
    private final Integer code;

    @Getter
    private final String message;

    @Getter
    private final Class<?> causeClass;

}
