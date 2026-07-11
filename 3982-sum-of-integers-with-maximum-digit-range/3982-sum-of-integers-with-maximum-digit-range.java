class Solution {
    public int maxDigitRange(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            max = Math.max(max,digitRange(i));
        }
        int sum = 0;
        for(int i : nums){
            if(digitRange(i) == max) sum += i;
        }
        return sum;
    }

    public int digitRange(int n){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(n>0){
            max = Math.max(max,n%10);
            min = Math.min(min,n%10);
            n = n/10;
        }
        return max-min;
    }
}