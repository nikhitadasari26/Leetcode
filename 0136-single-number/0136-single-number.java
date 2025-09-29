class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
        int c=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==nums[i]) c++;
        }
        int k = nums[i];
        if(c==1) return k;
    }
    return -1;
    }
}