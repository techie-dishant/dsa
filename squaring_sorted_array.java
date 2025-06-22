class Solution{
    public int[] sortedSquares(int []nums){
        int front = 0, back = nums.length-1 , i=nums.length-1;
        int[] result = new int[nums.length];
        while(front<=back){
            if(Math.abs(nums[front])>Math.abs(nums[back])){
                result[i] = nums[front] * nums[front];
                front++;
            }
            else {
                result[i] = nums[back] * nums[back];
                back--;
            }
            i--;
        }

        return result;
    }
}