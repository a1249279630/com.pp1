package day06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionSql {
    private static String url="jdbc:mysql://101.132.33.149/TBY";
    private static String name="com.mysql.jdbc.Driver";
    private static String username="root";
    private static String password="123456";

    public static void Insert() throws SQLException {
        String sql="INSERT INTO t_person VALUES(2,'小明',12,'男',1,1);";
         Connection connection=null;
         Statement statement=null;
        try {
            Class.forName(name);
            connection= DriverManager.getConnection(url,username,password);
            statement=connection.createStatement();
            statement.execute(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.close();
        statement.close();
    }

    public static void main(String[] args) throws SQLException {
        Insert();
    }


}