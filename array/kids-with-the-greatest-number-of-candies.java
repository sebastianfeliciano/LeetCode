class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestNumber = 0;
        List<Boolean> k = new ArrayList<>();
        for(int number : candies){
            if(number > highestNumber) highestNumber = number;
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= highestNumber){
                k.add(true);
            } else{
                k.add(false);
            }
        }
        return k;


    }
}