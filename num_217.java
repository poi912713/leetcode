class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<Integer>();
        boolean res = false;
        for(int num:nums){
            if(!numSet.add(num)){
                res = true;
                break;
            }
        }
        return res;
    }
}
