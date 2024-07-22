class Solution {
    public boolean isSubsequence(String s, String t) {
    if (s == null || t == null) return false;
    if (s.length() > t.length()) return false;
        
        int pointer_s = 0;
        int pointer_t = 0;
        
        while (pointer_t < t.length() && pointer_s < s.length()) {
            if (s.charAt(pointer_s) == t.charAt(pointer_t)) {
                pointer_s++;
            }
            pointer_t++;
        }
        
        return pointer_s == s.length();
    }
}