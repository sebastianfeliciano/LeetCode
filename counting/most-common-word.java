class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String newParagraph = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String[] listOfWords = newParagraph.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < listOfWords.length; i++){
            map.put(listOfWords[i], map.getOrDefault(listOfWords[i], 0)+1);
        }

        for(int i = 0; i < banned.length; i++){
            if(map.containsKey(banned[i])){
                map.remove(banned[i]);
            }
        }

        int mostCommonOccurances = 0;
        String word = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > mostCommonOccurances){
                mostCommonOccurances = entry.getValue();
                word = entry.getKey();
            }
        }
        return word;

    }
}