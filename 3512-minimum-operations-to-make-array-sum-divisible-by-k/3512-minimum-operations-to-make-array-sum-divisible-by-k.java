class Solution {
    public int minOperations(int[] nums, int k) {
        int n =nums.length;
        int s=0;
        //int m =0;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        if(s%k==0){
            return 0;
        }
        else{
            int m = s%k;
            return m;
        }
    }
}