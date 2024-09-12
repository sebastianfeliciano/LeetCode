class TimeMap {

    HashMap<String, List<Pair<String, Integer>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
            map.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair<String, Integer>> myList = map.get(key);
        int idx = binarySearch(myList, timestamp);
        if(idx == -1) return "";
        return map.get(key).get(idx).getKey();
    }

    private int binarySearch(List<Pair<String, Integer>> myList, int timestamp)
    {
        int left = 0, right = myList.size() - 1;
        int idx = -1;
        
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            int time = myList.get(mid).getValue();
            if(time == timestamp)   return mid;
            
            // if all time in myList greater than timestamp, return -1 eventually.
            if(time > timestamp)
                right = mid - 1;
            else
            {
                left = mid + 1;
                idx = mid;
            }
        }
        return idx;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */