class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1; 
        int[] res = new int[nums.length];
        int countZero = 0;
        int posZero = 0;
        for (int i=0; i<nums.length;i++) {
            if(nums[i]==0){
                countZero++;
                if(countZero>1){
                    return res;
                }
                else if (countZero == 1){
                    posZero = i;
                    continue;
                }
            }
            mul*=nums[i];

        }
        if(countZero == 1){
            res[posZero]=mul;
        }
        else {
            for (int i=0; i<nums.length;i++){
                res[i]=mul/nums[i];
            }
        }
        
        return res;
    }
}
