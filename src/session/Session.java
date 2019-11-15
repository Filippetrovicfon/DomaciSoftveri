/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

/**
 *
 * @author Fili
 */
public class Session {
    private static String currentUser;
    public static Session instance;

    public static String getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(String aCurrentUser) {
        currentUser = aCurrentUser;
    }

    private Session(){}
    
    public static Session getInstance(){
        if(instance==null)
            instance=new Session();
        return instance;
    }

    public void setujUsera(String user) {
        currentUser=user;
    }
    
   
    
    
}
