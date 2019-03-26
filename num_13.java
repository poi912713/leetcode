class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            System.out.println(c);
            switch(c){
                case 'I':
                    res+=1;
                    if(i<s.length()-1 && s.charAt(i+1)=='V')
                    {
                        res+=3;
                        i++;
                    }
                    if(i<s.length()-1 && s.charAt(i+1)=='X')
                    {
                        res+=8;
                        i++;
                    }
                    break;
                case 'V':
                    res+=5;
                    break;
                case 'X':
                    res+=10;
                    if(i<s.length()-1 && s.charAt(i+1)=='L')
                    {
                        res+=30;
                        i++;
                    }
                    if(i<s.length()-1 && s.charAt(i+1)=='C')
                    {
                        res+=80;
                        i++;
                    }
                    break;
                case 'L':
                    res+=50;
                    break;
                case 'C':
                    res+=100;
                    if(i<s.length()-1 && s.charAt(i+1)=='D')
                    {
                        res+=300;
                        i++;
                    }
                    if(i<s.length()-1 && s.charAt(i+1)=='M')
                    {
                        res+=800;
                        i++;
                    }
                    break;
                case 'D':
                    res+=500;
                    break;
                case 'M':
                    res+=1000;
                    break;
            }
        }
        return res;
    }
}
