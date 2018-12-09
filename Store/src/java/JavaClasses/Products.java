
package JavaClasses;

public class Products {
    
    private String name;
    private String price;
    private int id;

    public Products(String name, String price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Products{" + "name=" + name + ", price=" + price + ", id=" + id + '}';
    }
    
    
}
