class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int left = 0;
        int right = 1;
        int total = 0;
        while(right<prices.size()){
            if(prices[right]-prices[left] > 0){
                total += prices[right]-prices[left];
            }
            // total += prices[left]-prices[right];
            left++;
            right++;
        }
        
        return total;
    }
};