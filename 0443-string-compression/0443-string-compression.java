class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        int run = 0;

        while(run < chars.length){

            while(run < chars.length && chars[run] == chars[read] ){
                run++;
            }
            if(run-read > 1){
                chars[write] = chars[read];
                write++;
             char[] countChars = String.valueOf(run - read).toCharArray();
                for (char c : countChars) {
                    chars[write] = c;
                    write++;
                }
                read = run;
            }
            else if(run-read == 1){
                 chars[write] = chars[read];
                write++;
                 read = run;
            } 
        }
        return write;
    }
}