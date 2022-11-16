/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int ans = 0;
        int left = 1;
        int right = n;
        while(left <= right){
            int cur = left+(right-left)/2;
            if(guess(cur) == 0){
                ans = cur;
                break;
            }
            
            if(guess(cur) == -1){
                right = cur-1;
            }
            else{
                left = cur+1;
            }
        }
        
        return ans;
    }
}