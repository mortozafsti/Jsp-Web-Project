
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class checkBoxbean {
    
    private String[] c_course;

    public String[] getC_course() {
        return c_course;
    }

    public void setC_course(String[] c_course) {
        this.c_course = c_course;
    }
    
    public void saveCl(){ 
        String cc ="";
        for(String s : c_course){ 
            cc += s+" ";
        }
        System.out.println("Course:"+cc);
    }
}
