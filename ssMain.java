import java.util.ArrayList;

public class ssMain{

    public static void main(String []args){
        ArrayList<String> h = new ArrayList<String>();
        h.add("hay");
        h.add("hay");
        h.add("hay");
        h.add("needle");
        h.add("hay");
        System.out.print(h.normalSearch("needle"));
    }
}