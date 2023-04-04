//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String str = br.readLine();
			Solution obj = new Solution();
			System.out.println(obj.minSteps(str));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	int minSteps(String str) {
		//Write your code here
		int ac = 0;
		int bc = 0;
		
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()){
		    if(c == 'a'){
		        sb.append(c);
		    }
		    else if(!sb.toString().isEmpty()){
		        ac++;
		        sb = new StringBuilder();
		    }
		}
		if(!sb.toString().isEmpty() && sb.toString().contains("a")) ac++;
		
		sb = new StringBuilder();
			for(char c : str.toCharArray()){
		    if(c == 'b'){
		        sb.append(c);
		    }
		    else if(!sb.toString().isEmpty()){
		        bc++;
		        sb = new StringBuilder();
		    }
		}
		if(!sb.toString().isEmpty() && sb.toString().contains("b")) bc++;
		
		return Math.min(ac, bc)+1;
	}
}