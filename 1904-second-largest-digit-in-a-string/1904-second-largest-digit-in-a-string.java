class Solution {
    public int secondHighest(String s) {
        // HashSet<Character> set = new HashSet<>();
        int l = -1;
        int sec = -1;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                int n = c - '0';
                if(n>l){
                    sec =l;
                    l = n;
                }
                else if(n>sec && n<l){
                    sec = n;
                }
               
            }
        }
        return sec;

    }
}