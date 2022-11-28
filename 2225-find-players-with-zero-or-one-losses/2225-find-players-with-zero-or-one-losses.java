class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> one = new HashMap<>();
        for(int[] a : matches){
            set.add(a[0]);
            set.add(a[1]);
            one.put(a[1], one.getOrDefault(a[1], 0)+1);
        }
        
       
        // for(int[] a : match)
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i : one.keySet()){
            if(set.contains(i)){
                set.remove(i);
            }
        }
        
        for(int i : set){
            list.add(i);
        }
        Collections.sort(list);
        res.add(list);
        
        list = new ArrayList<>();
        for(int i : one.keySet()){
            if(one.get(i) == 1){
                list.add(i);
            }
        }
        Collections.sort(list);
        res.add(list);
        
        return res;
    }
}