class Solution {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!str.isEmpty() && ((str.peek()=='(' && ch==')') || (str.peek()=='[' && ch==']') || (str.peek()=='{' && ch=='}'))){
                str.pop();
            }
            else{
                str.push(ch);
            }
        }
        return str.isEmpty();
    }
}