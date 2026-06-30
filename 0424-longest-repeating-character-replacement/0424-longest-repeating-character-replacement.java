class Solution {
    public int characterReplacement(String s, int l) {
        int res = 0;
        int[] arr = new int[26];
        int maxLen = 0;
        int start =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            arr[c-'A']++;
            maxLen = Math.max(maxLen,arr[c-'A']);
            while(i-start+1-maxLen > l ){
                char k = s.charAt(start);
                arr[k-'A']--;
                start++;
            }
            
            res = Math.max(res,i-start+1);
        }
        return res;
    }
}