class Solution {
    public int minMoves(int[] nums) {
        int m = 0;
        for(int num: nums){
            if( num > m) m = num;
        }
        int moves = 0;
        for(int num: nums){
            moves += (m-num);
        }
        return moves;
    }
}