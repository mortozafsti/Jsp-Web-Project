    
package polymorphism;
    
public class Example1{
    
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(1,"red","sss"));
    }
    
    public static void displayObject(SimpleGeometricObject object){
        System.out.println("Created on "+object.getDataCreated()+" "+ object.getColour());
    }
    
}
