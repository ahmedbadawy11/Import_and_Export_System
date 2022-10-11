/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package import_and_export_system;

/**
 *
 * @author hh
 */
import java.util.*;

public class Manager {
    
    private String name;
    private String id;
    private String management;
    private String passward;
    public Manager()
    {
     
    }

   

    public Manager( String name, String id, String management,String passward) {
        this.passward=passward;
        this.name = name;
        this.id = id;
        this.management = management;
    }
 //public void edite()
    public Manager(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getManagement() {
        return management;
    }

    public String getPassward() {
        return passward;
    }
    
    
    
}
