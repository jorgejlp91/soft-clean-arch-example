package br.com.app.user.gateway.postgresql.repository;

import br.com.app.user.domain.User;
import br.com.app.user.gateway.postgresql.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.simpleflatmapper.jdbc.spring.JdbcTemplateMapperFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final NamedParameterJdbcTemplate template;

    public User create(final User user) {
//        inMemoryDb.put(user.getId(), user);
        return user;
    }

    public Optional<User> findById(final String id) {
//        return Optional.ofNullable(inMemoryDb.get(id));
        return null;
    }

    public Optional<User> findByEmail(final String email) {
//        return inMemoryDb.values().stream()
//            .filter(user -> user.getEmail().equals(email))
//            .findAny();
        return null;
    }

    public List<UserEntity> findAllUsers() {

        final String query = new StringBuilder()
                .append(" SELECT ")
                .append("   u.USER_ID, ")
                .append("   u.EMAIL, ")
                .append("   u.LAST_NAME, ")
                .append("   u.FIRST_NAME ")
                .append(" FROM ")
                .append("   USERS u ").toString();

        final RowMapper<UserEntity> rowMapper = JdbcTemplateMapperFactory.newInstance().newRowMapper(UserEntity.class);

        return template.query(query, rowMapper);
    }
}
