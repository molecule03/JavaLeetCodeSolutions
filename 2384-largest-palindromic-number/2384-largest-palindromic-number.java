class Solution {
    public String largestPalindromic(String num) {
        
        
        HashMap<Character, Integer> map = new HashMap<>();
        TreeSet<Character> set = new TreeSet<>((a,b)->b-a);

        
        for(char c : num.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
            set.add(c);
        }
        
        if(set.size() == 1 && set.contains('0')) return ""+0;
        
        StringBuilder sb = new StringBuilder();
        char mid = 'l';
        while(!set.isEmpty()){
            char c = set.pollFirst();
            int freq = map.get(c);
            
            if(freq%2 == 0 || mid != 'l'){
                for(int i=0; i<freq/2; i++){
                    sb.append(c);
                }
            }
            else {
                for(int i=0; i<freq/2; i++){
                    sb.append(c);
                }
                if(mid == 'l'){
                    mid = c;
                }
            }
        }
        
        
        
        String start = sb.toString();
        start = removeLeadingZeros(start);
        sb = new StringBuilder(start);
        String last = sb.reverse().toString();
        String middle = (mid != 'l') ? ""+mid : "";
        
        String pal = start+middle+last;
        
        return pal;
    }
    
    private String removeLeadingZeros(String start){
        if(start.length() == 0) return "";
        
        int i = 0;
        for(i = 0; i<start.length(); i++){
            if(start.charAt(i) != '0'){
                break;
            }
        }
        
        return start.substring(i);
    }
}