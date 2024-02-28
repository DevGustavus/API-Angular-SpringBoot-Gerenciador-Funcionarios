package com.devgustavus.gerenciadorfuncionarios.Exception;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(String message) {
		super(message);
	}
}
