class Solution {
    private int[] arrayReverse(int [] arr, int n){
        int high = n-1;
        int low = 0;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n= image.length; 
        for(int i=0;i<n;i++){
            int m = image[i].length;
            arrayReverse(image[i],m);
            for(int j=0;j<m;j++){
                if(image[i][j] == 1) image[i][j] = 0;
                else                 image[i][j] = 1;
            }
        }
        return image;
    }
}