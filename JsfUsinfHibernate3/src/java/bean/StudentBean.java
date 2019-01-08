package bean;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import service.StudentService;

public class StudentBean {

    private StudentService studentService = new StudentService();
    private Student student;

    private List<Student> list;
    private String[] completedCourse;

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

    public String[] getCompletedCourse() {
        return completedCourse;
    }

    public void setCompletedCourse(String[] completedCourse) {
        this.completedCourse = completedCourse;
    }

    public void save() {
        String cc = "";
        for (String s : completedCourse) {
            cc += s + ",";
        }
        student.setCompletedCourse(cc);
        studentService.saveorUpdate(student);
    }

    public void del() {
        studentService.delete(student);
    }

    public void edit() {
        studentService.saveorUpdate(student);
    }

    public Student searchById(int id) {
        Student s = new Student();
        s = studentService.getById(student.getId());
        return s;
    }

    public void reset() {
        student = new Student();
    }

}
