class Solution {
    public boolean isPalindrome(String s) {
        String t ="";
        for(char ch : s.toCharArray()){
            if(ch >='A' && ch<='Z'){
                char c = Character.toLowerCase(ch);
                t+=c;
            }
            else if(ch >='a' && ch <='z'){
                t+=ch;
            }else if(ch>='0' && ch <='9'){
                t+=ch;
            }else{
                t+="";
            }
        }
        String z = "";
        for(int i=t.length()-1;i>=0;i-- ){
            z += t.charAt(i);
        }
        if(t.equals(z)){
            return true;
        }
        else{
            return false;
        }
    }
}