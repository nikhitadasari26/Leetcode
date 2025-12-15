class Solution {
    public int subtractProductAndSum(int n) {
       int z =n;
       int s=0;
       int p=1;
       while(z!=0){
            int a = z%10;
            s+=a;
            p*=a;
            z=z/10;
       }
       return p-s;
    }
}