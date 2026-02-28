class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sc = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int b = sc.pop();
                int a = sc.pop();
                sc.push(a+b);
            }
            else if(s.equals("-")){
                int b = sc.pop();
                int a = sc.pop();
                sc.push(a-b);
            }
             else if(s.equals("*")){
                int b = sc.pop();
                int a = sc.pop();
                sc.push(a*b);
            }
             else if(s.equals("/")){
                int b = sc.pop();
                int a = sc.pop();
                sc.push(a/b);
            }else{
                sc.push(Integer.parseInt(s));
            }
        }
        return sc.pop();
    }
}