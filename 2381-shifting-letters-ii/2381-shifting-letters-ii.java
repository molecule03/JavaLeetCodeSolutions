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
            
            int increase = (ch[i]-'a'+offsets[i])%26;
            
            increase = (increase+26)%26;
            
            ch[i] = (char)(97+(increase%26));
        }
        
        
          // System.out.println(Arrays.toString(offsets));
        
        return String.valueOf(ch);
    }
}