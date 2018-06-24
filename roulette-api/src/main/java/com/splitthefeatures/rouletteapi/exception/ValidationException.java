package com.splitthefeatures.rouletteapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationException extends BaseException {
    public ValidationException() {
    }

    public ValidationException(String message) {
        super(message);
    }
}
