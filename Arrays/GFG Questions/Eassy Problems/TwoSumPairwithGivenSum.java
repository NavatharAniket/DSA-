import java.util.*;
public class TwoSumPairwithGivenSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        System.out.println("is find " + twoSumOptimalSolution(arr, target));
    }

    // Brute Force
//Time Complexity O(n2)
    public static boolean twoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    //Optimal Solution
    public static boolean twoSumOptimalSolution(int[] arr, int target) {
        Set<Integer>s=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(s.contains(target-arr[i]))
            {
                return true;
            }
            else {
                s.add(arr[i]);
            }
        }

        return false;
    }
}
