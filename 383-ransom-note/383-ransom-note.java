class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> mag = new HashMap<>();
        Map<Character, Integer> ran = new HashMap<>();
        
        for(char c : ransomNote.toCharArray()) ran.put(c, ran.getOrDefault(c, 0)+1);
        for(char c : magazine.toCharArray()) mag.put(c, mag.getOrDefault(c, 0)+1);
        
        for(char c : ran.keySet()){
            if(!mag.containsKey(c) || ran.get(c) > mag.get(c))
                return false;
        }
        
        return true;
    }
}