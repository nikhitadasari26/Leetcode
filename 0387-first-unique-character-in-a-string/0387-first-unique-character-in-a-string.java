class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            int z = map.get(arr[i]);
            if(z==1){
                return i;
            }
        }
        return -1;
    }
}