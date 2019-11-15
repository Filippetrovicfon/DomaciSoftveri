/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.database;

import domain.Manufacturer;
import domain.MeasurementUnit;
import domain.Product;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import storage.StorageProduct;
import storage.database.connection.ConnectionFactory;

/**
 *
 * @author student1
 */
public class DatabaseStorageProduct implements StorageProduct {

    @Override
    public Product save(Product product) throws Exception {
        Connection connection = ConnectionFactory.getInstance().getConnection();
        String query = "insert into product (name,description,measurment_unit,price,manufacturer_id) values (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, product.getName());
        preparedStatement.setString(2, product.getDescription());
        preparedStatement.setString(3, product.getMeasurementUnit().toString());
        preparedStatement.setBigDecimal(4, product.getPrice());
        preparedStatement.setLong(5, product.getManufacturer().getId());
        int a = preparedStatement.executeUpdate();
        ResultSet rs = preparedStatement.getGeneratedKeys();
        if (rs.next()) {
            product.setId(rs.getLong(1));
        }
        preparedStatement.close();
        return product;
    }

    @Override
    public List<Product> getAll() throws Exception {
        List<Product> products = new ArrayList<>();
        Connection connection = ConnectionFactory.getInstance().getConnection();
        String query = "select p.id, p.name, p.description, p.measurment_unit, p.price, m.id as manufacturer_id,m.name as manufacturer_name  from product p join manufacturer m on p.manufacturer_id=m.id order by p.name";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            Long id = rs.getLong("id");
            String name = rs.getString("name");
            String description = rs.getString("description");
            String measurementUnit = rs.getString("measurment_unit");
            BigDecimal price = rs.getBigDecimal("price");
            Long manufacturerId = rs.getLong("manufacturer_id");
            String manufacturerName = rs.getString("manufacturer_name");
            Product product = new Product(id, name, description, new Manufacturer(manufacturerId, manufacturerName), price, MeasurementUnit.valueOf(measurementUnit));
                products.add(product);
        }
        
        statement.close();
        rs.close();
return products;
    }

}
