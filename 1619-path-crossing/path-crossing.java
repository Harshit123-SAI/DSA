class Solution {
    public boolean isPathCrossing(String path) {
       HashSet<String> st = new HashSet<>();
       int x =0;
       int y=0;
       st.add("0,0");
       for(char ch: path.toCharArray()){
         if(ch == 'N') y++;
         else if(ch == 'S') y--;
         else if(ch == 'E') x++;
         else x--;
       
       String t = x +","+y;
       if(st.contains(t)){
        return true;
       }
        st.add(t);
       }
       return false;
    }
}