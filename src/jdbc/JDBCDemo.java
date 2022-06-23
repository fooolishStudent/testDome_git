package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/test";
        String username="root";
        String password="root";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql ="UPDATE tb_user \n" +
                "SET `password` = '100' \n" +
                "WHERE\n" +
                "\tid = 1;";
        Statement stmt=conn.createStatement();
        int count =stmt.executeUpdate(sql);
        System.out.println(count);
        System.out.println(count);
        stmt.close();
        conn.close();
    }
}
//是的是的