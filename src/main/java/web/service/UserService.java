package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User User);

    void deleteUserById(long id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);
}
