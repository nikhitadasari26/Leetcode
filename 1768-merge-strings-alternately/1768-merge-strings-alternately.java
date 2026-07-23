class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        int i=0,j=0;
        int m = word1.length();
        int n = word2.length();
        String result = "";
        while(i<m && j<n){
            result+=str1[i];
            result+=str2[j];
            i++;
            j++;
        }
        while(i<m){
            result+=str1[i];
            i++;
        }
        while(j<n){
            result+=str2[j];
            j++;
        }
        return result;
        
    }
}