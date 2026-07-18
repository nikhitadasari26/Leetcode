class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min = nums[i];
            }
            if(max< nums[i]){
                max = nums[i];
            }
        }
        while(max!=0){
            int temp = min%max;
            min = max;
            max = temp;
        }
        return min;
    }
}