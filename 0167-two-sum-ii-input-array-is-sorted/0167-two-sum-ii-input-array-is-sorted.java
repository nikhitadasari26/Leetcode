class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] nums = new int[2];
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum<target){
                i++;
            }else if(sum>target){
                j--;
            }else{
                nums[0] = i+1;
                nums[1] =j+1;
                break;
            }

        }
        return nums;
    }
}