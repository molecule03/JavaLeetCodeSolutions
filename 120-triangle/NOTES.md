else if(idx-1 >= 0){
if(cur.get(idx) < cur.get(idx-1)){
min += cur.get(idx);
// idx = ;
}
else{
min += cur.get(idx-1);
idx -= 1;
}
}
else{
min = cur.get(idx);
// idx = j;
}