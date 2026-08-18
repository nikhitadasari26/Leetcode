class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // int i = 0;
        int[] left_arr = new int[n];
        int[] right_arr = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
             max = Math.max(max,height[i]);
            left_arr[i]=max;    
        }
        int maxl=0;
        for(int i=n-1;i>=0;i--){
            maxl = Math.max(maxl,height[i]);
            right_arr[i] = maxl;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int min = Math.min(left_arr[i],right_arr[i]);
            sum+=(min- height[i]);
        }
        return sum;
        
    }
}