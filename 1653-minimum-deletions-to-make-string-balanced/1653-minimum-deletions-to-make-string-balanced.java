class Solution {
    public int minimumDeletions(String s) {
        char[] c = s.toCharArray();
        int co=0;
        int total = 0;
        for(char ch : c){
            if(ch == 'b'){
               co++;
            }else{
                if(co>0){
                    total = Math.min(total+1,co);
                }
            }

        }
        return total;
    }
}