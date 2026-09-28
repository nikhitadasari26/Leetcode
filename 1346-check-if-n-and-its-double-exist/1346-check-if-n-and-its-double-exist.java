class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int num = 2 * arr[i];
            for(int j=0;j<n;j++){
                
                if(i!=j && arr[j] == num){
                    return true;
                    
                }
            }
        }
        return false;
    }
}