import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String word = "";
        int freq = 0;



        String motifiedParagraph = paragraph.toLowerCase().trim().replaceAll("[^a-z]", " ").replaceAll("\\s+", " ");

        String[] listOfWords = motifiedParagraph.split(" ");
        List<String> wordsList = new ArrayList<>(Arrays.asList(listOfWords));

    for(int i = 0; i < banned.length; i++){
        for(int j = 0; j < wordsList.size(); j++){
            if(wordsList.get(j).equals(banned[i])){
                wordsList.remove(j);
                j--;
            }
        }
    }

    Map<String, Integer> map = new HashMap<>();

    for(String name : wordsList){
        map.put(name, map.getOrDefault(name, 0) + 1);
    }

    for(Map.Entry<String, Integer> entry : map.entrySet()){
        if(entry.getValue() > freq){
            freq = entry.getValue();
            word = entry.getKey();
        }
    }



        return word;
    }
}