package com.splitthefeatures.rouletteapi.exception;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public class BaseException extends RuntimeException {
    public BaseException() {
    }
    public BaseException(String message) {
        super(message);
    }

}