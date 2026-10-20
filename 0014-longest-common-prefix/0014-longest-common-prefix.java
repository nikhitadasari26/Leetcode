class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String a = strs[0];
        String b = strs[n-1];
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        int i=0,j=0;
        int x = a1.length-1;
        int y = b1.length-1;
        int count=0;
        while(i<=x && j<=y){
            if(a1[i]==b1[j]){
                count++;
            }else{
                break;
            }
            i++;
            j++;
        }
        return strs[0].substring(0,count);
    }
}