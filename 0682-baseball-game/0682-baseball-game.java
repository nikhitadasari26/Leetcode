class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
           if(operations[i].equals("+")){
                int last = stack.pop();
                int add = stack.peek()+last;
                stack.push(last);
                stack.push(add);
           }else if(operations[i].equals("C")){
            stack.pop();
           }else if(operations[i].equals("D")){
            stack.push(stack.peek()*2);
           }else{
            stack.push(Integer.parseInt(operations[i]));
           }
            
            
        }
        for(int i:stack){
            sum+=i;
        }
        return sum;
    }
}