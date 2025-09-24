package slidingWindow;

import java.lang.Math;

public class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int left =0, right = 0, max = 0, occurs = 0;
        for(; right < nums.length ; right++){
            if(nums[right] == 0){
                occurs++;
                if(occurs<=k){
                    max = Math.max( max , right-left+1 );
                }
                else{
                    while(occurs>k){
                        if(nums[left]==1) {
                            left++;
                        }
                        else{
                            occurs--;
                            left++;
                        }
                    }
                }
            }
            else{
                max = Math.max( max , right-left+1 );

            }
        }

        return max;
    }


    public static void main(String[] args) {
        MaxConsecutiveOnes obj1 = new MaxConsecutiveOnes();
        int[] arr = new int[]{1, 1, 1, 0, 0, 1, 1, 0};
        int k = 2;
        System.out.println("The answer is: " + obj1.longestOnes(arr,k));
    }
}
