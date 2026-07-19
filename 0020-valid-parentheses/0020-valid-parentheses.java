class Solution {
    public boolean isValid(String s) {
       

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(stack.isEmpty() && check(c)) return false;
          else if (check(c)) { 
                if (!stack.isEmpty() && check(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false; // Mismatch or stack was empty
                }
            }
           else stack.push(c);
        }

        return stack.isEmpty()  ;
    }
     public boolean check(char x,char y){
        if(x == '(' && y == ')') return true;
        if(x == '{' && y == '}') return true;
        if(x == '[' && y == ']') return true;
        else return false;
     }
     public boolean check(char x){
        if(x == ')' || x == '}' || x == ']') return true;
        return false;
     }
}