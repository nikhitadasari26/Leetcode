class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum =0;
        int c=0;
        for(int i=cost.length-1;i>=0;i--){
            c++;
            if(c%3!=0){
                sum+=cost[i];
            }else{
                sum+=0;
            }
        }
        return sum;
    }
}