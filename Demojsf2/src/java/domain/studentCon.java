
package domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class studentCon {
    
    private student students;

    public student getStudents() {
        if (students == null) {
            students = new student();
        }
        return students;
    }

    public void setStudents(student students) {
        this.students = students;
    }
    
}
