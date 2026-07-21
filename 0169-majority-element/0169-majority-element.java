class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ch: nums){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int z=0;
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > (n/2)){
                z=entry.getKey();
            }
        }
        return z;
    }
}