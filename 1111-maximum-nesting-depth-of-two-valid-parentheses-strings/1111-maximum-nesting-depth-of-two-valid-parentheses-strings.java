class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length()
        ;
        int depth =0;
        char[] ch = seq.toCharArray();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(ch[i] == '('){
                arr[i] = depth%2;
                depth++;
            }
            else{
                depth--;
                arr[i] =depth%2;
                
            }
        }
        return arr;
    }
}