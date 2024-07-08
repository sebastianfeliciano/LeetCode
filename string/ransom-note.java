class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomHash = new HashMap<>();
        Map<Character, Integer> magHash = new HashMap<>();
        for (char i : ransomNote.toCharArray()) {
            ransomHash.put(i, ransomHash.getOrDefault(i, 0) + 1);
        }
        for (char i : magazine.toCharArray()) {
            magHash.put(i, magHash.getOrDefault(i, 0) + 1);
        }

        for (char key : ransomHash.keySet()) {
            if (ransomHash.get(key) > magHash.getOrDefault(key, 0)) {
                return false;
            }
        }

        return true;
    }
}