package br.com.app.user.entrypoint.rest.exceptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(final String userNotFound, final String userId) {

    }
}
