class Solution
 {
    public int maxDepth(String s) 
    { 
        int count=0;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char chr=s.charAt(i);
             if(chr=='(')
             {
                count++;
                sum=Math.max(sum,count);
                
             }
             else if(chr==')')
             {
                count--;
             }
        }
        return sum;
    }
}