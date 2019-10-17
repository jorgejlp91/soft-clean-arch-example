package br.com.app.user.usecase;

import br.com.app.user.domain.User;
import br.com.app.user.gateway.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public final class FindUser {

    private final UserGateway userGateway;

    public Optional<User> findById(final String id) {
        return userGateway.findById(id);
    }

    public List<User> findAllUsers() {
        return userGateway.findAllUsers();
    }
}
