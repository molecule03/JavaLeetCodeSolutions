//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] A = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			System.out.println(ob.equalSum(A, N));
		}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int equalSum(int [] A, int N) {
		//Write your code here
		
		int left[] = new int[N];
		int right[] = new int[N];
		
		left[0] = A[0];
		for(int i=1; i<N; i++){
		    left[i] = A[i]+left[i-1];
		}
		
		right[N-1] = A[N-1];
		for(int i=N-2; i>=0; i--){
		    right[i] = A[i]+right[i+1];
		}
		
		int idx = -1;
		for(int i=0; i<N; i++){
		    if(left[i] == right[i]) return i+1;
		}
		
		return idx;
		
	}
}