class Solution {
    public int maxFreqSum(String s) {
       
        HashMap<Character,Integer> fre = new HashMap<>();
        HashMap<Character,Integer> err = new HashMap<>();
        int vmax = 0;
        int cmax=0;
        for(Character c : s.toCharArray()){
            if( c == 'a' || c=='e' || c == 'i' || c=='o' || c == 'u' ){
                fre.put(c,fre.getOrDefault(c,0)+1);
                int an = fre.get(c);
                if(vmax<an) vmax = an;
            }
            else{
                err.put(c,err.getOrDefault(c,0)+1);
                int cn = err.get(c);
                if(cmax<cn) cmax = cn;
            }
        }
        return vmax + cmax;

    }
}