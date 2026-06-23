class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();


        //fgerg
         if(s.length() < p.length()) return res;
        char[] arr1 = p.toCharArray();
        char[] arr2 = s.toCharArray();

        char[] freqS1 = new char[26];
        char[] freqS2 = new char[26];
        
        int k = arr1.length;
        for(int i=0;i<k;i++){
            freqS1[ arr1[i] -'a']++;
        }
        for(int i = 0;i<arr2.length;i++){
            if(i<k){
                freqS2[arr2[i]-'a']++;
            }
            else{
                freqS2[arr2[i-k]-'a']--;
                freqS2[arr2[i]-'a']++;
            }
          if(match(freqS1,freqS2)) res.add(i-k+1);
        }
        return res;
     }
     public boolean match(char[] arr1,char[] arr2){
        for(int i=0;i<26;i++){
           // System.out.print("reached here");
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
        //erg
    }
}