package com.transacitonal.exampletransactional.exception;

public class InsufficientAmountException extends RuntimeException {

    public InsufficientAmountException(String msg){

    super(msg);
    }
}
