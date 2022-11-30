//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int presum = 0;
        int maxLen = 0;
        for(int i =0; i<n; i++){
            presum += arr[i];
            
            if(map.containsKey(presum)){
                maxLen = Math.max(maxLen, i-map.get(presum));
            }
            else{
                map.put(presum, i);
            }
        }
        
        return maxLen;
    }
}