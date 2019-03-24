class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> resSet = new HashSet<Integer>();
        Set<Integer> numsSet2 = new HashSet<Integer>();
        for(int n2:nums2){
            numsSet2.add(n2);
        }
        for(int n1:nums1){
            if (numsSet2.contains(n1))
                resSet.add(n1);
        }
        int[] res = new int[resSet.size()];
        int i = 0;
        for(Integer num : resSet){
            res[i++] = num;
        }
        return res;
    }
}
