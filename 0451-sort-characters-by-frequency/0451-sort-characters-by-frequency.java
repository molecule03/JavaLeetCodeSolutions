class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
        
        List<Pair<Character, Integer>> list = new ArrayList<>();
        
        for(char c : map.keySet()){
            list.add(new Pair(c, map.get(c)));
        }
        
        
        Collections.sort(list, (a,b)-> b.getValue() == a.getValue() ? a.getKey()-b.getKey() : b.getValue()-a.getValue());
        // System.out.println(list);
        StringBuilder sb = new StringBuilder();
        
        for(Pair<Character, Integer> pair : list){
            char cur = pair.getKey();
            int times = pair.getValue();
            for(int i=0; i<times; i++) sb.append(cur);
        }
        return sb.toString();
    }
}