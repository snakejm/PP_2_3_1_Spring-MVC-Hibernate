package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(long id, User user);

    void deleteAllUsers();

    void deleteUserById(long id);
}
