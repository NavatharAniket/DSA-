public class SumOfSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Sum of SubArrays is from Brute Force "+subArraySumBrute(arr));
        System.out.println("Sum of SubArrays From Better Soluton " + subArraySumBetter(arr));
        System.out.println("Optimal Solution is "+subArraySumOptimal(arr));
    }

//Brute Force Approach
//Time Complexity is O(n3)
    public static int subArraySumBrute(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sumTemp = 0;
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sumTemp += arr[k];
                }
            }
            sum += sumTemp;
            System.out.println("sum is " + sum);
        }
        return sum;
    }


//Better Solution
//time Complexity is O(n2)
    public static int subArraySumBetter(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                sum += temp;
            }
        }
        return sum;
    }


//Optimal Solution
// in this answer we need to find the pattern like how manytime that element really occurs
// every element is Occures at time (i+1)*(arr.length-i)
    public static int subArraySumOptimal(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {
              sum+=arr[i]*(i+1)*(arr.length-i);
        }
        return sum;
    }

}
