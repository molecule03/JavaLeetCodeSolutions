class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        
        for(int i=shifts.length-2; i>=0; i--){
            shifts[i] += shifts[i+1]%26;
        }
        
        char arr[] = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            
            int move = shifts[i]%26;
            
            if(arr[i]-'a'+move > 25){
                move = (arr[i]-'a'+move)%26;
                arr[i] = 'a';
            }
            
            arr[i] += move;
        }
        
        return String.valueOf(arr);
    }
}