class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd =0;
        int even =0;
        int i=1;
        int z = 2*n;
        while(z!=0){
           
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
            i++;
            z--;
        }
        while(even!=0){
            int res = odd%even;
            odd = even;
            even = res;
        }
        return odd;
    }
}