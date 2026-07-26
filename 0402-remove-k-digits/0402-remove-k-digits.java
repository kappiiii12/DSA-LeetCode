class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<num.length();i++){
            while(!stack.isEmpty() && k>0 && stack.peek()-'0' > num.charAt(i)-'0'){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k>=1){
            stack.pop();
            k--;
        }
     StringBuilder res = new StringBuilder();
     while(!stack.isEmpty())  res.append(stack.pop());
      
    res.reverse();
    
    return res.toString().replaceFirst("^0+(?!$)", "");

    }
}