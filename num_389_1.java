class Solution {
    public char findTheDifference(String s, String t) {
        char charCode = t.charAt(s.length());
        for (int i = 0; i < s.length(); ++i) {
              charCode -= s.charAt(i);
              charCode += t.charAt(i); 
        }
        return (char)charCode;
        //sum all t and minus s;
    }
}
