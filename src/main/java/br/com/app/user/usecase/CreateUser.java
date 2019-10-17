package br.com.app.user.usecase;

import br.com.app.user.domain.User;
import br.com.app.user.gateway.UserGateway;
import br.com.app.user.usecase.exception.UserAlreadyExistsException;
import br.com.app.user.usecase.validator.UserValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public final class CreateUser {

    private final UserGateway userGateway;

    public User create(final User user) {
        UserValidator.validateCreateUser(user);
        if (userGateway.findByEmail(user.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException(user.getEmail());
        }
        final var userToSave = User.builder()
                .id(UUID.randomUUID().toString())
                .email(user.getEmail())
                .password(user.getPassword())
                .lastName(user.getLastName())
                .firstName(user.getFirstName())
                .build();
        return userGateway.create(userToSave);
    }
}
