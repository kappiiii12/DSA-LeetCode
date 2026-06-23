class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

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
          if(match(freqS1,freqS2)) return true;
        }
        return false;
     }
     public boolean match(char[] arr1,char[] arr2){
        for(int i=0;i<26;i++){
            System.out.print("reached here");
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
     }
}