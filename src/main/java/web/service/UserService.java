package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void udpateUser(long id, User user);

    void deleteAllUsers();

    void deleteUserById(long id);
}
