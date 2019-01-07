
package bean;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import service.StudentService;

@ManagedBean
@ViewScoped
public class StudentBean {
    
    private StudentService  studentServiceb = new StudentService();
    private Student student;
    
    private List<Student> list;
    private String[] courseCompleted;

    public StudentService getStudentServiceb() {
        return studentServiceb;
    }

    public void setStudentServiceb(StudentService studentServiceb) {
        this.studentServiceb = studentServiceb;
    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getList() {
        
        list = new ArrayList<>();
        list = studentServiceb.getList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String[] getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String[] courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
    public void save(){ 
        String cc = "";
        for (String s : courseCompleted) {
            cc += s +"";
        }
        student.setCourseCp(cc);
        studentServiceb.saveorUpdate(student); 
    }
    public void edit(){ 
        String cc = "";
        for (String s : courseCompleted) {
            cc += s +"";
        }
        student.setCourseCp(cc);
        studentServiceb.saveorUpdate(student);
    }
    public void del(){ 
        studentServiceb.delete(student);
    }
    public Student searchById(int id){ 
        Student s = new Student();
        s = studentServiceb.getById(student.getId());
        return s;
    }
    public void reset(){ 
        student = new Student();
    }
}
