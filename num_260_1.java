public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int x = 0;
        for(int num:nums){
            x ^= num;
        }
        
        //make partitioner
        x = x & (~(x-1));
        
        for(int num:nums){
            if( (x&num) == 0){
                res[0] ^= num;
            } else{
                res[1] ^= num;
            }
        }
        return res;

    }
}
/*
左移( << )、右移( >> ) 、无符号右移( >>> ) 、位与( & ) 、位或( | )、位非( ~ )、位异或( ^ )，除了位非( ~ )是一元操作符外，其它的都是二元操作符。
*/
