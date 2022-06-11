class Solution {
    public String removeDigit(String number, char digit) {
        
        char[] numChar = number.toCharArray();
        
        int index = -1;
        for(int i=0; i<number.length(); i++){
            if(numChar[i] - digit == 0){
                index = i;
                if(i < number.length()-1 && numChar[i] < numChar[i+1])
                    break;
            }
        }
        
        return number.substring(0,index)+number.substring(index+1,number.length());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         boolean flag = false;
//         for(char c : number.toCharArray()){
//             // System.out.println(c-'0'+" "+ Integer.parseInt(""+digit));
//             if(c-'0' >  Integer.parseInt(""+digit))
//                 flag = true;
//         }
        
//         StringBuilder sb = new StringBuilder();
//         int count = 1;
//         if(flag){
//            for(int i=0; i<number.length(); i++){
//                 if(count == 1 && number.charAt(i) == digit){
//                     count--;
//                     continue;
//                 }
//                 sb.append(number.charAt(i));
//             }
//             return sb.toString();
            
//         }
//         else{
//                 for(int i=number.length()-1; i>=0; i--){
//                 if(count == 1 && number.charAt(i) == digit){
//                     count--;
//                     continue;
//                 }
//                 sb.append(number.charAt(i));
//             }
//             return sb.reverse().toString();
//         }
    }
}