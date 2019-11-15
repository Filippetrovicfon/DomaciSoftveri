/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.database;

import domain.Manufacturer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import storage.StorageManufacturer;
import storage.database.connection.ConnectionFactory;

/**
 *
 * @author student1
 */
public class DatabaseStorageManufacturer implements StorageManufacturer {
    
    @Override
    public List<Manufacturer> getAll() throws Exception {
        try {
            List<Manufacturer> manufacturers=new ArrayList();
            Connection connection=ConnectionFactory.getInstance().getConnection();
            String query="select * from manufacturer order by name";
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(query);
            while(rs.next()){
                Long id=rs.getLong("id");
                String name=rs.getString("name");
                manufacturers.add(new Manufacturer(id, name));
            }
            rs.close();
            statement.close();
            return manufacturers;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Error in connection");
        }
        
    }

}
