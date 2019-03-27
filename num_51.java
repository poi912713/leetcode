class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[n*2-1];
        boolean[] diag2 = new boolean[n*2-1];
        int[] xPos = new int[n];
        helper(0, n, col, diag1, diag2, res, xPos);
        return res;
    }
    private void helper(int y, int n, boolean[] col, boolean[] diag1, boolean[] diag2,
                       List<List<String>> res, int[] xPos){
        if(y == n){
            List<String> tempList = new ArrayList<String>();
            for(int i=0; i<n; i++){
                char[] temp = new char[n];
                for(int j=0; j<n; j++){
                    if(xPos[i]==j){
                        temp[j]='Q';
                    }
                    else
                        temp[j]='.';
                }
                tempList.add(new String(temp));
            }
            res.add(tempList);
            return;
        }

        for(int x=0; x<n; x++){
            if(!col[x] && !diag1[x+y] && !diag2[x+(n-1-y)]){ //if available
                col[x] = true;
                diag1[x+y] = true;
                diag2[x+(n-1-y)] = true;
                xPos[y]=x;
                //put

                helper(y+1, n, col, diag1, diag2, res, xPos);

                col[x] = false;
                diag1[x+y] = false;
                diag2[x+(n-1-y)] = false;
                xPos[y]=0;
                //remove
            }
        }
    }
}
