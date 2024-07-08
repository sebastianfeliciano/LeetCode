class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char letter : s.toCharArray()){
            if(letter == '(') {
                stack.push(')');
            } 
            else if(letter == '['){
                stack.push(']');
            }
            else if(letter == '{'){
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop() != letter){
                return false;
            }
        }
        return stack.isEmpty();
    }
}