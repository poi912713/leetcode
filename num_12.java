class Solution {
    public String intToRoman(int num) {
        String res = new String();
        int tho = num/1000;
        int han = num/100 - tho*10;
        int ten = num/10 - tho*100 - han*10;
        int one = num%10;
        if(tho != 0){
            for(int i=0; i<tho; i++){
                res+='M';
            }
        }
        if(han != 0){
            if(han == 9){
                res+="CM";
            }
            else if(han>=5){
                res+="D";
                han-=5;
                while(han>0){
                    res+='C';
                    han--;
                }  
            }
            else if(han == 4){
                res+="CD";
            }
            else if(han<4){
                while(han>0){
                    res+='C';
                    han--;
                }
            }        
        }
        
        if(ten != 0){
            if(ten == 9){
                res+="XC";
            }
            else if(ten>=5){
                res+="L";
                ten-=5;
                while(ten>0){
                    res+='X';
                    ten--;
                }  
            }
            else if(ten == 4){
                res+="XL";
            }
            else if(ten<4){
                while(ten>0){
                    res+='X';
                    ten--;
                }
            }        
        }
        if(one != 0){
            if(one == 9){
                res+="IX";
            }
            else if(one>=5){
                res+="V";
                one-=5;
                while(one>0){
                    res+='I';
                    one--;
                }  
            }
            else if(one == 4){
                res+="IV";
            }
            else if(one<4){
                while(one>0){
                    res+='I';
                    one--;
                }
            }        
        }
        return res;
    }
}
