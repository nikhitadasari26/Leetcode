class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ch : nums){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int num : map.keySet()){
            if(map.get(num)==2){
                res.add(num);
            }
        }
        int[] r = new int[res.size()];
        for(int i=0;i<res.size();i++){
            r[i] = res.get(i);
        }
        return r;
    }
}