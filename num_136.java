class Solution {
    public int singleNumber(int[] nums) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        for(int element:nums){
            System.out.println(element);
            if(res.contains(element))
            {
                res.removeFirstOccurrence(element);
            } 
            else 
            {
                res.add(element);
            }
        }
        return res.get(0);
    }
}
