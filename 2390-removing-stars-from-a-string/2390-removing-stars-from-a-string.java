class Solution {
    public String removeStars(String s) {
        
        
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && c == '*'){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        
        // System.out.println(st);
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}