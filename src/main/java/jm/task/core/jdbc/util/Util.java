package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASWORD = "postgres";

    public static Connection getConnection () {
        try {
            return DriverManager.getConnection(URL, USER, PASWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
