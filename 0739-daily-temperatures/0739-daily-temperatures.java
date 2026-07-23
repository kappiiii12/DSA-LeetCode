class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[stack.peek()] < temp[i]){
                res[stack.peek()] = i-stack.peek();
                stack.pop();
            }
            stack.push(i); 
        }
        while(!stack.isEmpty()){
            res[stack.peek()] = 0;
            stack.pop();
        }
        return res;
    }
}