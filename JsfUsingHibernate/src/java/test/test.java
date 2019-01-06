
package test;

import entity.Student;
import service.StudentService;

public class test {
    
    public static void main(String[] args) {
        
        StudentService studentService = new StudentService();
        Student student = new Student();
        
        //student.setId(1);
        student.setName("Mortoza");
        student.setRound("Round-37");
        student.setCompletedCourse("java");
        student.setGender("MAle");
        
        studentService.saveorUpdate(student);
        
        System.out.println("Success");
        
    }
}
