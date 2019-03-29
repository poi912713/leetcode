class Solution {
    private int[] nums;
    private Random random;
    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    public int pick(int target) {
        int res = 0;
        List<Integer> index = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target)
                index.add(i);
        }
        res = index.get(random.nextInt(index.size()));
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
