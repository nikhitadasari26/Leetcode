class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        //Arrays.sort(nums);
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(j!=i && nums[i]>nums[j]){
                    c+=1;
                }
            }
            arr[i] = c;
        }
        return arr;
    }
}