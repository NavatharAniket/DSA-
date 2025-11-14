import java.util.*;
public class FindOnlyRepetitiveElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4};
        System.out.println("Find Non Repeatating Element " + findDublicateUsingHashMap(arr));
    }

//Nested Loop Brute Force
//Time Complexity O(n2)
    public static int findDuplicateBruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

//using sorting
//Time Complexity is (n2)
    public static int findDuplicateSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                return arr[i];
        }
        return -1;
    }

//using Hashmap
//time Complexity is O(n)
    public static int findDublicateUsingHashMap(int[] arr)
    {
        Set<Integer>s=new HashSet<>();
        for (int i:arr)
        {
            if (s.contains(i))
            {
                return  i;
            }
            else {
                s.add(i);
            }
        }
        return -1;
    }

//using sum
//Time complexity is O(n)
    public static int findDublicateUsingSum(int[] arr)
    {
        long sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }

        long predicted=(long)arr.length * (arr.length-1)/2;
        return (int)(sum-predicted);
    }
}
