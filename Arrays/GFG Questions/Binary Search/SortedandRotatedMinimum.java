public class SortedandRotatedMinimum {
    public static void main(String[] args)
    {
        int[] arr={1,0};
        System.out.println("min Element is "+getmin(arr));
    }
    public static int getmin(int[] arr)
    {
        int start=0;
        int end=arr.length-1;

        if (arr[start] <= arr[end])
            return arr[start];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid-1]>arr[mid])
            {
                return arr[mid];
            }
            else if(arr[mid]>arr[0])
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
