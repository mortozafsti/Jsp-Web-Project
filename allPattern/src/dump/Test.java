
package dump;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Test {
    
    public static void checkList(List<Person> list, Predicate<Person> predicate){ 
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name+" ");
            }
        }
    }
    public static void main(String[] args) {
        List<Person> ilist = Arrays.asList(new Person("Hank", 12),new Person("Bank", 23),new Person("Hogi", 34));
        checkList(ilist, p -> p.getAge() > 40);
    }
}
