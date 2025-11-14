public class MissinginArray {
    public static void main(String[] args)
    {
        int[] arr={8, 2, 4, 5, 3, 7, 1};
        System.out.println("missing number is "+missingNumberOptimal(arr));
    }


//BruteForce Approach
//O(n2)

    public static int MissingNumberBruteForce(int[] arr)
    {
        if(arr.length==1)
        {
            return 2;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i = 0; i<arr.length; i++) {
            if(arr[i]!=i+1)
            {
                return i+1;
            }
        }
        return -1;
    }
//Better Solution
//Hashing Number
    public static int missingNumberBetter(int[] arr)
    {
        int[] hash=new int[arr.length+2];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        for (int i = 1; i < hash.length ; i++) {
            if(hash[i]==0)
            {
                return i;
            }
        }
        return -1;
    }

//better solution
//O(n)
    public static int missingNumberOptimal(int[] arr)
    {
        int sum=0,expexted=0;
        for (int i:arr) {
            sum+=i;
        }
        int max=0;
        int n= arr.length+1;
       expexted=  n * (n+1)/2;
        return expexted-sum;
    }
}
