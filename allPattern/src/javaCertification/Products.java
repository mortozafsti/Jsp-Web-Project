
package javaCertification;

public class Products {
    
    int id;
    String name;

    public Products(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static void main(String[] args) {
        
        Products p = new Products(1, "Mortoza");
        Products p1 = new Products(2, "Mortoza");
        Products p3 = p;
        
        boolean ans1 = p == p1;
        boolean ans2 = p.name.equals(p1.name);
        
        System.out.println(ans1+" "+ans2);
    }
}
