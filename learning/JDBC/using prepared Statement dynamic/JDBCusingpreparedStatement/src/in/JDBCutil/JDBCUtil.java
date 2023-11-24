package in.JDBCutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {

    public static Connection getJDBCConnection() throws IOException, SQLException {
        FileInputStream FIS = new FileInputStream("/home/sohan/Desktop/JavaDsa/learning/JDBC/using prepared Statement dynamic/JDBCusingpreparedStatement/src/in/JDBCutil/Application.properties");
        Properties P = new Properties();
        P.load(FIS);

        String url = P.getProperty("url");
        String user = P.getProperty("user");
        String password = P.getProperty("password");

        Connection connection = DriverManager.getConnection(url,user,password);
        return connection;
    }

    public static void closeConnection(Connection connection, PreparedStatement statement) throws SQLException {
        if(connection !=null)
        {
            connection.close();
        }
        else if(statement!=null)
        {
            statement.close();

        }
    }

    public static void closeresource(Connection connection, PreparedStatement statement, ResultSet resultset) throws SQLException {
        if(connection!=null){
            connection.close();
        }
        if(statement!=null)
        {
            statement.close();
        }
        if(resultset!=null)
        {
            resultset.close();
        }
    }

}
