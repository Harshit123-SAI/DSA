class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int d = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (d != 0) {
                    sb.append(ch);
                }
                d++;
            } else { 
                d--;
                 if (d != 0) {
                    sb.append(ch);}
               }
        }
        return sb.toString();
    }
}