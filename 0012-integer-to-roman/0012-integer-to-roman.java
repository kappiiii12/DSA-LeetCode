class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        map.put(4,"IV");
        map.put(9,"IX");
        map.put(40,"XL");
        map.put(90,"XC");
        map.put(400,"CD");
        map.put(900,"CM");

        map = map.entrySet().stream()
                 .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                 .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (oldValue,newValue) -> oldValue,
                    LinkedHashMap::new
                    ));

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            int k = entry.getKey();
           if(num >= k ){
            int n = num/k;
            for(int i=1;i<=n;i++) res.append(entry.getValue());
            num = num%k;
           }
        }
        return res.toString();
    }
}