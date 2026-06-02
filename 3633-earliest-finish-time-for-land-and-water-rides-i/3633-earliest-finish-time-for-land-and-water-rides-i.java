class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res = Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int land = landStartTime[i]+landDuration[i];
                int waterbegin =Math.max(land,waterStartTime[j]);
                res = Math.min(res,waterbegin+waterDuration[j]);

                // water first
                int water = waterStartTime[j]+waterDuration[j];
                int landbegin = Math.max(water, landStartTime[i]);
                res = Math.min(res,landbegin+landDuration[i]);
            }
        }
        return res;

    }
}