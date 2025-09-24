class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int l=0;
        int r =n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
               arr[l++] = nums[i];
            }
            else{
                arr[r--] = nums[i];
            }
        }
        return arr;
    }
}