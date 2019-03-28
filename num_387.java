class Solution {
    public int firstUniqChar(String s) {
        int res = -1;
        int[] alphabet = new int[26]; 
        for(int i=0; i<s.length(); i++){
            alphabet[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(alphabet[s.charAt(i)-'a']==1){
                res=i;
                return res;
            }
        }
        return res;
    }
}
