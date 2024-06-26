class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] stored = new int[26];

        for(int i = 0; i < s.length(); i++){
            stored[s.charAt(i) - 'a']++;
            stored[t.charAt(i) - 'a']--;
        }

        for(int number : stored){
            if(number != 0) return false;
        }
        return true;
    }
}