class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> arr = new ArrayList<>();
        // Stack<Integer> st = new Stack<>();
        int m = target.length;
        int j=0;
        for(int i=1;i<=n && j<m;i++){
            
            arr.add("Push");
            if(i ==target[j]){
                
                j++;
            }
            else{
                arr.add("Pop");
            }
        }
        return arr;
    }
}