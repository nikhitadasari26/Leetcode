class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        // int k=0;
        s =s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') c=0;
            else{
                c++;
                // k=c;
            }
        }
        return c;
    }
}