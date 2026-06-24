class Solution {
  private  String res = "";
    public String longestPalindrome(String s) {
        int max= -1;
        char[] arr= s.toCharArray();

        for(int i=0;i<arr.length;i++){
            max =Math.max(max,check(arr,i,i,max));
            max = Math.max(max,check(arr,i,i+1,max));
        }
        return res;
    }
    public int check(char[] arr,int start,int end,int max){
        while(start >=0 && end<arr.length && arr[start] == arr[end]){
            
            start--;
            end++;
       
    }
     if(max < end-start-1)
        res = new String(arr,start+1,end-start-1);
        return end-start-1;
    }
}