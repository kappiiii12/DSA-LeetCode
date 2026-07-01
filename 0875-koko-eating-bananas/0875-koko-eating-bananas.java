class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =piles[0];
        for(int i = 0;i<piles.length;i++) max = Math.max(max,piles[i]);

        int start =1;
        int end = max;
        int res =0;
        while(start<=end){
            int mid = (start+end)/2;
            if(check(piles,mid,h)){
             end = mid-1;   
             res = mid;
            
            }
            else start = mid+1;

        }
        return res;
    }

    public boolean check(int[] piles, int mid,int h){
       int count= 0;
       
      for(int i=0;i<piles.length;i++){
        if(count>h) return false;
        count += piles[i]/mid;

        if(piles[i]%mid!=0) count++;
      }
return count<=h;
    }
}