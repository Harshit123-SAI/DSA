class Solution {
    public boolean detectCapitalUse(String word) {
        int n= word.length();
        int up=0;
        for (int i=0;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))){
                up++;
            }
        }
            return up==n||up==0||(up==1&&Character.isUpperCase(word.charAt(0)));
        }
    }
