package br.com.app.user.gateway.postgresql;

import br.com.app.user.domain.User;
import br.com.app.user.gateway.UserGateway;
import br.com.app.user.gateway.adapter.UserGatewayAdapter;
import br.com.app.user.gateway.postgresql.entity.UserEntity;
import br.com.app.user.gateway.postgresql.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {

    private final UserRepository userRepository;

    private final UserGatewayAdapter userGatewayAdapter;

    @Override
    public User create(final User user) {
        return null;
    }

    @Override
    public Optional<User> findById(final String id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByEmail(final String email) {
        return Optional.empty();
    }

    @Override
    public List<User> findAllUsers() {
        final List<UserEntity> users = userRepository.findAllUsers();
        return users.stream().map(userGatewayAdapter::toUser)
                .collect(Collectors.toList());
    }
}
