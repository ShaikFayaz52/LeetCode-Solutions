class Solution {
    public int addDigits(int num)
     {   if(num==0)
            return 0;
        int sum1=0,sum2=0;
        while(num>0)
        {
            int temp=num%10;
            sum1=sum1+temp;
            num=num/10;
        }
        while(sum1>=10)
        {  sum2=0;
            while(sum1>0)
            {
                int temp2=sum1%10;
                sum2=sum2+temp2;
                sum1=sum1/10;
            }
            sum1=sum2;
        }
        return sum1;
    }
}