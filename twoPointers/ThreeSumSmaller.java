import  java.util.*;

public class ThreeSumSmaller {
    public static int smallerSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < target) {
                    // All triplets from (left, left+1, ..., right) will satisfy
                    count += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 5, 1, 7, 4};
        int target = 12;
        System.out.println("Answer: " + smallerSum(nums1, target)); // Output: 4
    }

}