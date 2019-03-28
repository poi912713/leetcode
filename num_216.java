class Solution {
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(k, n, 0, 0, 1, res, new ArrayList<Integer>());
        return res;
    }
    private void helper(int k, int n, int num, int sum, int start, List<List<Integer>> res, List<Integer> tempList){
        
        if(num == k){
            if(sum == n){
                res.add(new ArrayList<Integer>(tempList));
            }
            return;
        }
        for(int i=start; i<=9; i++){
            tempList.add(i);
            helper(k, n, num+1, sum+i, i+1, res, tempList);
            tempList.remove(num);
        }     
    }
}
