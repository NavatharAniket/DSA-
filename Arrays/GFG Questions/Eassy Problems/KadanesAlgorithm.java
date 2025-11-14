public class KadanesAlgorithm {
    public static void main(String[] args)
    {
        int[] arr={5, 4, 1, 7, 8};
        System.out.println("max Sum is "+maxSubArraysSumUsingKadanes(arr));
    }
//BruteForce
//Time Complexity O(n2)
    public static int maxSubarraySumBruteForce(int[] arr)
    {
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum>maxSum)
                    maxSum=sum;
            }
        }

        return maxSum;
    }

//using Kadanes Algorithm
//time complexity O(n)
//need to study imp
    public static int maxSubArraysSumUsingKadanes(int[] arr)
    {
        int result=arr[0];
        int front=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if((front+arr[i]>arr[i]))
            {
                front=front+arr[i];
            }
            else
            {
                front=arr[i];
            }

            if(result<front)
            {
                result=front;
            }
        }

        return result;
    }
}
