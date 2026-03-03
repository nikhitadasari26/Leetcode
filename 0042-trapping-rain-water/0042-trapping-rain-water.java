class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = height[0];
        for(int i=1;i<n;i++){
            lmax[i] = Math.max(lmax[i-1],height[i]);
        }
        rmax[n-1] = height[n-1];
        for(int j=n-2;j>=0;j--){
            rmax[j] = Math.max(rmax[j+1],height[j]);
        }
        int c=0;
        for(int i=0;i<n;i++){
            c += Math.min(rmax[i],lmax[i]) - height[i];
        }
        return c;
    }
}