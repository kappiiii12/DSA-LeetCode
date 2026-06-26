class Solution {
    public String countAndSay(int n) {
        String current = "1";
        while(--n > 0){
            StringBuilder next = new StringBuilder();

            for(int i=0;i<current.length();i++){
                int count = 1;
                while(i+1 < current.length() && current.charAt(i) == current.charAt(i+1)){
                    count++;
                    i++;
                }

                next.append(count).append(current.charAt(i));
            }
            current = next.toString();
        }
        return current;
    }
}