class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
       HashSet<Integer> arr = new HashSet<>();
       for(int i : nums){
            arr.add(i);
       }
       int m =1;
       
       while(arr.contains(m)){
            m++;
       }
       return m;
    }
}