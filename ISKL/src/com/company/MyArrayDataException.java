package com.company;

public class MyArrayDataException extends Throwable {

        public MyArrayDataException(String message) {
            super("Некорректные данные "+message);
        }
    }

