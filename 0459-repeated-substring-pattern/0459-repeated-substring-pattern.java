class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String k = s+s;
      
      //  System.out.print(k.substring(1,n));
        return k.substring(1,k.length()-1).contains(s);
    }
}