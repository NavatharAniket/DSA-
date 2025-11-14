public class RotateArrays {
    public static void rotateArray(int[] arr,int index)
    {
//brute force method

        for(int i=0;i<index;i++)
        {
            int first=arr[0];
            for(int j=1;j<arr.length;j++)
            {
                int temp=arr[j];
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=first;
        }
//using temporary arrays
       int[] temp=new int[index];
        for(int i=0;i<index;i++)
        {
            temp[i]=arr[i];
        }

        for (int i = index; i < arr.length; i++) {
            arr[i-index]=arr[i];
        }

        int t=0;
        for (int i = arr.length-index; i < arr.length ; i++) {
            arr[i]=temp[t];
            t++;
        }


//Juggling Algorithm
//reverse Method
        int start=0;
        int end=index-1;
        reverse(arr,0,index-1);
        reverse(arr,index,arr.length-1);
        reverse(arr,0, arr.length-1);
        for(int i:arr)
        {
            System.out.print(  i+" ");
        }


    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4, 5} ;
        int index = 2;
        rotateArray(arr,index);
    }
}
