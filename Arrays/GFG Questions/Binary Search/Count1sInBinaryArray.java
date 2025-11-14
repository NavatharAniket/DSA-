public class Count1sInBinaryArray
{
    public static void main(String[] args)
    {
        int[] arr={1,1,1,1,1,0,0,0};
        System.out.println("1 count is "+findLength(arr));
    }

    public static int findLength(int[] arr)
    {
        int n=arr.length-1;
        if(arr[n]==1)
        {
            return arr.length;
        }

        int start=0;
        int end=n;

        while(start<=end)
        {
            int mid=start + (end - start) / 2;
            System.out.println(mid);
            if(arr[mid]==1 && arr[mid+1]==0)
            {
                return mid+1;
            }
            else if(arr[mid+1]==1)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}
