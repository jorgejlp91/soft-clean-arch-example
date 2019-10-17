package br.com.app.user.gateway.adapter;

import br.com.app.user.domain.User;
import br.com.app.user.gateway.postgresql.entity.UserEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class UserGatewayAdapter {

    public UserEntity toUserEntity(@NonNull final User user) {
        final var userEntity = UserEntity.builder().id(user.getId())
                .email(user.getEmail())
                .lastName(user.getLastName())
                .firstName(user.getFirstName()).build();
        return userEntity;
    }

    public User toUser(@NonNull final UserEntity userEntity) {
        final var user = User.builder()
                .email(userEntity.getEmail())
                .lastName(userEntity.getLastName())
                .firstName(userEntity.getFirstName()).build();
        return user;
    }
}
