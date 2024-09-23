class RandomizedSet {
    public List<Integer> list;
    public Random random;
    public Map<Integer, Integer> map;
    public RandomizedSet() {
        list = new ArrayList<>();
        random = new Random();
        map = new HashMap();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        else {
            map.put(val,list.size());
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int index = map.get(val);
            int last_element = list.get(list.size()-1);
            list.set(index, last_element);
            map.put(last_element, index);
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }
        else{
            return false;
        }

    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */