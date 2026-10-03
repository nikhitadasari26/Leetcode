class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int left =0;
        // int right = 0;
        int i=0;
        int count=0;
        while(i<n-1){
            left = left + nums[i];
            int right =0;
            for(int j=i+1;j<n;j++){
                right+=nums[j];
            }
            int max = Math.abs(left-right);
            if(max%2==0){
                count++;
            }
            i++;
        }
        return count;
    }
}