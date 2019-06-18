
package VendorPractise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    
    public void updatePrice(Product product, double price){
        
        price = price * 2;
        product.price = product.price+price;
        
    }
    
    public static void main(String[] args) {
        
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;
        
        Test t = new Test();
        t.updatePrice(prt, newPrice);
        System.out.println(prt.price + " : " + newPrice);
        
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
