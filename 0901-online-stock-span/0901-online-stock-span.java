class StockSpanner {
    
     ArrayList<Integer> arr ;
    public StockSpanner() {
       arr = new ArrayList<>();
    }
    
    public int next(int price) {
       
        arr.add(price);
        int n = arr.size();
        int i = n-1;
        while(i>=0 && arr.get(i)<=price){
            i--;
        }
        return n-i-1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */