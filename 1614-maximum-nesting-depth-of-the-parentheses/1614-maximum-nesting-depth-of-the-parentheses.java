class Solution {
    public int maxDepth(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        int maxSize = 0;
        int n = s.length();
        if(n<2){
            return 0;
        }
        for(int i=0;i<n;i++){
            int curr = 0;
            //char topp = st.peek();
            if(ch[i]=='('){   
                st.push(ch[i]);
            }else if(ch[i]==')'){
                curr =st.size();
                if(maxSize<curr){
                    maxSize = curr;
                }
                st.pop();
            }
        }
        return maxSize;
    }
}