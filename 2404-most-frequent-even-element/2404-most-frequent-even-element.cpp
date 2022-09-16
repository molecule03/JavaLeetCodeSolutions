class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        
        unordered_map<int,int>mp;
        for(auto it : nums){
            mp[it]++;
        }
        int mx=INT_MAX;
        int mn=0;
        int temp;
        for(auto i: mp){
            if(i.first%2==0 && i.second>=mn){
                if(i.second > mn){
                mn=i.second; //1
                mx=i.first;  //2
                }
                else if(i.second == mn){
                 if(i.first < mx){
                     mx = i.first;
                 }   
                }
            }
        }
        if(mn==0)return -1;
        return mx;
    }
};



// [4,4,4,9,2,4]   4 =4
                // 9 =1
                // 2 =1
//  i
 
 
 
 
 
 
 
 
 
 