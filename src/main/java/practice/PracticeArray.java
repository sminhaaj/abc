package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeArray {

    public static void sortArray(){
        String[] boroughs = {"Manhattan", "Queens", "Brooklyn", "Bronx", "Staten Island"};
        Arrays.sort(boroughs);
        System.out.println(Arrays.toString(boroughs));
    }





    public static void main(String[] args){
        //sortArray();
        List<String> lists = new ArrayList<String>();
        lists.add("A");
        lists.add("B");

        //System.out.println(lists);

        for(String list: lists){
            System.out.println(list);
        }

        String[] boroughs = {"Manhattan", "Queens", "Brooklyn", "Bronx", "Staten Island"};
    }
}
