class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(candyType[i]);
        }
        int a = set.size();
        if(a>n/2){
            return n/2;
        }
        else{
            return a;
        }
    }
}