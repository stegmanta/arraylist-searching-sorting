import java.util.ArrayList;

public class Sort{

    public static void main(String []args){
        ArrayList<String> nameList = new ArrayList<String>();
        //right order
        // ("abby");
        // ("becca");
        // ("carl");
        // ("dave");
        // ("elizabeth");
        // ("fred");
        // ("gregg");
        
        
        nameList.add("gregg");
        nameList.add("elizabeth");
        nameList.add("carl");
        nameList.add("dave");
        nameList.add("abby");
        nameList.add("becca");
        nameList.add("fred");

        // selectionSort(nameList);
        // insertionSort(nameList);
        bubbleSort(nameList);
    }

    public static void selectionSort(ArrayList<String> list){
        //going away string
        String g;

        System.out.println("The Selection Sorted List is: ");

        for(int j = 0; j < list.size(); j++){
            int min = j;

            for(int k = j + 1; k < list.size(); k++){
                if(list.get(k).compareTo(list.get(min)) < 0){
                    min = k;
                }
            }

            if(min != j){
                g = list.get(j);
                list.set(j, list.get(min));
                list.set(min , g);
            }
        }

        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
    }


    public static void insertionSort(ArrayList<String> list){
        String g;

        System.out.println("The insertion Sorted list is: ");

        for(int j = 0; j < list.size(); j++){
            g = list.get(j);


            int k = j;
            while(k > 0 && list.get(k - 1).compareTo(g) > 0){
                list.set(k, list.get(k-1));
                k--;
            }

            list.set(k, g);

        }

        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
    }

    public static void bubbleSort(ArrayList<String> list){
        String g;

        System.out.println("The bubble sorted list is: ");
            for(int j = 0; j < list.size(); j++){
                for(int k = 0 ; k < list.size() - 1; k++){
                    if(list.get(k).compareTo(list.get(k + 1)) > 0){
                        g = list.get(k);
                        list.set(k, list.get(k + 1));
                        list.set(k + 1, g);
                    }

                }
            }
        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
    }
}