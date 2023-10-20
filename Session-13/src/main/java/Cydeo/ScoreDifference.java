package Cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ScoreDifference {
    public static void main(String[] args) {
       //int[] a=new int[]{3,6,2,3,5};
        ArrayList<Integer> a= new ArrayList<>();
        a.add(3);
        a.add(6);
        a.add(2);
        a.add(3);
        a.add(5);
        System.out.println(getScoreDifference(a));
    }
    public static int getScoreDifference(ArrayList<Integer> numSeq) {
        int firstScore = 0;
        int secondScore = 0;
        boolean isFirstPlayerTurn = true;
        boolean isFirst=true;
        int currentNum=0;
        while (!numSeq.isEmpty()) {
            if (isFirst){
                currentNum = numSeq.get(0);
                numSeq.remove(0);
            }else {
               currentNum = numSeq.get(numSeq.size()-1);
                numSeq.remove(numSeq.size()-1);
            }
            if (isFirstPlayerTurn) {
                firstScore += currentNum;
            } else {
                secondScore += currentNum;
            }
            if (currentNum % 2 == 0) {
                // If the removed number is even, reverse the sequence
                if (isFirst) isFirst=false;
                else isFirst=true;
            }
            // Switch turns
            isFirstPlayerTurn = !isFirstPlayerTurn;
        }
        // Calculate the score difference
        return firstScore - secondScore;
    }
}