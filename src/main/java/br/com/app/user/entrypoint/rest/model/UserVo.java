package br.com.app.user.entrypoint.rest.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class UserVo {

    private String id;
    private String email;
    private String password;
    private String lastName;
    private String firstName;

}
