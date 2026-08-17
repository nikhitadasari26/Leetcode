class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max_area = Integer.MIN_VALUE;
        while(i<j){
            int current = Math.min(height[i],height[j])*(j-i);
            max_area = Math.max(max_area,current);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
            
        }
        return max_area;
    }
}