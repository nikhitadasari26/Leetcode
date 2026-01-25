class Solution {
    public boolean isPalindrome(String s) {
        String res = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       
        String rev = "";
        for(int i=res.length()-1;i>=0;i--){
            rev +=res.charAt(i);
        }
        if(rev.equals(res)){
            return true;
        }
        else{
            return false;
        }
    }
}