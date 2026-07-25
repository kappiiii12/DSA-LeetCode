class Solution {
    public int maxProduct(int k) {
       char[] arr  =  String.valueOf(k).toCharArray();
        Arrays.sort(arr);
       String s = new String(arr);
       
        int n = s.length();
        return (s.charAt(n-1) - '0')*(s.charAt(n-2) - '0');
    }
}