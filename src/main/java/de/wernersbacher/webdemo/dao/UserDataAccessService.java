package de.wernersbacher.webdemo.dao;

import de.wernersbacher.webdemo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UserDataAccessService implements UserDao {
    @Override
    public int insertUser(UUID id, User user) {
        return 0;
    }

    @Override
    public List<User> selectAllUser() {
        return null;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteUserById(UUID id) {
        return 0;
    }

    @Override
    public int updateUser(UUID id, User user) {
        return 0;
    }
}
