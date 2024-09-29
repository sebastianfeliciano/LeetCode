class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int windowSize = p.length();
        Map<Character, Integer> mapOfWindow = new HashMap<>();
        Map<Character, Integer> mapOfResult = new HashMap<>();


        char[] list = p.toCharArray();
        char[] listOfGiven = s.toCharArray();


        for(int i = 0; i < list.length; i++){
            mapOfResult.put(list[i], mapOfResult.getOrDefault(list[i], 0) + 1);
        }


        for(Map.Entry<Character, Integer> entry : mapOfResult.entrySet()){
            System.out.println(entry.getKey() + ";" +entry.getValue());
        }

        int leftPointer = 0;
        int rightPointer = windowSize;

        while(leftPointer < rightPointer && rightPointer <= s.length()){
            System.out.println("Window From : " +leftPointer+ " to " + rightPointer);

            for(int i = leftPointer; i <= rightPointer - 1; i++){
                mapOfWindow.put(listOfGiven[i], mapOfWindow.getOrDefault(listOfGiven[i], 0) + 1);
            }

            if(mapOfResult.equals(mapOfWindow)){
                result.add(leftPointer);
            }

            mapOfWindow.clear();

            leftPointer++;
            rightPointer++;
        }


        return result;
    }
}