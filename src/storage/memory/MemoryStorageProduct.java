/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.memory;

import domain.Product;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author student1
 */
public class MemoryStorageProduct {

    private final List<Product> products;

    public MemoryStorageProduct() {
        products = new LinkedList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getAll() {
        return products;
    }

}
