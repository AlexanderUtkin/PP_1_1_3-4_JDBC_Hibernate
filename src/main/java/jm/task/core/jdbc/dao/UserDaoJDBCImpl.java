package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class UserDaoJDBCImpl implements UserDao {


        Connection connection = Util.getConnection();



    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {

        String sqlCom = "CREATE TABLE IF NOT EXISTS users (id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20), lastName VARCHAR(20), age TINYINT)";

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlCom);
        }catch (SQLException e){
            e.printStackTrace();
        }


    }

    public void dropUsersTable() {

        String sqlCom = "DROP TABLE IF EXISTS users";

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlCom);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void saveUser(String name, String lastName, byte age) {

        String sqlCom = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlCom);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,lastName);
            preparedStatement.setByte(3,age);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
