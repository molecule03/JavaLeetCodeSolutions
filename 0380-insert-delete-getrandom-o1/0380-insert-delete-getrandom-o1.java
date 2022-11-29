class RandomizedSet {

    List<Integer> list;
    int idx;
    java.util.Random rand = new java.util.Random();
    public RandomizedSet() {
        list = new ArrayList<>();
        idx = 0;
    }
    
    public boolean insert(int val) {
        if(!list.contains(val)){
            list.add(val);
            idx++;
            return true;
        }
        
        return false;
    }
    
    public boolean remove(int val) {
        if(list.contains(val)){
            list.remove(Integer.valueOf(val));
              idx--;
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        
   return list.get( rand.nextInt(list.size()) );
    }
    
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */