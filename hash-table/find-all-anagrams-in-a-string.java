class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int windowSize = p.length();
        Map<Character, Integer> mapOfWindow = new HashMap<>();
        Map<Character, Integer> mapOfResult = new HashMap<>();

        if (s.length() < p.length()) {
            return result;
        }

        for (char ch : p.toCharArray()) {
            mapOfResult.put(ch, mapOfResult.getOrDefault(ch, 0) + 1);
        }

        // Initialize the sliding window with the first "windowSize" characters of s
        for (int i = 0; i < windowSize; i++) {
            char ch = s.charAt(i);
            mapOfWindow.put(ch, mapOfWindow.getOrDefault(ch, 0) + 1);
        }

        // Check the first window
        if (mapOfWindow.equals(mapOfResult)) {
            result.add(0);
        }

        // Start sliding the window across the string s
        for (int i = windowSize; i < s.length(); i++) {
            // Add the new character (rightPointer)
            char newChar = s.charAt(i);
            mapOfWindow.put(newChar, mapOfWindow.getOrDefault(newChar, 0) + 1);

            // Remove the old character (leftPointer)
            char oldChar = s.charAt(i - windowSize);
            mapOfWindow.put(oldChar, mapOfWindow.get(oldChar) - 1);
            if (mapOfWindow.get(oldChar) == 0) {
                mapOfWindow.remove(oldChar);
            }

            if (mapOfWindow.equals(mapOfResult)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}
