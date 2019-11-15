/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Manufacturer;
import java.util.List;

/**
 *
 * @author student1
 */
public interface ServiceManufacturer {
    
    List<Manufacturer> getAll()throws Exception;
    
}
