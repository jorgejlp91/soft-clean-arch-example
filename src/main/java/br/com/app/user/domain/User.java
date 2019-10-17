package br.com.app.user.domain;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class User {
    private String id;
    private String email;
    private String password;
    private String lastName;
    private String firstName;
}
