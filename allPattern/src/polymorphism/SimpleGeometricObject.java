
package polymorphism;

public class SimpleGeometricObject {
    
     int id = 1;
    String colour = "Black";
    String dataCreated = "12-02-2019";

    public SimpleGeometricObject() {
    }
    public SimpleGeometricObject(int id,String colour,String dataCreated) {
        this.id=id;
        this.colour=colour;
        this.dataCreated=dataCreated;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(String dataCreated) {
        this.dataCreated = dataCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Override
//    public String toString() {
//        return "SimpleGeometricObject{" + "id=" + id + ", colour=" + colour + ", dataCreated=" + dataCreated + '}';
//    }
    
    
}
