/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.component.table.model;

import domain.Invoice;
import domain.InvoiceItem;
import domain.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student1
 */
public class InvoiceTableModel extends AbstractTableModel {
    private final Invoice invoice;
    private String[] columnNames = new String[]{"No.", "id", "name", "price", "unit", "quantity", "amount"};

    public InvoiceTableModel(Invoice invoice) {
        this.invoice = invoice;
    }

    public InvoiceTableModel() {
        invoice=new Invoice();
    }

    public Invoice getInvoice(){
        return invoice;
    }
    
    @Override
    public int getRowCount() {
        if (invoice == null) {
            return 0;
        }
        return invoice.getItems().size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public Object getValueAt(int row, int column) {
        InvoiceItem item = invoice.getItems().get(row);
        switch (column) {
            case 0:
                return item.getItemNumber();
            case 1:
                return item.getProduct().getId();
            case 2:
                return item.getProduct().getName();
            case 3:
                return item.getPrice();
            case 4:
                return item.getProduct().getMeasurementUnit();
            case 5:
                return item.getQuantity();
            case 6:
                return item.getAmount();
            default:
                return "N/A";

        }
    }

    public void addProduct(Product product, BigDecimal quantity) {
        boolean setovao=false;
        for(InvoiceItem it:invoice.getItems()){
            if(it.getProduct().getId().equals(product.getId())){     
                it.setQuantity(it.getQuantity().add(quantity));
                setovao=true;
            }
        }
        if(setovao==false){
            InvoiceItem invoiceItem = new InvoiceItem(invoice, invoice.getItems().size() + 1, product, product.getPrice(), quantity, product.getPrice().multiply(quantity));
            invoice.getItems().add(invoiceItem);
        }
        
        fireTableDataChanged();
    }

    public void removeSelectedItem(int row) {
        invoice.getItems().remove(row);
        populateOrderId();
        fireTableDataChanged();
    }

    private void populateOrderId() {
        int id=1;
        for(InvoiceItem it: invoice.getItems()){
            it.setItemNumber(id++);
        }
    }

  
}
