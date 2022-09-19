package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String ROOT = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, ROOT, PASSWORD);
            System.out.println("Соединен с БД");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Ошибка соединения");
        }
        return connection;
    }


}
