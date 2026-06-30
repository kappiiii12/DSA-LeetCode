class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        int n = word.length();

        for(int i=0;i<n;i++){
            char c = word.charAt(i);
            if(Character.isUpperCase(c)) count++;
        }

        if(count == n ||( count ==1 && (Character.isUpperCase(word.charAt(0)))) || count ==0) return true;
        return false;
    }
}