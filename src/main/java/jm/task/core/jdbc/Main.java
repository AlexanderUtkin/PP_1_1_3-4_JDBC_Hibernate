package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {

    public static void main(String[] args) {
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Vasya", "Petrov", (byte) 34);
        userDao.saveUser("Petya", "Ivanov", (byte) 23);
        userDao.saveUser("Marina", "Gureva", (byte) 42);
        userDao.saveUser("Dima", "Ershov", (byte) 39);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();


    }
}
