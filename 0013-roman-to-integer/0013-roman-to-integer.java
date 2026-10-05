class Solution {
    public int romanToInt(String s) {
        int n= s.length();
        int num =0;
        for(int i=0;i<n;i++){
            int curr = value(s.charAt(i));
            if(i+1 < n && curr< value(s.charAt(i+1))){
                num-=curr;
            }else{
                num+=curr;
            }
        }
        return num;
    }
    public int value(char c){
        if(c=='I') return 1;
        else if(c=='V') return 5; 
        else if(c=='X') return 10; 
        else if(c=='L') return 50; 
        else if(c=='C') return 100; 
        else if(c=='D') return 500; 
        else return 1000;
    }
}