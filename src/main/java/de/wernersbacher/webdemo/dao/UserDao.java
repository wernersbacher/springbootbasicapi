package de.wernersbacher.webdemo.dao;

import de.wernersbacher.webdemo.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    int insertUser(UUID id, User user);

    default int addUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    List<User> selectAllUser();

    Optional<User> selectUserById(UUID id);

    int deleteUserById(UUID id);

    int updateUser(UUID id, User user);
}
