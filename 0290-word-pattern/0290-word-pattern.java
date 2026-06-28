class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;

        HashMap<Character,String> map1 = new HashMap<>();
         HashMap<String,Character> map2 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String t = arr[i];
            if(map1.containsKey(c)){
                if(!map1.get(c).equals(t)) return false;
            }
            map1.put(c,t);
             if(map2.containsKey(t)){
                if(map2.get(t) != c) return false;
            }
            map2.put(t,c);
        }
        return true;
    }
}