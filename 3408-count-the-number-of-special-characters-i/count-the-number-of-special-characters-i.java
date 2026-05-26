class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for(char ch = 'a'; ch <= 'z'; ch++) {
            boolean lowerCase = false;
            boolean upperCase = false;
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == ch)
                    lowerCase = true;
                if(word.charAt(i) == Character.toUpperCase(ch))
                    upperCase = true;
            }
            if(lowerCase && upperCase)
                count++;
        }
        return count;
    }
}