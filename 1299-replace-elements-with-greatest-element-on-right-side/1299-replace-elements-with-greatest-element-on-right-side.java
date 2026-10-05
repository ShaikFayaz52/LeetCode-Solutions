class Solution {
    public int[] replaceElements(int[] arr) 
    {
         int lastdigit=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            int temp=arr[i];
            arr[i]=lastdigit;
            if(temp>lastdigit)
            {
                lastdigit=temp;
            }
        }
        return arr;
    }
}