public class EquilibriumPoint {
    public static void main(String[] args)
    {
        int[] arr={1, 2, 0, 3};
        System.out.println("Equilibriunm point is "+findEquilibriumBruteForce(arr));
    }

//Brute Force Method
    public static int findEquilibriumBruteForce(int arr[]) {

        int sum=0;
        for (int i:arr) {
            sum+=i;
        }

        sum/=2;
        int startSum=0;
        int endSum=0;
        int start=0;
        int end= arr.length-1;
        while(start<=end)
        {
            if(startSum==endSum && start==end) {
                return start;
            }
            startSum+=arr[start++];
            endSum+=arr[end--];
        }
        return -1;
    }
}
