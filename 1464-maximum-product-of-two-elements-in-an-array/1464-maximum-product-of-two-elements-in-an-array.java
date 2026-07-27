class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        // int max = 0;
        // int second = 0;
        // for(int i=0;i<n;i++){
        //     if(max <= nums[i]){
        //         second = max;
        //         max = nums[i];
        //     }
        // }
        Arrays.sort(nums);
        int max = nums[n-1];
        int second = nums[n-2];
        return (max-1)*(second-1);
    }
}