import java.util.ArrayList;

public class Search{


    public static void main(String []args){

    ArrayList<String> haystack = new ArrayList<String>();
    String needle;
    haystack.add("hay");
    haystack.add("hay");
    haystack.add("needle");
    haystack.add("hay");


    public static int normalSearch(ArrayList<String> haystack, String needle){
        for(int j = 0; j < haystack.size(); j++){
            if(haystack.get(j).equals(needle)){
                return j;
            }
            
        }
        return -1;
    }

    }
    






}