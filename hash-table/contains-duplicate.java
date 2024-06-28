class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> d = new HashSet<>();

        for(int number : nums){
            if(d.contains(number)){
                return true;
            }
            d.add(number);
        }
        return false;
    }
}