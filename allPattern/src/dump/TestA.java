package dump;

/**
 *
 * @author Cf-37
 */
class Alpha {

    int ns;
    static int s;

    public Alpha(int ns) {
        if (s < ns) {
            s = ns;
        }
        this.ns = ns;
    }
    void dopint(){
        System.out.println("ns = "+ ns + "s = " + s);
    }

}
public class TestA{
    public static void main(String[] args) {
        Alpha r1 = new Alpha(50);
        Alpha r2 = new Alpha(125);
        Alpha r3 = new Alpha(100);
        r1.dopint();
        r2.dopint();
        r3.dopint();
    }

}
