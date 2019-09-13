
package javaCertification;

public class Employe {
    
    private String name;
    private int age;
    private int salary;

    public Employe() {
    }

    public Employe(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employe(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

   

    
    public void printDetails() {
        
        System.out.println(name + " : " + age + " : " + salary);
    }
    
    
    public static void main(String[] args) {
        Employe e1 = new Employe();
        Employe e2 = new Employe("Jack",50);
        Employe e3 = new Employe("Chole",40,5000);
        
        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
        
    }
}
