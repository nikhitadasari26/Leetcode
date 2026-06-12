class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=left;i<=right;i++){
            int n =i;
            boolean flag = true;
            while(n>0){
                int d =n%10;
                if(d==0 || i%d!=0){
                    flag =false;
                    break;
                }
                 n=n/10;
            }
            if(flag){
            res.add(i);
            }
        }
        return res;
    }
}