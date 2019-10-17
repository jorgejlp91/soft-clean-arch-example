package br.com.app.user.usecase.validator;

import br.com.app.user.domain.User;
import br.com.app.user.usecase.exception.UserValidationException;
import org.springframework.util.StringUtils;

public class UserValidator {

    public static void validateCreateUser(final User user) {
        if (user == null) {
            throw new UserValidationException("User should not be null");
        }
        if (StringUtils.isEmpty(user.getEmail())) {
            throw new UserValidationException("Email should not be null");
        }
        if (StringUtils.isEmpty(user.getFirstName())) {
            throw new UserValidationException("First name should not be null");
        }
        if (StringUtils.isEmpty(user.getLastName())) {
            throw new UserValidationException("Last name should not be null");
        }
    }
}
