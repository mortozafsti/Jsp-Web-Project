
package javaCertification;

public class Employeee {
    
    public int salary;
    
}

class Manager extends Employeee{
    
    public int budget;
    
}

class Director extends Manager{
    
    public int stockOption;
    
    public static void main(String[] args) {
        
        Employeee employeee = new Employeee();
        Manager manager = new Manager();
        Director director = new Director();
        
        int n [][] = {{1,3},{2,4}};
        
        for (int i = n.length-1; i >= 0; i--) {
            for (int y : n[i]) {
                System.out.print(y);
            }
        }
        
        
        
    }
    
}


