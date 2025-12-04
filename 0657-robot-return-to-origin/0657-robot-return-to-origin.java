class Solution {
    public boolean judgeCircle(String moves) {
       // int n =  moves.length;
        char[] arr = moves.toCharArray();
        int c1=0;
        int c2=0;
        for(char i : arr){
            if(i == 'U') c1+=1;
            else if(i == 'D') c1-=1;
            else if(i == 'L') c2+=1;
            else c2-=1;
        }
        if(c1==0 && c2==0){
            return true;
        }
        else{
            return false;
        }
    }
}