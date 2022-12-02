class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for(char c : word1.toCharArray()) map1.put(c, map1.getOrDefault(c, 0)+1);
        
        for(char c : word2.toCharArray()) map2.put(c, map2.getOrDefault(c, 0)+1);
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for(int i : map1.values()) list1.add(i);
        
        for(int i : map2.values()) list2.add(i);
        
     
        
        if(list1.size() != list2.size()) {
            System.out.println("23");
            return false;
        }
        System.out.println(list1+" "+list2);
           Collections.sort(list1);
        Collections.sort(list2);
        for(int i=0; i<list1.size(); i++){
            if((int)list1.get(i) != (int)list2.get(i)){
                 System.out.println("29");
                return false;
        }
        }
        
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        
        for(char c : word1.toCharArray()) set1.add(c);
        for(char c : word2.toCharArray()) set2.add(c);
        
        for(char c : word1.toCharArray()){
            if(!set2.contains(c)){
                 System.out.println("42");
                return false;
            }
        }
        for(char c : word2.toCharArray()){
            if(!set1.contains(c)) {
                 System.out.println("48");
                return false;
            }
        }
        
        
        
        return true;
    }
}