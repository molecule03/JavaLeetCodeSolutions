//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String str = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.buildLowestNumber(str,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String buildLowestNumber(String str, int N) {
        // code here
        Stack<Character> st = new Stack<>();
        
        int i; 
        for(i=0; i<str.length(); i++){
            char c = str.charAt(i);
            while(!st.empty() && (st.peek()-'0')>(c-'0')){
                st.pop();
                N--;
                if(N <= 0) break;
            }
            // if(N<=)
            
            st.push(c);
            if(N == 0) break;
        }
        
        for(int j=i+1; j<str.length(); j++){
            st.push(str.charAt(j));
        }
        
        while(N > 0){
            st.pop();
            N--;
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        
        
        while(true){
            if(sb.length() > 0 && sb.charAt(0) == '0'){
                sb.deleteCharAt(0);
            }
            else{
                break;
            }
        }
        // return res;
        if(sb.length() == 0) return "0";
        return sb.toString();
    }
}