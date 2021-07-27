package com.alan.javabase.throwable;

import java.io.FileNotFoundException;

public class ErrorAndException {

    private void throwError() {
        throw new StackOverflowError();
    }

    private void throwRuntimeException() {
        throw new RuntimeException();
    }

    private void throwCheckException() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ErrorAndException eae = new ErrorAndException();
        eae.throwError();
        eae.throwRuntimeException();
        eae.throwCheckException();
    }
}
