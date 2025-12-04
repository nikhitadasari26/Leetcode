class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                s-=nums[i];
            }
            else{
                s+=nums[i];
            }
        }
        return s;
    }
}