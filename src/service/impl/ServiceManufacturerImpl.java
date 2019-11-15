/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import domain.Manufacturer;
import java.util.List;
import service.ServiceManufacturer;
import storage.StorageManufacturer;
import storage.database.DatabaseStorageManufacturer;

/**
 *
 * @author student1
 */
public class ServiceManufacturerImpl implements ServiceManufacturer{

    private final StorageManufacturer storageManufacturer;

    public ServiceManufacturerImpl() {
        storageManufacturer=new DatabaseStorageManufacturer();
    }
    
    @Override
    public List<Manufacturer> getAll() throws Exception {
        
        return storageManufacturer.getAll();
    }
    
}
