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

public class outgoing_case extends Case{
    public  String notes;
    public outgoing_case()
    {}
    
    public outgoing_case(String id, String title, String management_type, String Date, String Time) {
        super(id, title, management_type, Date, Time);
       
    }
    
     @Override
     public  void add(String title , String id, String Date,String Time , String manager_id , String management_type )
    {
        
        this.title = title;
        this.id = id;
        this.Date = Date;
        this.Time=Time;
        this.manager_id = manager_id;
        this.management_type = management_type;
        
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

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
     
     public void Delete(String id)
     {
         
     }
}
