class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        int min = Integer.MAX_VALUE;
        
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        char[] freqS = new char[52];
        char[] freqT= new char[52];

        for(int i=0;i<arrT.length;i++){
            char c = arrT[i];
           if(Character.isUpperCase(c)) freqT[c-'A'+26]++;
           else freqT[c-'a']++;
        }
        int start =0;
        int bestStart = 0;
        int end = arrS.length;
        for(int i=0;i<arrS.length;i++){
            char c = arrS[i];
            
                 if(Character.isUpperCase(c)) freqS[c-'A'+26]++;
                 else freqS[c-'a']++;
            
            
                while(match(freqT,freqS)){
                      if(min > i-start+1 ){
                        min = i-start+1 ;
                        end = i;
                        bestStart = start;
                      }
                       if(Character.isUpperCase(arrS[start])) freqS[arrS[start]-'A'+26]--;
                       else freqS[arrS[start]-'a']--;
                      start++;
                }
                
           
        }
        return min == Integer.MAX_VALUE ? "" : new String(arrS,bestStart,end-bestStart+1);
    }
    public boolean match(char[] freqT,char[] freqS){
       // System.out.println("hii");
           for( int i=0;i<52;i++){
            if(freqT[i] > freqS[i])
            return false;
           }
           return true;
    }
}