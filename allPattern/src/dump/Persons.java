
package dump;

public class Persons {
    
    String name;
    int age = 25;

    public Persons(String name) {
        //this();
        setName(name);
    }

    public Persons(String name, int age) {
       // Person(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
}
