class Solution {
    int[] fac = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};//前几个数的阶乘
    
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i=0; i<fac[n]; i++){
            int[] indexs = cantorReverse(n, i);
            List<Integer> num = new ArrayList<Integer>();
            for(int j=0; j<n; j++){
                num.add(nums[indexs[j]-1]);
            }
            res.add(num);
        }
        return res;
    }
    
    private int[] cantorReverse(int n, int index){
        /*
        康拓展开逆
        n:数字个数
        index:序号
        int[] a:返回的序号
        */
        int[] a = new int[n];
        boolean[] visit = new boolean[n];
        for (int i = 0; i < n; i++)
        {
            int tmp = index / fac[n - i - 1];
            for (int j = 0; j <= tmp; j++)
                if (visit[j])
                    tmp++;
            a[i] = tmp + 1;
            visit[tmp] = true;
            index %= fac[n - i - 1];
        }
        return a;
    }
}
