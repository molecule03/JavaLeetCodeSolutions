class Solution {
    public int minNumberOfHours(int ie, int ix, int[] energy, int[] experience) {
     
        
        int ene = 0;
        int eneReq = 0;
        for(int i : energy){
            eneReq += i;
        }
        if(ie > eneReq){
            ene = 0;
        }
        else{
            ene = eneReq-ie+1;
        }
        
        
        int exp = 0;
        for(int i : experience){
            if(ix > i){
                ix += i;
            }
            else{
                // System.out.println(i+" "+X);
                int x = i+1;
                exp += (x-ix);
                ix += exp+i;
            }
        }
        // System.out.println(E+" "+X);
        
       return ene+exp;
    }
}

// 1 [1,1,1,1]  = 4


// 1
// [1,1,1,50]  =
        

















