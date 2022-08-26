class Solution {
    public boolean reorderedPowerOf2(int n) {
        char arr[] = Integer.toString(n).toCharArray();
        Arrays.sort(arr);
        int num = 1;
        for(int i=0; i<31; i++){
            
            char pow[] = Integer.toString(num).toCharArray();
            Arrays.sort(pow);
            if(Arrays.equals(arr, pow))
                return true;
            // System.out.println(Arrays.toString(Integer.toString(num).toCharArray()));
            num *= 2;
        }
        
        return false;
    }
}