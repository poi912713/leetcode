class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int max = 0;
        int[] dp = new int[length];
        //dp[start]=lengthSubstring;
        for1:
        for(int i=0; i<length; i++){
            for(int j=0; j<i; j++){
                if(s.charAt(j)==s.charAt(i)){
                    dp[0]=i;
                    break for1;
                }
            }
        }
        max = dp[0];
        System.out.println(dp[0]);
        for(int i=1; i<length-1; i++){
            int j=i+dp[i-1];//4
            System.out.println(i-1);
            System.out.println(j-1);
            while(j<length && s.charAt(i-1)!=s.charAt(j-1)){
                dp[i]=j;
                j++;
            }
            
            max = j-i>max ? j-i : max;
        }
        return max;
    }
}
