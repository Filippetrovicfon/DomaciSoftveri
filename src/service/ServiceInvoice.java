/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Invoice;
import java.util.List;

/**
 *
 * @author Fili
 */
public interface ServiceInvoice {
    Invoice save(Invoice invoice) throws Exception;
    public List<Invoice> getAll() throws Exception;
}
