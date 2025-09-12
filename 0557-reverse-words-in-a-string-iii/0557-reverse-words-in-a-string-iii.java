class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
    String res = "";
    for(int i=0;i<words.length;i++){
        String w = words[i];
        String rev = "";
        for(int j=w.length()-1;j>=0;j--){
            rev+=w.charAt(j);
        }
        res = res+rev+" ";
    }
    return res.trim();
    }
}