class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        HashMap<Character,Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()){
            if(!map.containsKey(c)) map.put(c,0);
            map.put(c,map.get(c)+1);
        }
        int count =0;
        for(Map.Entry entry : map.entrySet()){
            if((int)entry.getValue()%2 !=0) count++;
        }
         return count==0?s.length():s.length()-count+1;
    }
}