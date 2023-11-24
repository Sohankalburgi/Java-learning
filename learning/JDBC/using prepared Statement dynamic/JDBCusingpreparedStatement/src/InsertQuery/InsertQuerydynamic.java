package InsertQuery;

import in.JDBCutil.JDBCUtil;

import java.io.IOException;
import java.io.PipedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertQuerydynamic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Connection connection = null;
        PreparedStatement preparedstatement = null;
        try {
            connection = JDBCUtil.getJDBCConnection();
            if(connection!=null) {
                String InsertQuery = "Insert into student(name,rollnum,result) values(?,?,?)";
                preparedstatement = connection.prepareStatement(InsertQuery);

                if(preparedstatement!=null)
                {
                    System.out.println("Enter the name :");
                    preparedstatement.setString(1,sc.next());
                    System.out.println("Enter the roll No :");
                    preparedstatement.setInt(2,sc.nextInt());
                    System.out.println("Enter the result ");
                    preparedstatement.setString(3,sc.next());

                    int rowAffect=preparedstatement.executeUpdate();
                    if(rowAffect>0)
                    {
                        System.out.println("row is inserted");
                    }
                    else{
                        System.out.println("row is not inserted");
                    }
                }

            }

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
        finally{
            try{
                JDBCUtil.closeConnection(connection,preparedstatement);
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }

    }
}
