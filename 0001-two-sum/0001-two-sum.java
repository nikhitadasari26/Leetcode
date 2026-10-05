class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        int i=0;
        while(i<n){
            int j=i+1;
            while(j<n){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
                j++;
            }
            i++;
        }
        return new int[]{};
    }
}