class Solution {
    public boolean validPalindrome(String s) {
        int skip = 1;
        char[] arr = s.toCharArray();
        int start =0;
        int end =arr.length-1;
        while(start < end){
            if(arr[start] != arr[end]) return check(arr,start+1,end) ||  check(arr,start,end-1);
            start++;
            end--;
       }
        return true;
    }
    public boolean check(char[] arr , int start,int end){
        while(start<end){
            if(arr[start] != arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}