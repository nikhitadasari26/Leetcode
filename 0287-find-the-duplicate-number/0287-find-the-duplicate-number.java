class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n = 0;
        for(Map.Entry<Integer,Integer> c : map.entrySet()){
            if(c.getValue()>=2){
                n = c.getKey();
            }
        }
        return n;
    }
}