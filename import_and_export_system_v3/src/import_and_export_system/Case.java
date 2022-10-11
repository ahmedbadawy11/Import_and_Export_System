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

public abstract class Case {
    
    protected String title;
    protected  String id;
    protected String Date;
    protected String Time;
    protected String  manager_id;
    protected String management_type;
    protected ArrayList<Action> l ;
    protected String notes;
    Case(String id,String title,String management_type,String Date,String Time)
    {
        this.id=id;
        this.title=title;
        this.management_type=management_type;
        this.Date=Date;
        this.Time=Time;
    }
    Case()
    {}
    public abstract void add(String title , String id, String Date, String Time, String manager_id ,String management_type  );
    public abstract void Edit(String title , String id, String Date, String Time, String manager_id , String management_type  );
    public abstract void Delete(String id);

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

    public String getManagement_type() {
        return management_type;
    }
    
    
}
