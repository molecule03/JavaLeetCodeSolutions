class Solution {
    public String largestPalindromic(String num) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        PriorityQueue<Character> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(char c: num.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
            if(!set.contains(c)){
                set.add(c);
                pq.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        char mid = '|';
        while(!pq.isEmpty())
        {
            char ele = pq.remove();
            int freq = map.get(ele);
            if(freq%2==0){
                for(int i = 0; i<freq/2; i++){
                    sb.append(ele);
                }
            }
            else{
                for(int i = 0; i<freq/2; i++){
                    sb.append(ele);
                }
                if(mid =='|')
                mid = ele;
            }
        }
        
        String str = sb.toString();
        if(mid != '|')
            sb.append(mid);
        sb.append(new StringBuilder(str).reverse().toString());
        return removeZero(sb.toString());
        
    }
    
    String removeZero(String str){
        int cur = 0;
        while(cur<str.length() && str.charAt(cur)=='0')
            cur++;
        if(cur == str.length())
            return "0";
        return str.substring(cur, str.length() -cur);
    }
}