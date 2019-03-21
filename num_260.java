class Solution {
    public int[] singleNumber(int[] nums) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        for(int element:nums){
            if(res.contains(element))
            {
                res.removeFirstOccurrence(element);
            } 
            else 
            {
                res.add(element);
            }
        }
        //integer list转int[]的方法 使用stream
        int[] res_array = res.stream().mapToInt(i->i).toArray();
        return res_array;
    }
}
