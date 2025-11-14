public class MoveZeroToEnd {
    public static void main(String[] args)
    {
        int[] arr={1, 2, 0, 4, 3, 0, 5, 0};
//brute force
    /*
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                for (int j = i+1; j < arr.length ; j++) {
                    arr[j-1]=arr[j];
                }
                arr[arr.length-1]=0;
            }
        }
    */

//using count variable
    /*
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                count++;
                continue;
            }
            arr[i-count]=arr[i];
        }

        for (int i = arr.length-count; i < arr.length ; i++) {
            arr[i]=0;
        }

     */

//count with swap method
        int start=0;
        int count=0;
        while (start< arr.length)
        {

            start++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
