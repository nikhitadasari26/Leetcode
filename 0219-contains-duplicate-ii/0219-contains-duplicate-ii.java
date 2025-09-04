class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(arr.containsKey(nums[i])){
                if(i-arr.get(nums[i])<=k){
                    return true;
                }
            }
            arr.put(nums[i],i);
        }
        return false;
    }
}