package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void saveUser(User user);

    void deleteUserById(long id);

    List<User> getAllUsers();

    void updateUser(long id, String name, String surname, byte age, String email);

    User getUserById(long id);
}
