class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
         char[] arr = text.toCharArray();

         for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
         }
        int count = Integer.MAX_VALUE;
         for( Map.Entry<Character,Integer> entry : map.entrySet()){
            char c = entry.getKey();
            if(c == 'l' || c == 'o') count = Math.min(count,entry.getValue()/2);
            else count = Math.min(count,entry.getValue());
         }
         return count;
    }
}