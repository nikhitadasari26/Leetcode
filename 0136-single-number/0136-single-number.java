class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> fre = new HashMap<>();
        for(int i=0;i<n;i++){
            fre.put(nums[i],fre.getOrDefault(nums[i],0)+1);
        }
        int s=0;
        for(int i=0;i<n;i++){
           if(fre.get(nums[i])==1){
                s=nums[i];
                break;
           }
        }
        return s;
    }
}