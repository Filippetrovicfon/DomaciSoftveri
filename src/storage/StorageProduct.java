/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Product;
import java.util.List;

/**
 *
 * @author student1
 */
public interface StorageProduct {
    Product save(Product product)throws Exception;

     List<Product> getAll() throws Exception;
}
