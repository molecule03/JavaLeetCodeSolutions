class Solution {
    public boolean halvesAreAlike(String s) {
        
        char arr[] ={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Set<Character> set = new HashSet<>();
        for(char c : arr){
            set.add(c);
        }
        
        
        int left = 0;
        for(int i=0; i<s.length()/2; i++){
            char cur = s.charAt(i);
            if(set.contains(cur)) left++;
        }
        
        int right = 0;
        for(int i=s.length()/2; i<s.length(); i++){
            char cur = s.charAt(i);
            if(set.contains(cur)) right++;
        }
        
        // System.out.println(left+" "+right);
        return left == right ? true : false;
    }
}