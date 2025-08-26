class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        
        int oc=0;
        for(int j=0;j<n;j++)
        {
            int c=0;
                while(nums[j]>0)
                {
                    int z = nums[j]%10;
                    c+=1;
                    nums[j]=nums[j]/10;
                }
            if(c%2==0) oc+=1;
            
        }
        return oc;
    }
}