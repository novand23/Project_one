package api.repository.impl;

import api.entity.User;
import api.repository.IUserRepository;
import api.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserRepository implements IUserRepository {
    private Connection connection;

    public UserRepository() {
        this.connection = DbUtil.getConnection();
    }

    @Override
    public void add(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("");
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        /*connection.prepareStatement()*/

    }

    @Override
    public List<User> findAll() {
        /*connection.createStatement();*/

        return null;
    }

    @Override
    public void update(User user) {
        /*connection.prepareStatement();*/

    }
}
