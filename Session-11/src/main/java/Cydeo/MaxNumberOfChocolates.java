package Cydeo;

public class MaxNumberOfChocolates {
    public static void main(String[] args){
            int[] inputArr = {5, 30, 99, 60,5, 10};
            int result = maxChocolates(inputArr);
            System.out.println(result);
        }

        public static int maxChocolates(int[] inputArr) {
            int n = inputArr.length;

            int[] maxChocolates = new int[n];
            maxChocolates[0] = inputArr[0];
            maxChocolates[1] = Math.max(inputArr[0], inputArr[1]);
            for (int i = 2; i < n; i++) {
                maxChocolates[i] = Math.max(maxChocolates[i - 1], maxChocolates[i - 2] + inputArr[i]);
            }

            return maxChocolates[n - 1];
        }
    }