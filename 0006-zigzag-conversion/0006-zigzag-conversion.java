class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<rows.length;i++) rows[i] = new StringBuilder();

        boolean goingDown = false ;
        int currRow = 0;
        for(char c: s.toCharArray()){
            rows[currRow].append(c);

            if(currRow ==0 || currRow == numRows-1) goingDown = !goingDown ;

            currRow += goingDown ? 1 : -1;
        }
        StringBuilder res  = new StringBuilder();
        for(StringBuilder string : rows) res.append(string);
        return res.toString();
    }
}