package br.com.app.user.usecase.validator;

import br.com.app.user.domain.User;
import br.com.app.user.usecase.exception.UserValidationException;

public class UserValidator {

    public static void validateCreateUser(final User user) {

        if (isEmail(user.getEmail())) {
            throw new UserValidationException("Email should not be null");
        }
        if (isSingleName(user.getFirstName())) {
            throw new UserValidationException("First name should not be null");
        }

    }

    private static boolean isSingleName(final String firstName) {
        return true;
    }

    private static boolean isEmail(final String email) {
        return true;
    }
}
