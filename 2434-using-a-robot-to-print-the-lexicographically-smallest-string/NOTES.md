// int small = 0;
// int min = Int;
// int low = (int)'z'+1;
// for(char c : s.toCharArray()){
//     low = Math.min(c, low);
// }
int idx = 0;
for(int i=0; i<s.length(); i++){
if(s.charAt(i) == 'a'){
idx = i;
}
}
// System.out.println((char)low+" "+idx);
StringBuilder t = new StringBuilder();
for(int i=0; i<=idx; i++){
t.append(s.charAt(i));
}
t.reverse();
for(int i=idx+1; i<s.length(); i++){
t.append(s.charAt(i));
}
return t.toString();