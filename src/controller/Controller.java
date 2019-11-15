/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Invoice;
import domain.Manufacturer;
import domain.Product;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.ServiceManufacturer;
import service.ServiceProduct;
import service.impl.ServiceManufacturerImpl;
import service.impl.ServiceProductImpl;
import storage.database.connection.ConnectionFactory;
import storage.memory.MemoryStorageManufacturer;
import storage.memory.MemoryStorageProduct;
import storage.memory.MemoryStorageUser;

/**
 *
 * @author student1
 */
public class Controller {

    private static  Controller instance;
    private final MemoryStorageUser storageMemoryUser;
    private final ServiceProduct serviceProduct;
    private final ServiceManufacturer serviceManufacturer;
    private final Map<String,Object> map;
    private Controller() {
        storageMemoryUser = new MemoryStorageUser();
        serviceProduct = new ServiceProductImpl();
        serviceManufacturer = new ServiceManufacturerImpl();
        map=new HashMap<>();
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }

        return instance;
    }

    public void login(String username, String password) {

    }

    public List<Manufacturer> getAllManufacturers() throws Exception{
        return serviceManufacturer.getAll();
    }

    public Product saveProduct(Product product) throws Exception {
        return serviceProduct.save(product);
    }

    public List<Product> getAllProducts() throws Exception{
        return serviceProduct.getAll();
    }
    public Map<String,Object> getMap(){
        return map;
    }

    public Invoice saveInvoice(Invoice invoice) {
        try {
            ConnectionFactory.getInstance();
            
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return invoice;
    }
}
