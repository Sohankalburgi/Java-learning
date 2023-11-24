package DeletionQuery;

import in.JDBCutil.JDBCUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deletionQuery {
    public static void main(String[] args) {
        Connection connection = null;
        Scanner sc = new Scanner(System.in);
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtil.getJDBCConnection();

            if(connection!=null)
            {
                String mysqlquery = "delete from student where id=?";
                preparedStatement = connection.prepareStatement(mysqlquery);

                if(preparedStatement!=null)
                {
                    System.out.println("Enter the ID");
                    preparedStatement.setInt(1,sc.nextInt());
                    int rowaffected = preparedStatement.executeUpdate();
                    if(rowaffected>0)
                    {
                        System.out.println("rows are affected");
                    }
                    else{
                        System.out.println("row are not affected");
                    }
                }

            }

        } catch (IOException |SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                JDBCUtil.closeConnection(connection,preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
