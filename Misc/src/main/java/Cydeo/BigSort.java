package Cydeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BigSort {
    public static void main(String[] args) {
  List<String> unSorted= new ArrayList<>();
  unSorted.add("1");unSorted.add("200");unSorted.add("150");unSorted.add("3");
   bigSorting(unSorted);
    }
    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here

        Collections.sort(unsorted, new compareStringInt());
        unsorted.forEach(s -> System.out.println(s));
        return unsorted;

    }
     static class  compareStringInt implements Comparator<String> {

         @Override
         public int compare(String o1, String o2) {
             return (Integer.valueOf(o1)-Integer.valueOf(o2));
         }
     }

}
