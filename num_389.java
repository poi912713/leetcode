class Solution {
    public char findTheDifference(String s, String t) {
        char res = '\u0000'; 
        LinkedList<Character> tList = new LinkedList<Character>();
        for(int i=0;i<t.length();i++){
            tList.add(t.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            tList.removeFirstOccurrence(s.charAt(i));
        }
        res = tList.getFirst();
        return res;
    }
}
