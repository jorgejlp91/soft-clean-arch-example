package br.com.app.user.entrypoint.rest;

import br.com.app.user.entrypoint.rest.adapter.UserEntrypointAdapter;
import br.com.app.user.entrypoint.rest.exceptions.EntityNotFoundException;
import br.com.app.user.entrypoint.rest.model.UserVo;
import br.com.app.user.usecase.CreateUser;
import br.com.app.user.usecase.FindUser;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "${api.versionV1}/users", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserController {

    private final CreateUser createUser;
    private final FindUser findUser;
    private final UserEntrypointAdapter userAdapter;

    @RequestMapping(method = RequestMethod.POST)
    public UserVo createUser(final UserVo userVo) {

        final var user = userAdapter.toUser(userVo);
        return userAdapter.toUserVo(createUser.create(user));
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public UserVo findUser(final String userId) {
        return userAdapter.toUserVo(findUser.findById(userId).
                orElseThrow(() -> new EntityNotFoundException("user not found", userId)));
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserVo> allUsers() {
        return findUser.findAllUsers()
                .stream()
                .map(userAdapter::toUserVo)
                .collect(Collectors.toList());
    }

}
