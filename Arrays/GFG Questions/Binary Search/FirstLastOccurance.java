import java.util.ArrayList;
import java.util.*;
public class FirstLastOccurance {
    public static void main(String[] args)
    {
        int[] arr={1, 2, 3};
        int target=7;
        System.out.println("First last Occurance is "+findFirstLast(arr,target));
    }

    public static ArrayList findFirstLast(int[] arr,int target)
    {
        int first=firstOccurance(arr,target);
        int last=lastOccurance(arr,target);
        ArrayList<Integer>al=new ArrayList<>();
        al.add(first);
        al.add(last);
        return al;
    }

    public static int firstOccurance(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        if(arr[start]==target)
        {
            return start;
        }
        while(start<=end)
        {
            int mid=end-(end-start)/2;

            if (arr[mid]==target && arr[mid-1]<target)
            {
                return mid;
            }
            else if(arr[mid]<target)
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

    public static int lastOccurance(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        if(arr[end]==target)
        {
            return end;
        }

        while(start<=end)
        {
            int mid=end-(end-start)/2;

            if (arr[mid]==target && arr[mid+1]>target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
