
package javaCertification;

public class Plannet1 {
    
    public String name;
    public int moons;

    public Plannet1(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }
    
    public static void main(String[] args) {
        
        Plannet1[] planets = {
            new Plannet1("Mercury",0),
            new Plannet1("Venus",0),
            new Plannet1("Earth",1),
            new Plannet1("March",2),
        };
        
        System.out.println(planets);
        System.out.println(planets[2]);
        System.out.println(planets[2].moons);
    }
    
    
}
