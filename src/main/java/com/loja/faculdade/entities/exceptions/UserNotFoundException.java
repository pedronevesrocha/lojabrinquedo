package com.loja.faculdade.entities.exceptions;

public class UserNotFoundException extends Exception {
	public UserNotFoundException(String string) {
        super("usario não encontrado com o ID: " + string);
    }
}
