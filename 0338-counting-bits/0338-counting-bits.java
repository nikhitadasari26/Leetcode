class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            int c=0;
            int temp = i;
            while(temp>0){
                if((temp&1)==1){
                    c++;
                }
                temp=temp>>1;
            }
            arr[i]=c;
        }
        return arr;
        // int i=0;
        // while(n>0){
        //     arr[i] = n%2;
        //     n/=2;
        //     i++;
        // }
        // int c=0;
        // for(int i=0;i<n+1;i++){
        //     if(arr[i]&1==1){
        //         c++;
        //     }
        // }

    

    }
    // static result(int[] arr,n){
    //    // int[] arr = new int[n+1];
        
    //     int i=0;
    //     while(n>0){
    //         arr[i] = n%2;
    //         n/=2;
    //         i++;
    //     }
    //     int c=0;
    //     for(int i=0;i<n+1;i++){
    //         if(arr[i]&1==1){
    //             c++;
    //         }
    //     }

    // }
}