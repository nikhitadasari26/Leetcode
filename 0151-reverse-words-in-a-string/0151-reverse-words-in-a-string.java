class Solution {
    public String reverseWords(String s) {
        String[] word = s.split("\\s+");
        String rev = "";
        for(int i=word.length-1;i>=0;i--){
            rev+=word[i]+" ";
        }
        return rev.trim();
    }
}