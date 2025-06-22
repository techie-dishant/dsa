class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // pointer for writing the next valid number

        for (int num : nums) {
            // Keep element only if it's one of the first two, or not the same as the element at i-2
            if (i < 2 || num != nums[i - 2]) {
                nums[i] = num;
                i++;
            }
        }

        return i;
    }
}