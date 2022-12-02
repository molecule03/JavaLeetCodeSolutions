class Solution {
    public String robotWithString(String s) {
        
        
        int freq[] = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        
        Stack<Character> t = new Stack<>();
        // Stack<Character> p = new Stack<>();
        StringBuilder p = new StringBuilder();
        for(char c : s.toCharArray()){
            t.push(c);
            freq[c-'a']--;
            
            while(!t.isEmpty() && t.peek() <= lowest(freq)){
                // p.push(t.pop());
                p.append(t.pop());
            }
        }
        
        while(!t.isEmpty()){
            // p.push(t.pop());
            p.append(t.pop());
        }
        
        return p.toString();
    }
    
    
    private Character lowest(int freq[]){
        
        for(int i=0; i<26; i++){
            if(freq[i] != 0) return (char)('a'+i);
        }
        
        return 'a';
    }
}