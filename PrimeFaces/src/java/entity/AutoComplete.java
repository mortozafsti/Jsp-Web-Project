package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AutoComplete {

    
    private int id;
    private String name;
    private String email;
    private Date date;
    private String[] c_course;

    public AutoComplete() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getC_course() {
        return c_course;
    }

    public void setC_course(String[] c_course) {
        this.c_course = c_course;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    public List<String> mmm(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(s + i);
        }
        return result;
    }

    
    public void saveA() {
        
//        String cc ="";
//        for(String s : c_course){ 
//            cc += s + " ";
//        }
       
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
        System.out.println("Email:" + email);
        System.out.println("Email:" + date);
       // System.out.println("C_Course:" + cc);
        
    }
}
