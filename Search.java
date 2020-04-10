import java.util.ArrayList;

public class Search{
    ArrayList<String> haystack = new ArrayList<String>();
    String needle;


    public Search(ArrayList<String> haystack, String needle){
        this.haystack = haystack;
        this.needle = needle;
    }

    public static int normalSearch(String needle){
        for(int j = 0; j < haystack.size(); j++){
            if(haystack.get(j).equals(needle)){
                return j;
            }
            
        }
        return -1;
    }







}