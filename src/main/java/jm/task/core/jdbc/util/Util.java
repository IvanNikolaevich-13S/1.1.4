package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection;
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/firstdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    static {
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
