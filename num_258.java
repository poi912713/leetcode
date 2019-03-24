//一个数和他各位数之和的模9同余
class Solution {
    public int addDigits(int num) {
        return 1 + ((num - 1) % 9);
    }
}
