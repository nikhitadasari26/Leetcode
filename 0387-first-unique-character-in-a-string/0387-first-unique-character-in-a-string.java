class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        char[] arr = s.toCharArray();
        for(char ch : arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //char cha = ;
        
        //int res =-1;
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                return i;
            }
        }
        return -1;

    }
}