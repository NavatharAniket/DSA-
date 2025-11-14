public class StockBuyAndSellMultipleTransactionAllowed {
    public static void main(String[] args)
    {
        int[] arr={100, 180, 260, 310, 40, 535, 695};
        System.out.println("Profit using Brute Force is "+maxProfitOptimalSolution(arr));
    }

//Optimal Solution Approach
//Time Complexity is O(n)
    public static int maxProfitOptimalSolution(int[] arr)
    {
        if(arr.length<2)
        {
            return 0;
        }
        int sum=0;
        int back=0;
        int profit=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1])
            {
                sum+=profit;
                profit=0;
                back=i;
            }
            profit=arr[i]-arr[back];
        }
        profit=arr[arr.length-1]-arr[back];
        sum+=profit;
        return sum;
    }
}
