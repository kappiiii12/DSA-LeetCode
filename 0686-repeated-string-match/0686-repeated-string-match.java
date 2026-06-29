class Solution {
    public int repeatedStringMatch(String a, String b) {
        String t = a;
        int count = 1;
       int n= t.length() ;
        while(t.length() <= b.length()+n && !t.contains(b)){
            t+=a;
            count++;
        }

        if(t.contains(b)) return count;
        else return -1; 
    }
}