class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int minrow = Integer.MAX_VALUE;
        int col = 0;

        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            minrow = Integer.MAX_VALUE;

           
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minrow) {
                    minrow = matrix[i][j];
                    col = j;
                }
            }

           
            boolean flag = true;

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][col] > minrow) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                li.add(minrow);
            }
        }

        return li;
    }
}