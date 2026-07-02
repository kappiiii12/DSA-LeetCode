class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max =weights[0];
        int sum = 0;
        for(int i=0;i<weights.length;i++) {
            max = Math.max(max,weights[i]);
            sum+=weights[i];
         }
        int start = max;
        int end = sum;
        int res = 0;
        while(start <= end){
            
                 int mid = (start+end)/2;
                 if(check(weights,days,mid)){
                    end = mid-1;
                    res = mid;
                 }
                 else start = mid+1;
                          
        }
        return res;
    }
    public boolean check(int[] weights,int days,int k){
        int sum = 0;
        int count =0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum > k){
                count++;
                sum = weights[i];
            }
            
            
            if(count>days) return false;
        }
        return count+1 <= days;
    }
}