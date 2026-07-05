class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length ;
        int k = queries.length;
        int[] prefix = new int[n];
        int[] res = new int[k];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++) prefix[i] = arr[i]^prefix[i-1];

        for(int i=0;i<k;i++){
            int l = queries[i][0];
            int r =queries[i][1];
            if(l==0) res[i] = prefix[r];
            else  res[i] = prefix[l-1]^prefix[r];
        }


      return res;  
    }
}