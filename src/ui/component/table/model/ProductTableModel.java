/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.component.table.model;

import domain.Manufacturer;
import domain.MeasurementUnit;
import domain.Product;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student1
 */
public class ProductTableModel extends AbstractTableModel {
    
    private final List<Product> products;
    private String[] columnNames = new String[]{"ID", "NAME", "MANUFACTURER", "PRICE", "MEASUREMENT UNIT"};
    private Class[] columnClasses = new Class[]{Long.class, String.class, Manufacturer.class, BigDecimal.class, MeasurementUnit.class};

    public ProductTableModel(List<Product> products) {
        this.products = products;
    }
    
    @Override
    public int getRowCount() {
        if (products == null) {
            return 0;
        }
        return products.size();
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Product product = products.get(row);
        switch (column) {
            case 0:
                return product.getId();
            case 1:
                return product.getName();
            case 2:
                return product.getManufacturer();
            case 3:
                return product.getPrice();
            case 4:
                return product.getMeasurementUnit();
            default:
                return "n/a";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        if (column > columnNames.length) {
            return "n/a";
        }
        
        return columnNames[column];
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 1 || column == 3 || column == 2;
    }
    
    @Override
    public void setValueAt(Object value, int row, int column) {
        Product product = products.get(row);
        switch (column) {
            case 0:
                break;
            case 1:
                product.setName(value.toString());
                break;
            case 2:
                product.setManufacturer((Manufacturer) value);
                break;
            case 3:
                product.setPrice(new BigDecimal(value.toString()));
                break;
            case 4:
                break;
        }
    }
    
    @Override
    public Class<?> getColumnClass(int column) {
        return columnClasses[column];
    }

    public Product getProduct(Long productId) {
        for (Product product : products) {
            if(product.getId().equals(productId))
                return product;
        }
        return null;
    }
    
}
