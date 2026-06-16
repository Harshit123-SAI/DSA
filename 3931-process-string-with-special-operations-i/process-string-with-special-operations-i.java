class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        
        for( char x:s.toCharArray()){
            if(Character.isLowerCase(x)){
                res.append(x);
            }
            else if(x=='*'){
                if(res.length()>0){
                res.deleteCharAt(res.length() - 1);
                }
            }
            else if(x=='#'){
                res.append(res.toString());
            }
            else if(x=='%'){
                res.reverse();
            }
        }
        return res.toString();
    }
}