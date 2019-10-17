package br.com.app.user.usecase.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(final String email) {
        super(email);
    }
}
