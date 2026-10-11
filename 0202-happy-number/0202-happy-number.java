class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        
        int sum = 0;
        
        while (n != 1 && n != 4) { // 4 is the start of the unhappy cycle
            sum = 0;
            while (n > 0) {
                int temp = n % 10;
                sum = sum + temp * temp;
                n = n / 10;
            }
            
            if (sum == 1) return true;
            n = sum;
        }
        
        return n == 1;
    }
}