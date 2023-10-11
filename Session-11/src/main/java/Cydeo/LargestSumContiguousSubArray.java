package Cydeo;

public class LargestSumContiguousSubArray {
    public static void main(String[] args)
    {
        int[] a = { 2,-8,3,-2,4,-10 };
        System.out.println("Maximum contiguous sum is "
                + funcSum(a));
    }
    public static int funcSum(int[] inputArr)
    {

        int size = inputArr.length;
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere= 0;

        for (int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + inputArr[i];
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }
}
// Kadane's Algorithm
        /*Initialize:
        max_so_far = INT_MIN
        max_ending_here = 0

        Loop for each element of the array
       (a) max_ending_here = max_ending_here + a[i]
       (b) if(max_so_far < max_ending_here)
        max_so_far = max_ending_here
       (c) if(max_ending_here < 0)
        max_ending_here = 0*

        return max_so_far/
         */