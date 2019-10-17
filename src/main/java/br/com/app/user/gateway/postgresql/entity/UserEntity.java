package br.com.app.user.gateway.postgresql.entity;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class UserEntity {
    private String id;
    private String email;
    private String password;
    private String lastName;
    private String firstName;
}
