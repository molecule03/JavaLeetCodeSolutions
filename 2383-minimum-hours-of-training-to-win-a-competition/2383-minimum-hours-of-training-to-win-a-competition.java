class Solution {
    public int minNumberOfHours(int ie, int ix, int[] energy, int[] experience) {
     
        
        int E = 0;
        int eneReq = 0;
        for(int i : energy){
            eneReq += i;
        }
        if(ie > eneReq){
            E = 0;
        }
        else{
            E = eneReq-ie+1;
        }
        
        
        int X = 0;
        for(int i : experience){
            if(ix > i){
                ix += i;
            }
            else{
                X += (i-ix)+1;
                ix += X+i;
            }
        }
        System.out.println(E+" "+X);
        
       return E+X;
    }
}

// 94 [58,47,100,71,47,6,92,82,35,16,50,15,42,5,2,45,22]


// 70
// [77,83,99,76,75,66,58,84,44,98,70,41,48,7,10,61,28]
    // i



















