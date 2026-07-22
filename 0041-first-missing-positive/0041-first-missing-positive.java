class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int missing=1;
        while(set.contains(missing)){
            missing++;
        }
            
        return missing;
    }
}