class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String temp = new String(charArray);

            if(!map.containsKey(temp))
            map.put(temp,new ArrayList<String>());

            
            map.get(temp).add(str);
            

        }
       

       return new ArrayList<>(map.values());
    }
}