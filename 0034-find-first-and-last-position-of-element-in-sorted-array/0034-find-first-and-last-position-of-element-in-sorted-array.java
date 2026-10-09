class Solution {
    public int[] searchRange(int[] nums, int target) 
    {   int n=nums.length;
        int a[]={-1,-1};
        int start=0;
        int end=n-1;
         
        while(start<=end)
        {
           int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                a[0]=mid;
                end=mid-1;
            }
            else if(nums[mid]<target)
                start=mid+1;
            else  
                end=mid-1;
           
    
        }
         start=0;
         end=n-1;
        while(start<=end)
        {
           int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                a[1]=mid;
                start=mid+1;
            }
            else if(nums[mid]<target)
                start=mid+1;
            else 
                end=mid-1;
          
    
        }
       
        return  a;
    }

}