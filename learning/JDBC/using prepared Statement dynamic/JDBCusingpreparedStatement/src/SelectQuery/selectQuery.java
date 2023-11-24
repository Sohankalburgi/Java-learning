package SelectQuery;

import com.mysql.cj.jdbc.JdbcConnection;
import in.JDBCutil.JDBCUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class selectQuery {

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultset = null;
        Scanner sc = new Scanner(System.in);
        try {
            connection = JDBCUtil.getJDBCConnection();

            if(connection!=null)
            {
                String mysqlQuery = "Select * from student where id=?";
                preparedStatement = connection.prepareStatement(mysqlQuery);

                if(preparedStatement!=null)
                {
                    System.out.println("Enter the id to display the student details");
                    preparedStatement.setInt(1,sc.nextInt());

                    resultset = preparedStatement.executeQuery();
                }

                if(resultset!=null)
                {
                    if(resultset.next())
                    {
                        System.out.println("ID\tName\tRollNO\tResult");
                        System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getInt(3)+"\t"+resultset.getString(4));

                    }
                }
            }
        } catch (IOException |SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                JDBCUtil.closeresource(connection,preparedStatement,resultset);
                sc.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }
}
