class Solution {
    public boolean isValid(String s) {
        Stack<Character> d = new Stack<>();
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '('){
                d.push(')');
            }
            else if(s.charAt(i) == '['){
                d.push(']');
            }
            else if(s.charAt(i) == '{'){
                d.push('}');
            }
            else if(d.isEmpty() || d.pop() != s.charAt(i)) return false;
        }
        return d.isEmpty();

    }
}