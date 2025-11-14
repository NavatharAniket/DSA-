public class SearchInRotatedSortedArray {
    public static void main(String[] args)
    {
        int[] arr={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key=3;

        System.out.println("key found in "+getIndex(arr,key));
    }

    public static int getIndex(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            System.out.println(mid);
            System.out.println(start+" "+end);
            if(arr[start]==target)
            {
                return arr[mid];
            }
            else if()
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
