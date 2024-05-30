class Solution {
    public boolean containsDuplicate(int[] nums) {

    HashSet<Integer> k = new HashSet<>();
    
    for(int number : nums){
        if(k.contains(number)){
            return true;
        }
        k.add(number);
    }
    return false;
    }
}