class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;
        int m = friends.length;
        int[] arr = new int[m];
        int ind=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : friends){
            set.add(i);
        }
        for(int i : order){
            if(set.contains(i)){
                arr[ind++] = i;
            }
        }return arr;
    }
}