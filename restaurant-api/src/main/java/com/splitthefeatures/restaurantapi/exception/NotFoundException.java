package com.splitthefeatures.restaurantapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends BaseException {
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }
}
