class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray(); 
        char[] tChar = t.toCharArray(); 
        Arrays.sort(sChar); 
        Arrays.sort(tChar); 
        s = new String(sChar);
        t = new String(tChar);
        return s.contentEquals(t); 
    }
}
