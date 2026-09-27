class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int num= Math.abs(nums[i]);
            int in = num-1;
            if(nums[in]<0){
                res.add(num);

            }
            nums[in]*=-1;
        }
        return res;
    }
}