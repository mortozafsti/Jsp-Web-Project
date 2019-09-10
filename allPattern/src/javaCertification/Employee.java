
package javaCertification;

public class Employee {
    
    String name;
    boolean contract;
    double salary;

    public Employee() {
        this.name = new String("Joe");
        this.contract = new Boolean(true);
        this.salary = new Double(100); 
    }

    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", contract=" + contract + ", salary=" + salary + '}';
    }
    
    public static void main(String[] args) {
        
        Employee em = new Employee();
        em.name= "Joe";
        em.contract= true;
        em.salary= 100;
        System.out.println(em);
        
    }
    
    
}
