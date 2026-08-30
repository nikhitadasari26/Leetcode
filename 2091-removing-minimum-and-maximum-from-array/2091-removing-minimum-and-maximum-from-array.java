class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max_ind = 0;
        int min_ind =0;
        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max= nums[i];
                max_ind =i;
            }
            if(min>nums[i]){
                min = nums[i];
                min_ind=i;
            }
        }
        int total =0;
        int f =Math.min(min_ind,max_ind);
        int l = Math.max(min_ind,max_ind);
        int delf =l+1;
        int delb = nums.length-f;
        int delboth = (f+1)+(nums.length-l);
        return Math.min(delf,Math.min(delb,delboth));
    }
}