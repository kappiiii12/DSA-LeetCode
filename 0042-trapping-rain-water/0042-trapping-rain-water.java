class Solution {
    public int trap(int[] height) {
        int n = height.length;
       int[] leftMax = new int[n];
       int[] rMax = new int[n];
        int maxL = Integer.MIN_VALUE;
         int maxR = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
          maxL = Math.max(maxL,height[i]);
          leftMax[i] = maxL;
       //   System.out.print(maxL+"L ");
          maxR = Math.max(maxR,height[n-1-i]);
          rMax[n-1-i] = maxR;
        //  System.out.print(maxR+"R ");
        }
    int count =0;
     for(int i=0;i<n;i++){
          count += Math.min(leftMax[i],rMax[i]) - height[i];
        }

return count;
    }
}