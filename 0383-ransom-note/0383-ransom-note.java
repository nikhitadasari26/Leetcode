class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()< ransomNote.length()) return false;
       
        for(char ch :ransomNote.toCharArray()){
            if(magazine.contains(String.valueOf(ch))){
                magazine =magazine.replaceFirst(String.valueOf(ch),"");
            }else{
                return false;
            }
        }
        return true;
    }
}