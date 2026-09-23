class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length;
        int pro=1;
        // int res =0;
        for(int i=0;i<n;i++){

           if(nums[i]<0){
                pro*=-1;
                
           }else if(nums[i]>0){
                pro*=1;
           }
           else {
                pro =0;
           }

        }
        return pro;
    }
}