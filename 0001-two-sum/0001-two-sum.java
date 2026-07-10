class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int temp = target-arr[i];
            if(map.containsKey(temp)){
               res[0] = map.get(temp);
               res[1] = i;
               return res;
            }
            else
            map.put(arr[i],i);
        }
        return res;
    }
}