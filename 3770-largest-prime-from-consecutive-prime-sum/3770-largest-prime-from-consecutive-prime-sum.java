class Solution {
    public int largestPrime(int n) {
        if(n<2) return 0;
        boolean[] primeNum = new boolean[n+1];
        for(int i=2;i<=n;i++){
            primeNum[i]=true;
        }
            for(int i=2;i*i<=n;i++){
                if(primeNum[i]){
                    for(int j=i*i;j<=n;j+=i){
                        primeNum[j] = false;
                    }
                }
            }
        
        int c=0;
        int[] arr = new int[n];
        for(int i=2;i<=n;i++){
            if(primeNum[i]){
                arr[c++] = i;
            }
        }
        int s=0;
        int res = 0;
        for(int i=0;i<c;i++){
            s+=arr[i];
            if(s>n) break;
            if(primeNum[s]){
                res = s;
            }
        }
        return res;
    }
    
}