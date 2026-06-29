class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int n = s.length();
        int[] grp1 = new int[26];

        for(int i=0;i<n;i++){
          int temp = (int)( s.charAt(i)-'a');
          int temp2 = (int)( t.charAt(i)-'a');
        
        grp1[temp]++;
        grp1[temp2]--;
        }
      for(int i=0;i<26;i++){
         if(grp1[i] <0)
         return false;
      } 
      return true; 
    }
}