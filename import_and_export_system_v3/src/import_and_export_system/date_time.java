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

public class date_time {
    private String day;
    private String month;
    private String year;
    private String time;

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getTime() {
        return time;
    }

    public date_time(String day, String month, String year, String time) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
    }

    public date_time() {
    }
    
    
    
}
