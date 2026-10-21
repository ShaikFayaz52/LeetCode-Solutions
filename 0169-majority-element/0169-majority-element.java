class Solution {
    public int majorityElement(int[] nums) 
    {
        int c=0;
        int me=0;
        for(int i=0;i<nums.length;i++)
        {   

            if(c==0)
            {
                me=nums[i];
                c++;
            }
                
            else if(me==nums[i])
                c++;
            else
                c--;
        }
        return me;
    }
}