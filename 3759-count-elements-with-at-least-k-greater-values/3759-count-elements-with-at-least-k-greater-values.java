class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
       
        int count=0;
        if(k==0){
            return n;
        }
        int i=0;
        while(i<n){
            int j=i+1;
            while(j<n && nums[j]==nums[i]){
                j++;
            }
            if(n-j>=k){
                count+=j-i;
            }  
            i=j;      
        }
        return count;
    }
}