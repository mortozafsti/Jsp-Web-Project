
package entity;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AutoComplete {
    
    private int id;
    private String name;
    private String email;

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
    
    public List<String> mmm(String s){ 
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(s +i);
        }
        return result;
    }
    
    public void saveA(){ 
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
    }
}
