class Solution {
    public int countMonobit(int n) {
        int cou=0;
        for(int i=0;i<=n;i++){
            String s =Integer.toBinaryString(i);
            int a=0;
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(j)!=s.charAt(j+1)){
                    a=1;
                    break;
                }
            }if(a==0){
                cou++;
            }
        }
        return cou;
    }
}