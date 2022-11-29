class RandomizedSet {

    List<Integer> list;
    Random rand;
    Set<Integer> set;
    public RandomizedSet() {
        list = new ArrayList<>();
        rand = new Random();
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            list.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            list.remove(Integer.valueOf(val));
            set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()) );
    }
    

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */