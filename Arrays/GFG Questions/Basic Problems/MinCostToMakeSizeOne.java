public class MinCostToMakeSizeOne {
    public static void main(String[] args)
    {
        int[] arr={4,3,2};
        int min=Integer.MAX_VALUE;

        if(arr.length==1)
        {
            System.out.println("its all ready in one ");
        }
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }

        min*=arr.length-1;
        System.out.print(min);
    }
}
