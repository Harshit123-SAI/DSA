class Solution {
    public boolean digitCount(String num) {
     HashMap<Character, Integer> c = new HashMap<>();
        for(char x:num.toCharArray()){
            c.put(x, c.getOrDefault(x,0)+1);
        }
        for (int i = 0; i < num.length(); i++) {
        int e = num.charAt(i) - '0';
            int a = c.getOrDefault((char)('0' + i), 0);
            if (e!= a) {
                return false;
            }
        }
        
        return true;
    }
}