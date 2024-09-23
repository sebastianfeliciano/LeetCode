class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.trim();
        s = s.replaceAll("[^a-z0-9]", "");
        
        if(s == null) return false;
        int a_pointer = 0;
        int b_pointer = s.length() - 1;

        while(a_pointer < b_pointer){
            if(s.charAt(a_pointer) != s.charAt(b_pointer)){
               return false; 
            }
            a_pointer++;
            b_pointer--;
        }
        return true;
    }
}