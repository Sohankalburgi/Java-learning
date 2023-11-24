package InsertQuery;

import in.JDBCUtil.JDBCutil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class insertMySqlQuery {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;


        try {
            connection = JDBCutil.getJdbcConnection();

            if(connection != null)
            {
                statement =connection.createStatement();
                String myInsertQuery = "Insert into student(name,rollnum,result) values('Sohan',1,'PASS')";
                int rowAffected = statement.executeUpdate(myInsertQuery);
                if(rowAffected!=0)
                {
                    System.out.println("Rows inserted");
                }
                else{
                    System.out.println("Row not inserted");
                }
            }


        } catch (IOException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            try {
                JDBCutil.closeResource(connection, statement);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
