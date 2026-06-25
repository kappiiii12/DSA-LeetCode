class Solution {
    public String reverseWords(String s) {

        StringBuilder res = new StringBuilder() ;
         s = s.trim();
        char[] arr = s.toCharArray();
    
        int end = arr.length-1;


        while(end>=0){
           
            while(end>=0 && arr[end] == ' ') end--;
            if (end < 0) break;
            
            int wordEnd = end;
            while(end>=0 && arr[end] != ' ') end--;
              
            if(res.length() > 0){
                res.append(" ");
            } 

            res.append(new String(arr,end+1,wordEnd-end))  ;
            
            
            
        }
       
     return res.toString();
    }
}