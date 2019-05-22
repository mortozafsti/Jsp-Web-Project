package mahabubulHasan;

import java.util.ArrayList;

 class NewClass {

    
    private void init(){
        System.out.println("Initialized");
    }
    private void start(){
        init();
        System.out.println("Started");
    }

}
class TestCall{ 
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(null);
        al.remove(2);
        al.remove(null);
        
        System.out.println(al);
    }
}
