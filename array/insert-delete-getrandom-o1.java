class RandomizedSet {
    Set<Integer> k;
    public RandomizedSet() {
        k = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(k.contains(val)){
            return false;
        } else {
            k.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(k.contains(val)){
            k.remove(val);
            return true;
        } else {
            return false;
        }
    }
    
    public int getRandom() {
        Random rand = new Random();
        List<Integer> listOfNumbers = new ArrayList<>();
        for(int number : k){
            listOfNumbers.add(number);
        }
        //givenList.get(rand.nextInt(givenList.size()));
        return listOfNumbers.get(rand.nextInt(listOfNumbers.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */