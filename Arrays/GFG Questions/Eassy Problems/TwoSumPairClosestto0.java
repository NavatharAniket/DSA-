import java.util.Arrays;

public class TwoSumPairClosestto0 {
    public static void main(String[] args) {
        int[] arr = {-21, -67, -37, -18, 4, -65};
        System.out.println("Sum is " + closestToZeroOptimalSolutionTwoPointer(arr, arr.length));
    }

    //Brute Force Method
//Time Complexity O(n2)
    public static int closestToZeroBruteForce(int[] arr, int n) {
        int minSum = arr[0] + arr[1];
        int k = 0;
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(minSum) > Math.abs(sum)) {
                    minSum = sum;
                    k = i;
                    l = j;
                }
            }
        }
        return minSum;
    }

//Optimal Solution using Binary Search
/*
    public static int closestToZeroOptimalSolutionBinarySearch(int[] arr, int n) {
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;

        for (int i = 0; i < arr.length; i++) {

        }
    }
    public static int BinarySearch(int[] arr,int start,int end)
    {

    }

 */

//Optimal Solution using Two Pointer

    public static int closestToZeroOptimalSolutionTwoPointer(int[] arr, int n) {
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;

        int minSum=arr[start]+arr[end];
        while(start<end)
        {
            int sum=arr[start]+arr[end];

            if(sum==0)
            {
                return 0;
            } else if (Math.abs(sum)>Math.abs(minSum)) {
                end--;
                start++;
            }
            else {
                minSum=sum;
                end--;
                start++;
            }
        }

        return minSum;
    }

}
