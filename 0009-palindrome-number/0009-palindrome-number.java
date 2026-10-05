class Solution {
    public boolean isPalindrome(int x) {
        
        int rev=0;
        int n=x;
        if(x<0) return false;
        while(n>0){
            int digit =n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return x==rev;
    }
}