package br.com.app.user.entrypoint.rest.adapter;

import br.com.app.user.domain.User;
import br.com.app.user.entrypoint.rest.model.UserVo;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class UserEntrypointAdapter {

    public UserVo toUserVo(@NonNull final User user) {
        final var userVo = UserVo.builder().id(user.getId())
                .email(user.getEmail())
                .lastName(user.getLastName())
                .firstName(user.getFirstName()).build();
        return userVo;
    }

    public User toUser(@NonNull final UserVo userVo) {
        final var user = User.builder()
                .email(userVo.getEmail())
                .lastName(userVo.getLastName())
                .firstName(userVo.getFirstName()).build();
        return user;
    }
}
