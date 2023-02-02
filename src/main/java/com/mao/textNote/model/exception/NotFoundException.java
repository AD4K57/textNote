package com.mao.textNote.model.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NotFoundException extends Exception {

    public int code;
    public String message;
}
