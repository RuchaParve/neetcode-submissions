class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operand = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("*") || tokens[i].equals("/") || tokens[i].equals("+") || tokens[i].equals("-")){
                int op1 = operand.pop();
                int op2 = operand.pop();

                if(tokens[i].equals("+")){
                    operand.push(op2 + op1);
                }
                else if(tokens[i].equals("-")){
                    operand.push(op2 - op1);
                }
                else if(tokens[i].equals("/")){
                    operand.push(op2 / op1);
                }
                else{
                    operand.push(op2 * op1);
                }

            }
            else{
                operand.push(Integer.parseInt(tokens[i]));
            }
        }
        return operand.peek();
    }
}
