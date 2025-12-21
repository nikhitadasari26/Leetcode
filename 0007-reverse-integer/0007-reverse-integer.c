int reverse(int x){
    long long int rev=0;
    while(x!=0)
    {
       int n=x%10;
         rev=rev*10+n;
        x=x/10;
    }
    if(rev<INT_MIN || INT_MAX<rev) return 0;
    else return rev;
}