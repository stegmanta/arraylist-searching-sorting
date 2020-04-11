import java.util.ArrayList;

public class Search{


    public static void main(String []args){

    ArrayList<String> haystack = new ArrayList<String>();
    String needle;
    haystack.add("hay");
    haystack.add("hay");
    haystack.add("hay");
    haystack.add("needle");
    haystack.add("hay");
    System.out.println(normalSearch(haystack,"needle"));
    System.out.println(binarySearch(haystack,"needle"));
    }


    public static int normalSearch(ArrayList<String> haystack, String needle){
        for(int j = 0; j < haystack.size(); j++){
            if(haystack.get(j).equals(needle)){
                return j;
            }
            
        }
        return -1;
    }

    public static int binarySearch(ArrayList<String> haystack, String needle){
        int size = haystack.size();
        int start = 0;
        int last = size - 1;
        int middle = 0;

        while(start <= last){
            middle =  (start + last)/2;
            if(haystack.get(middle).equals(needle)){
                return middle;
            }else if(haystack.get(middle).compareTo(needle) < 0){
                start = middle + 1;
            }else{
                last = middle - 1;
            }
        }
        return -1;
    }
    






}