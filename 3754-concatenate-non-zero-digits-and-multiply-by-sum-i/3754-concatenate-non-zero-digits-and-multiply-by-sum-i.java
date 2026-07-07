class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        String s = new String(String.valueOf(n));
        StringBuilder res = new StringBuilder();
        long sum =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!='0'){
              res.append(c);
              sum+= (c-'0');
            }
        }

        return Integer.parseInt(res.toString()) * sum;
    }
}