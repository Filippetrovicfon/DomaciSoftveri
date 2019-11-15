/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.memory;

import domain.Manufacturer;
import java.util.ArrayList;
import java.util.List;
import storage.StorageManufacturer;

/**
 *
 * @author student1
 */
public class MemoryStorageManufacturer implements StorageManufacturer{

    private final List<Manufacturer> manufacturers;

    public MemoryStorageManufacturer() {
        manufacturers = new ArrayList() {
            {
                add(new Manufacturer(1l, "Manufacturer / 1"));
                add(new Manufacturer(2l, "Manufacturer / 2"));
                add(new Manufacturer(3l, "Manufacturer / 3"));
                add(new Manufacturer(4l, "Manufacturer / 4"));
            }
        };
    }
    @Override
    public List<Manufacturer> getAll() throws Exception{
        return manufacturers;
    }
}
