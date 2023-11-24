package UpdateQuery;

import in.JDBCutil.JDBCUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateQuery {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner sc = new Scanner(System.in);

            try {
                connection = JDBCUtil.getJDBCConnection();
                if(connection!=null) {

                    String mysqlQuery = "Update student set result=? where id=?";
                    preparedStatement = connection.prepareStatement(mysqlQuery);

                    if (preparedStatement != null) {

                        System.out.println("Enter the id to update :");
                        preparedStatement.setInt(2, sc.nextInt());

                        System.out.println("Enter the result :");
                        preparedStatement.setString(1, sc.next());

                        int rowsaffected = preparedStatement.executeUpdate();

                        if (rowsaffected != 0) {
                            System.out.println("Row is updated");
                        } else {
                            System.out.println("Row is not updated");
                        }
                    }

                }

            } catch (IOException |SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    JDBCUtil.closeConnection(connection,preparedStatement);
                    sc.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }

        }



    }

