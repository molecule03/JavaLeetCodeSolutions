class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        
        int offsets[] = new int[n+1];
        
        for(int a[] : shifts){
            int start = a[0];
            int end = a[1];
            int dir = a[2];
            offsets[start] += (dir == 1) ? 1 : -1;
            offsets[end+1] -= (dir == 1) ? 1 : -1;
        }
        
      
        for(int i=1; i<=n; i++){
            offsets[i] += offsets[i-1]%26; 
        }
        
        char ch[] = s.toCharArray();
        for(int i=0; i<n; i++){
            
            int move = offsets[i]%26;
            
            if(ch[i]-'a'+move > 25){
                move = (ch[i]-'a'+move) % 26;
                ch[i] = 'a';
            }
            else if(ch[i]-'a'+move < 0){
                move = ((ch[i]-'a'+move) % 26)+1;
                ch[i] = 'z';
            }
            
            ch[i] += move;
        }
        
        
        return String.valueOf(ch);
    }
}