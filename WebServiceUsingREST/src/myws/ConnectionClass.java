package myws;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
    public static Connection getConnection() throws Exception{
        try {

         //   String driver = "com.mysql.cj.jdbc.Driver";

            String url = "jdbc:mysql://localhost:3306/TestDB";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?"+"user=root&password=root");
            System.out.println("Connection Established");

            return conn;
        }

        catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
