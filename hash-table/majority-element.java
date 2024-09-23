class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int majorityElement = 0;
        int currentCount = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > currentCount){
                currentCount = entry.getValue();
                majorityElement =  entry.getKey();
            }
        }

        return majorityElement;
    }
}