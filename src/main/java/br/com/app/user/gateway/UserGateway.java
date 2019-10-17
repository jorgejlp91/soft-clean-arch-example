package br.com.app.user.gateway;

import br.com.app.user.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserGateway {

    User create(User user);

    Optional<User> findById(String id);

    Optional<User> findByEmail(String email);

    List<User> findAllUsers();
}
