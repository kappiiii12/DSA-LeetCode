class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum = 0;
        int n = cardPoints.length;
        int sum = 0;

        for(int i=0;i<n-k;i++) sum += cardPoints[i];
        totalSum = sum;
        int min = sum;
        for(int i=n-k;i<n;i++ ){
             sum =sum+ cardPoints[i]-cardPoints[i-n+k];
             totalSum+= cardPoints[i];
             min = Math.min(sum,min);
        }
        return totalSum-min;
    }
}