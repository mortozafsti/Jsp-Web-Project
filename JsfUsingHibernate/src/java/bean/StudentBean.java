
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
    
    private StudentService studentService = new StudentService();
    private Student student;
    
    private List<Student> list;
    private String[] courseCompleted;

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

    public String[] getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String[] courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
    public void save(){ 
        String cc = "";
        for(String s : courseCompleted) {
            cc += s +", ";
        }
        student.setCompletedCourse(cc);
        studentService.saveorUpdate(student);
    }
    
    public void update(){ 
        studentService.saveorUpdate(student);
    }
    
    public void del(){ 
        studentService.delete(student);
    }
    
    public Student searchById(){ 
        Student s = new Student();
        s = studentService.getById(student.getId());
        return s;
    }
}
