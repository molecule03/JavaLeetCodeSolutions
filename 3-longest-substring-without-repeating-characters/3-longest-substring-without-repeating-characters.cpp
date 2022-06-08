class Solution {
public:
    int lengthOfLongestSubstring(string s) {
       
        int maxSize=0;
        int i=0, j=0;
        
         set<char> st;
        while(j<s.size()){
            if(st.count(s[j]) == 0){
                maxSize = max(maxSize, j-i+1);
                st.insert(s[j++]);
            }
            else{
                st.erase(s[i++]);
            }
        }
        return maxSize;
    }
};