package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User User);

    void deleteUserById(long id);

    void updateUser(long id, String name, String surname, byte age, String email);

    List<User> getAllUsers();

    User getUserById(long id);
}
