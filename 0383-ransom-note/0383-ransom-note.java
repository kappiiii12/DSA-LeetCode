class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> note = new HashMap<>();
        HashMap<Character,Integer> mag = new HashMap<>();
        for(char c : ransomNote.toCharArray()){
            if(!note.containsKey(c)) note.put(c,0);
            note.put(c,note.get(c)+1);
        }
        for(char c : magazine.toCharArray()){
            if(!mag.containsKey(c)) mag.put(c,0);
            mag.put(c,mag.get(c)+1);
        }
        for(Map.Entry<Character,Integer> entry : note.entrySet()){
            char c = entry.getKey();
            int v = entry.getValue();
            if(mag.containsKey(c)){
                if(v > mag.get(c)) return false;
            }
            else return false;
        }
        return true;
    }
}