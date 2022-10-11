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

public class come_case extends Case{

    public come_case(String id, String title, String management_type, String Date, String Time) {
        super(id, title, management_type, Date, Time);
    }
        
    
    @Override
    public  void add(String title , String id, String Date,String Time , String manager_id, String management_type )
    {
        
        this.title = title;
        this.id = id;
        this.Date = Date;
        this.Time=Time;
        this.manager_id = manager_id;
        this.management_type= management_type;
        
    }
    @Override
     public  void Edit(String title , String id, String Date,String Time , String manager_id , String management_type )
     {
         this.title = title;
        this.id = id;
        this.Date = Date;
        this.Time=Time;
        this.manager_id = manager_id;
        this.management_type = management_type;
     }
     public void Delete(String id)
     {
         
     }

    public String getManagement_type() {
        return management_type;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }
     
}
