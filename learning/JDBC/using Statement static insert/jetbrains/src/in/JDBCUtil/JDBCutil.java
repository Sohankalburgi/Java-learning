package in.JDBCUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutil {

    public static Connection getJdbcConnection() throws IOException, SQLException {
        FileInputStream fis = new FileInputStream("/home/sohan/Desktop/New Folder 1/jetbrains/src/in/JDBCUtil/Application.properties");
        Properties properties = new Properties();

        try {
            properties.load(fis);
        } finally {
            if (fis != null) {
                fis.close();
            }
        }

        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        System.out.println("URL: " + url);
        System.out.println("User: " + user);
        // Avoid printing the password in clear text in production code
        System.out.println("Password: " + password);

        return DriverManager.getConnection(url, user, password);
    }

    public static void closeResource(Connection connection, Statement statement) throws SQLException {
        if (connection != null) {
            connection.close();
        }
        if (statement != null) {
            statement.close();
        }
    }
}