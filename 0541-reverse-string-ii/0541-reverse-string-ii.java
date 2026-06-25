class Solution {
    char[] arr;
    public String reverseStr(String s, int k) {
        arr = s.toCharArray();
        int start = 0;
        while(start<arr.length){
            reverse(start,start+k-1);
            start+=2*k;
        }
        return new String(arr,0,arr.length);
    }
    public void reverse(int start,int end){
        if(end > arr.length-1) end = arr.length-1;
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}