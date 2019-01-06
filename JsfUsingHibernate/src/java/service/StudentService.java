package service;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class StudentService {

    public static void saveorUpdate(Student student) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction t = session.beginTransaction();
        session.saveOrUpdate(student);
        t.commit();
    }

    public static void delete(Student student) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction t = session.beginTransaction();
        session.delete(student);
        t.commit();
    }

    public static Student getById(int id) {
        Student student = new Student();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction t = session.beginTransaction();
            Student student1 =(Student) session.get(Student.class,id);
            
            t.commit();
        } catch (Exception e) {
        }
        return student;
    }
    public static List<Student> getList(int id) {
        List<Student> student = new ArrayList<>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            student = session.createQuery("From stu").list();
            Transaction t = session.beginTransaction();
            t.commit();
        } catch (Exception e) {
        }
        return student;
    }
}
