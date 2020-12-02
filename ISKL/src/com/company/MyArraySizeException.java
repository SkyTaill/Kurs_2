package com.company;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("не правильный размер массива");
    }
}
