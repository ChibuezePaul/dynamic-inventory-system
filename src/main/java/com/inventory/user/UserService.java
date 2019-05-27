package com.inventory.user;

import java.util.List;

public interface UserService {
    String addUser(User user);
    User editUser(Long id, User user);
    String deleteUser(Long id);
    String deactivateUser(Long id);
    List<User> getAllUser();
    User getUser(Long id);
}