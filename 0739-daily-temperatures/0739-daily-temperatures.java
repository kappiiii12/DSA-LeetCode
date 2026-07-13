class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<temp.length;i++){
            if(s.isEmpty()) s.push(i);
            while(!s.isEmpty() && temp[s.peek()] < temp[i]){
                int n = s.pop();
                res[n] = i-n;
            }
            s.push(i);
        }
        return res;
    }
}