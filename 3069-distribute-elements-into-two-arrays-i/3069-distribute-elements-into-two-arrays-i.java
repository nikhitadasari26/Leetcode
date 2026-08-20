class Solution {
    public int[] resultArray(int[] nums) {
        int n= nums.length;
        int m = n/2;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int i=2;
        
        while(i<n){
            int last1 = arr1.get(arr1.size()-1);
            int last2 = arr2.get(arr2.size()-1);
            if(last1>last2){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
                // k++;
            }
            i++;
        }
        int[] result = new int[n];
        for(int k=0;k<arr1.size();k++){
            result[k] = arr1.get(k);
        }
        for(int j=0;j<arr2.size();j++){
            result[j+arr1.size()] = arr2.get(j);
        }
        return result;

    }
}