class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cou=0;
        
        for(int i=left;i<=right;i++){
            String s = Integer.toBinaryString(i);
            int c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    c+=1;
                }
            }
            if(isPrime(c)) {
                cou++;
            }
        }
        return cou;
    }
    public boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}