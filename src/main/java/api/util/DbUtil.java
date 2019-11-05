package api.util;

import java.sql.*;

public class DbUtil {

    private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String USERNAME = "postgres";
    private final static String PASSWORD = "12345";

    private static Connection connection;

    public static Connection getConnection (){
        try {
            if(connection == null) {
                Driver driver = new org.postgresql.Driver();
                DriverManager.registerDriver(driver);
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
