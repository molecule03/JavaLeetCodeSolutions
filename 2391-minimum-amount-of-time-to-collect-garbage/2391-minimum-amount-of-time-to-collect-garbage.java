class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        
        List<Integer> m = new ArrayList<>(n);
        List<Integer> p = new ArrayList<>(n);
        List<Integer> g = new ArrayList<>(n);
        
        for(String s : garbage){
            if(s.contains(""+'M'))
                 m.add(1);
            else
                m.add(0);
            
            if(s.contains(""+'P'))
                 p.add(1);
            else
                p.add(0);
            
            if(s.contains(""+'G'))
                 g.add(1);
            else
                g.add(0);
            
            // (s.contains(""+'P')) ? p.add(1) : P.add(0);
            // (s.contains(""+'G')) ? g.add(1) : g.add(0);
        }
        
        int met = m.lastIndexOf(1);
        int pap = p.lastIndexOf(1);
        int gla = g.lastIndexOf(1);
        
        int totalTime = 0;
        
        for(int i=0; i<met; i++) totalTime += travel[i];
        for(int i=0; i<pap; i++) totalTime += travel[i];
        for(int i=0; i<gla; i++) totalTime += travel[i];
        
        for(String s : garbage){
            totalTime += s.length();
        }
        return totalTime;
    }
}