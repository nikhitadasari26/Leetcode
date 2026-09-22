class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<n;i++){
            currentSum += nums[i];
            max = Math.max(max,currentSum);
            if(currentSum<0){
                currentSum =0;
            }
        }return max;
    }
}