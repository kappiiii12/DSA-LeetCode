class Solution {
    public boolean isPalindrome(String s) {
        s.toLowerCase();
        char[]  arr = s.toCharArray();
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            if(Character.isLetterOrDigit(arr[start]) && Character.isLetterOrDigit(arr[end]) ){
                if(Character.toLowerCase(arr[start]) != Character.toLowerCase(arr[end])) return false;
                start++;
                end--;
            }
            else if( !Character.isLetterOrDigit(arr[start]) ) start++;
            else end--;
        
    }
    return true;
}
}