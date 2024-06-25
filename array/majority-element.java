import java.util.Map.Entry;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap();
        for(int number : nums){
            if(hashmap.containsKey(number)){
                hashmap.put(number, hashmap.get(number) + 1);
            }
            else {
                hashmap.put(number, 1);
            }
        }
        int highestCount = 0;
        int numberPlaceHolder = -1;
        for (Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() > highestCount) {
                highestCount = entry.getValue();
                numberPlaceHolder = entry.getKey();
            }
        }
        return numberPlaceHolder;


    }
}