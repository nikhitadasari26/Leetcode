class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        double sum=0;
        double ans;
        int j=0;
        //double avg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            
        }
        ans = sum/k;
        for(int i=k;i<n;i++){
            sum -=nums[j];
            sum+=nums[i];  
            j++; 
             ans = Math.max(ans,sum/k);    
        }
        return ans;
    }
}