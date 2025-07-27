import java.util.*;

public class ThreeSumClosestSolution {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - currentSum);

                if (diff < minDiff) {
                    closestSum = currentSum;
                    minDiff = diff;
                }

                if (currentSum == target) {
                    return currentSum; // Exact match
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int result = threeSumClosest(nums, target);
        System.out.println("Closest sum to target " + target + " is: " + result);
    }
}
