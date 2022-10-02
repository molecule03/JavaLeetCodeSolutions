class Solution {
      static int[] BitsSetTable256 = new int[256];
    public int minimizeXor(int num1, int num2) {
        
        String b = Integer.toBinaryString(num2);
        int count = 0;
        for(char c : b.toCharArray()){
            if(c == '1') count++;
        }
        // int b = countSetBits(num2);
        
        List<Character> list = new ArrayList<>();
        // for()
        String a = Integer.toBinaryString(num1);
        // System.out.println(a+" "+b);
        int n = a.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(i=0; i<n && count > 0; i++){
            if(a.charAt(i) == '1') count--;
            sb.append(a.charAt(i));
            // list.add(a.charAt(i));
        }
        
        while(i <n){
            sb.append('0');
            i++;
        }
        
        if(count > 0){
            for(int j =sb.length()-1; j>=0 && count > 0; j--){
                if(sb.charAt(j) == '0'){
                    sb.replace(j, j+1, "1");
                    count--;
                }
            }
        }
      
        while(count > 0){
            sb.append('1');
            count--;
        }
          System.out.println(a+" "+b+" "+sb.toString());
        int ans = integerfrmbinary(sb.toString());
        return ans;
    }
    
    public static int integerfrmbinary(String str){
    double j=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)== '1'){
         j=j+ Math.pow(2,str.length()-1-i);
     }

    }
    return (int) j;
}
    public static int getDecimal(int binary){  
    int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      } else {  
          int temp = binary%10;  
          decimal += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    return decimal;  
}  
    
     public static int countSetBits(int n)
    {
        return (BitsSetTable256[n & 0xff]
                + BitsSetTable256[(n >> 8) & 0xff]
                + BitsSetTable256[(n >> 16) & 0xff]
                + BitsSetTable256[n >> 24]);
    }
    
}