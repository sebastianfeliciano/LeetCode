class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> f = new HashMap<>();
        for(int i = 0; i <= nums.length; i++){
            int number = nums[i];
            int difference = target - number;
            if(f.containsKey(difference)){
                return new int[] {f.get(difference), i};
            } else {
               f.put(number, i); 
            }
        }
        return new int[]{};

    }
}