package api.repository;

import api.entity.User;

import java.util.List;

public interface IUserRepository {

    void add(User user);

    void delete(int id);

    List<User> findAll();

    void update(User user);
}
