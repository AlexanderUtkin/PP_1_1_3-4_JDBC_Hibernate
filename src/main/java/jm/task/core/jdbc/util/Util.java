package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private final String URL = "jdbc:mysql://localhost:3306/mysql";
    private final String ROOT = "root";
    private final String PASSWORD = "FyAX&a%1P3l9";

    Connection connection;

    Driver driver;

    {
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,ROOT,PASSWORD);
            if (!connection.isClosed()){
                System.out.println("Соединен с БД");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
