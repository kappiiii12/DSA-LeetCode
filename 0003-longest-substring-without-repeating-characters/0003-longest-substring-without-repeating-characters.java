class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        int start = 0;
        HashMap<Character,Integer> set = new HashMap<>();
        for(int i = 0 ;i<s.length();i++ ){
            char c = s.charAt(i);
             if(set.containsKey(c)){
               
                start = Math.max(start,set.get(c)+1) ;
            
             }
             
              set.put(c,i);
              max = Math.max(max,i-start+1);
        }
        return max;
    }
}