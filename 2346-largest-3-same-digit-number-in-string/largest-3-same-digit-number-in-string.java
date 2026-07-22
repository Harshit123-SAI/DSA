class Solution {
    public String largestGoodInteger(String num) {
        char ans =0;
       String s ="";
       for ( int i=0;i+2<num.length();i++){
        if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)) {
          if(num.charAt(i)>=ans){
              ans=num.charAt(i);
              s = num.substring(i, i+3);
               
          }
          }
        }
        return s;
       

    }
}