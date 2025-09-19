class Solution {
    public int heightChecker(int[] heights) {
        //int n = heights.length;
        // int[] arr = Arrays.copyOf(heights,n);
        // Arrays.sort(arr);
        // int c=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=heights[i]){
        //         c++;
        //     }
        // }
        // return c;
        ArrayList<Integer> l = new ArrayList<>();
        for(int c : heights){
            l.add(c);
        }
        Collections.sort(l);
        int c=0;
        for(int i=0;i<l.size();i++){
            if(l.get(i)!=heights[i]){
                c+=1;
            }
        }
        return c;
    }
}