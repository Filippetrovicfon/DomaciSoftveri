/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage.memory;

import domain.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student1
 */
public class MemoryStorageUser {

    private final List<User> users;

    public MemoryStorageUser() {
        users = new ArrayList() {
            {
                add(new User(1l, "pera", "pera", "pera@gmail.com", "Pera", "Peric"));
                add(new User(2l, "laza", "laza", "laza@gmail.com", "Laza", "Lazic"));
            }
        };
    }

}
