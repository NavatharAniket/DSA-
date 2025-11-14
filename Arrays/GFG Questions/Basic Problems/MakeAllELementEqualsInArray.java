public class MakeAllELementEqualsInArray {
    public static void main(String[] args)
    {
        int[] arr={4, 7, 19, 16};
        int key=3;

//brute force
//calculating max and check equals or not

        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max number is "+max);

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max)
            {
                continue;
            }
            while(arr[i]<max)
            {
                count++;
                arr[i]+=key;
            }
            if(arr[i]>max)
            {
                System.out.println("Not make them same");
                break;
            }
        }

// find diff and check
         count=0;
         max=0;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }

        for (int i :arr) {
            int sum=max-i;
            int rem = sum%key;
            int div=sum/key;

            if(rem>0)
            {
                System.out.println("cannot match with output " +i);
                break;
            }
            else {
                count+=div;
            }
        }

        System.out.print("Count is "+count);

    }
}
