class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums){
            set.add(a);
        }
        List<Integer> l = new ArrayList<>();
        for(int b : set){
            l.add(b);
        }
        //int z = l.get(b);
        Collections.sort(l);
        int m = l.size();
        if(m<3){
            return l.get(m-1);
        }else{
            return l.get(m-3);
        }
    }
}