class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int res=-1;
        for(int i=0;i<n;i++){
            int k = nums[i];
            int sum=0;

            while(k>0){
                int d = k%10;
                sum+=d;
                k/=10;
            }
            if(sum==i){
                res=i;
                break;
            }
        }
        return res;
    }
}