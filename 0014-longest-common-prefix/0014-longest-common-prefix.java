class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String one = strs[0];
        String two = strs[strs.length-1];
        int n = Math.min(one.length(),two.length());
         
        StringBuilder res = new StringBuilder();

        for(int i = 0;i<n;i++){
            if(one.charAt(i) != two.charAt(i)) break;
            res.append(one.charAt(i));
        }
     return res.toString();
    }
}