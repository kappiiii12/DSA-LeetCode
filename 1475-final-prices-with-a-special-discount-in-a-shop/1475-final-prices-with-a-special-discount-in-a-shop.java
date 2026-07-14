class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s = new Stack<>();
        int n = prices.length ; 

        for(int i=0 ; i<prices.length ; i++){
            while(!s.isEmpty() && prices[s.peek()] >= prices[i]){
                int k = s.pop();
                prices[k] -= prices[i];
            }

            s.push(i);
        }
        return prices;
    }
}