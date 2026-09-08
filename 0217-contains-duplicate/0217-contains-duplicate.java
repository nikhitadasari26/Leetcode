class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean res = false;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                
                res = true;
                
            }
            else{
                set.add(nums[i]);
            }
        }
        return res;
    }
}