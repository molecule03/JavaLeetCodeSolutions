//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    
    
    public static int solve(int n, int k, int[] stalls) {
        
        Arrays.sort(stalls);
        
        int left = 1;
        int right = stalls[n-1]-stalls[0];
        
        int res = 0;
        while(left <= right){
            
            int mid = left+(right-left)/2;
            
            if(canPlaceCows(n, k, stalls, mid)){
                res = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return res;
    }
    
    private static boolean canPlaceCows(int n, int cows, int[] stalls, int min){
        
        int cor = stalls[0];
        int cur = 1;
        
        for(int i=1; i<n; i++){
            if(stalls[i]-cor >= min){
                cor = stalls[i];
                cur++;
            }
            
            if(cur == cows) return true;
        }
        
        return false;
    } 
    
    
    
}