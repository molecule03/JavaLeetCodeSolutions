class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i =  m-1;
        int j = n-1;
        int k = nums1.length-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        
        while(i >= 0){
            nums1[k--] = nums1[i--];
        }
        
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}


// [1,2,3,0,0,0]  [2,5,6]
//    i           j 

// [1,2,2,3,5,6] 
//    k