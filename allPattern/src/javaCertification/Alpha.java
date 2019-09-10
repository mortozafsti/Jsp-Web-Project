package javaCertification;

public class Alpha {

    int ns;
    static int s;

    public Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }

    }
    void doPrint(){
        System.out.println("ns = " + ns + "s = "+ s);
    }

}
class Test2{
    
    public static void main(String[] args) {
        
        Alpha a1 = new Alpha(50);
        Alpha a2 = new Alpha(125);
        Alpha a3 = new Alpha(100);
        
        a1.doPrint();
        a2.doPrint();
        a3.doPrint();
    }
}
