class LRUCache {
   private final Map<Integer,Integer> map;
    public LRUCache(int maxEntries) {
        this.map = Collections.synchronizedMap(new LinkedHashMap<Integer, Integer>(maxEntries + 1, 0.75f, true) {
          
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > maxEntries;
            }
        });
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        return map.get(key);
        return -1;
    }
    
    public void put(int key, int value) {
        map.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */