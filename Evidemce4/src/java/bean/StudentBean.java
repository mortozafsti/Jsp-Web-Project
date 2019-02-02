
package bean;

import entity.Student;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import service.StudentService;

@ManagedBean
@ViewScoped
public class StudentBean implements Serializable{
    
    private StudentService studentService = new StudentService();
    private Student student;
    
    private List<Student> list;
    private String[] completeCourse;

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
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
        list = studentService.getList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String[] getCompleteCourse() {
        return completeCourse;
    }

    public void setCompleteCourse(String[] completeCourse) {
        this.completeCourse = completeCourse;
    }
    
    public void save(){ 
        
        String cc = "";
        for(String s : completeCourse){ 
            cc += s + "";
        }
        student.setCompleteCourse(cc);
        studentService.saveorUpdate(student);
        
    }
    public void del(){ 
        studentService.delete(student);
    }
    public void edit(){ 
         studentService.saveorUpdate(student);
    }
    public void reset(){ 
        student = new Student();
    }
    
}
