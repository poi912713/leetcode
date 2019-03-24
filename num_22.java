//backtracking
class Solution {
    int iter = 0;
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        helper(res, "", 0, 0, n);
        return res;
    }
    private void helper(List<String> res, String list, int left, int right, int n){
        if(list.length()==n*2){
            res.add(list);
            return;
        }
        if(left<n){
            helper(res, list+"(", left+1, right,n);
        }
        if(right<left){
            helper(res, list+")", left, right+1,n);
        }
    }
}
