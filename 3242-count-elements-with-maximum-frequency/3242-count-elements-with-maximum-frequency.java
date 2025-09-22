class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> fre = new HashMap<>();
        
        for(int c : nums){
            fre.put(c,fre.getOrDefault(c,0)+1);
        }
        
        int m=0;
        for(int i :nums){
            if(fre.get(i)>m) m =fre.get(i);
        }
        int s=0;
        for(int i : fre.values()){
            if(i == m) s+=i;
        }
        return s;

    }
}