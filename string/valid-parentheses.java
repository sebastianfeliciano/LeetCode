class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character p : s.toCharArray()){
            if(p == '('){
               stack.push(')'); 
            }
            else if(p == '{'){
               stack.push('}'); 
            }
            else if(p == '['){
               stack.push(']'); 
            }
            else if(stack.isEmpty() || stack.pop() != p){
                return false;
            }
        }
        return stack.isEmpty();
    }
}