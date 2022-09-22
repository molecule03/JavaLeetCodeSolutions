class Solution {
    public String reverseWords(String s) {
        
        String[] arr = s.split(" ");
        
        StringBuilder res = new StringBuilder();
        
        for(String cur : arr){
            StringBuilder sb = new StringBuilder(cur);
            
            res.append(sb.reverse().toString());
            res.append(" ");
        }
        
        return res.toString().trim();
    }
}