class RandomizedSet {
    public List<Integer> list;
    public RandomizedSet() {
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(list.contains(val)){
            return false;
        }
        else{
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
if(list.stream().filter(s -> {
        return s==val;}).findAny().orElse(null)==null){
    return false;
}
        else{
              list.remove(Integer.valueOf(val));
            return true;
        }
        
    }
    
    public int getRandom() {
         Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */