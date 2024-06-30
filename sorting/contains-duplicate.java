class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numberSet  = new HashSet<>();
        for(int num : nums){
            if(numberSet.contains(num)){
                return true;
            }
            numberSet.add(num);
        }
        return false;
    }
}