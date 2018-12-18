
package domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class studentCon {
    
    public student stu;

    public student getStu() {
        if (stu == null) {
            stu = new student();
        }
        return stu;
    }

    public void setStu(student stu) {
        this.stu = stu;
    }
    
    public void reset(){ 
        stu = new student();
    }
    
}
