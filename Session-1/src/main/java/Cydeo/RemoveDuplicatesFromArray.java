package Cydeo;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    // method returns the number of unique elements in nums
    public static int removeDuplicates(int[] nums) {
        int insPoi = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { //new element is a new element
                nums[insPoi] = nums[i];
                insPoi++;
            }
        }
        return insPoi;
    }
}
