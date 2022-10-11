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

public class Transaction {
    private String manger1_id;
    private String manger2_id;
    private date_time t;
    private String case_id;

    public String getManger1_id() {
        return manger1_id;
    }

    public String getManger2_id() {
        return manger2_id;
    }

    public date_time getT() {
        return t;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setManger1_id(String manger1_id) {
        this.manger1_id = manger1_id;
    }

    public void setManger2_id(String manger2_id) {
        this.manger2_id = manger2_id;
    }

    public void setT(date_time t) {
        this.t = t;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }
    
}
