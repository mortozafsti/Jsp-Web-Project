
package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectDb {
    
    Connection conn;
    String url = "jdbc:mysql://localhost:3306/productdb";
    String user = "root";
    String password = "1234";
    
    
    public  Connection doConnect(){ 
              
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
