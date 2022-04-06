package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void saveUser(User user);

    User deleteUserById(long id);

    List<User> getAllUsers();

    void updateUser(User user);

    User getUserById(long id);
}
