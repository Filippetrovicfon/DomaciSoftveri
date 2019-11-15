/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author student1
 */
public class ConnectionFactory {
    
    private static ConnectionFactory instance;
    private final Connection connection;
    
    private ConnectionFactory() throws SQLException{
        String url="jdbc:mysql://127.0.0.1:3306/d2";
        String username="root";
        String password="";
        connection=DriverManager.getConnection(url,username,password);
    }
    
    public static ConnectionFactory getInstance() throws SQLException{
        if(instance ==null)
            instance=new ConnectionFactory();
        return instance;
    }
    
    public Connection getConnection(){
        return connection;
    }
}
