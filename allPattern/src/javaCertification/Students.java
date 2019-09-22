
package javaCertification;

public class Students {
    
    int rollNo;
    String name;
    static String departmet = "Computer Science";
    static String college = "Bangladesh Open University";

     Students(int r, String n) {
       rollNo = r;
        name =n;
    }
    
    void display(){
        System.out.println(name+"'s Information");
        System.out.println("Roll: "+rollNo + " \n" + "Name: "+name + "\n" + "Institute: "+college+"\n" + "Department: "+ departmet+"\n");
    }
    static void change(){
        college = "Dhaka University";
    }
    public static void main(String[] args) {
        
        Students.change();              // Calling Change method
        //Students ss = new Students(22222, "ddddddd");
        //Students.display();
        
        Students s = new Students(111, "Mortoza");
        Students s1 = new Students(222, "Galib");
        Students s2 = new Students(333, "Munna");
        
        s.display();
        s1.display();
        s2.display(); 
       s.change();
       String aa = s.college;
        System.out.println(aa);
        
        
    }
}
