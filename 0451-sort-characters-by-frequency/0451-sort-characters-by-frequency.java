class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)) map.put(c,0);
            map.put(c,map.get(c)+1);
        }

        map = map.entrySet().stream()
                 .sorted(Map.Entry.<Character,Integer>comparingByValue().reversed())
                 .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (e1,e2) -> e1,
                    LinkedHashMap::new
                 ));

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            for(int i=0;i<entry.getValue();i++) res.append(entry.getKey());
        }
        return res.toString();
    }
}