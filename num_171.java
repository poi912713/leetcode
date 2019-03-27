class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        if(s.length()==0 || s == null)
            return 0;
        for(int i=0; i<s.length(); i++)
        {
            res += (s.charAt(i)-'A'+1)*Math.pow(26,s.length()-i-1);
        }
        return res;
    }
}
