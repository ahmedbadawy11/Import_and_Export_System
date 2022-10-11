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

public class Action {
    
    private String id;
    private String id_case;

    public String getId_case() {
        return id_case;
    }

    private String type;
    private String  data;
    private String  time;
    


    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getData() {
        return data;
    }

    public String getTime() {
        return time;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setD(String data) {
        this.data = data;
    }

    public Action(String id,String id_case, String type, String data,String time) {
        this.id = id;
        this.type = type;
        this.data = data;
        this.time = time;
        this.id_case = id_case;


    }
   
    public Action() {
    }
    
    
}
