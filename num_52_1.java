class Solution {
    int res = 0;
    public int totalNQueens(int n) {
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[n*2-1];
        boolean[] diag2 = new boolean[n*2-1];
        helper(0, n, col, diag1, diag2);
        return res;
    }
    private void helper(int y, int n, boolean[] col, boolean[] diag1, boolean[] diag2){
        if(y == n){
            res++;
            return;
        }

        for(int x=0; x<n; x++){
            if(!col[x] && !diag1[x+y] && !diag2[x+(n-1-y)]){ //if available
                col[x] = true;
                diag1[x+y] = true;
                diag2[x+(n-1-y)] = true;
                //put
                
                helper(y+1, n, col, diag1, diag2);
                
                col[x] = false;
                diag1[x+y] = false;
                diag2[x+(n-1-y)] = false;
                //remove
            }
        }
    }
}
