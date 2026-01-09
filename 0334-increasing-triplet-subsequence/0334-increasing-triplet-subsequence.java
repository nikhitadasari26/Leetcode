class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        // if(n<3) return false;
        int j= Integer.MAX_VALUE;
        int k = Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
            if(nums[i]<=j){
                j=nums[i];
            }
            else if(nums[i]<=k){
                k = nums[i];
            }
            else{
                return true;
            }
       }
       return false;
    }
}