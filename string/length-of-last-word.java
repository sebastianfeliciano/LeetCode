class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] array = s.split(" ");

        String lastWord = array[array.length - 1];

        return lastWord.length();

    }
}