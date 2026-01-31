class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch = ' ';
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                ch = letters[i];
                break;
            }
        }
        if(ch!=' '){
            return ch;
        }else{
            return letters[0];
        }
    }
}