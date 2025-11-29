class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        //boolean flag = false;
        int s = arr[1]-arr[0];
        //if(n>2){
        for(int i=1;i<n-1;i++){
            if(arr[i+1]-arr[i]!=s){
                return false;
            }
        }
        //}
        return true;
    }
}