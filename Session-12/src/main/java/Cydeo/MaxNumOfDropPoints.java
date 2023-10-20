package Cydeo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNumOfDropPoints {
        public static void main(String[] args) {
            int[] xCoordinates = {2,3,2,4,2};
            int[] yCoordinates = {2,2,6,5,8};

            System.out.println(maxDropPoints(xCoordinates, yCoordinates));
        }
    private static int maxDropPoints(int[] xCoordinate, int[] yCoordinate) {

        int xMax = 0;
        int yMax = 0;
        for(Integer x : xCoordinate){
            xMax = Math.max(xMax, (int) Arrays.stream(xCoordinate).filter(a-> a==x).count());
        }

        for(Integer y : yCoordinate){
            yMax = Math.max(yMax, (int) Arrays.stream(yCoordinate).filter(a-> a==y).count());
        }

        return(Math.max(xMax, yMax));
    }

}

