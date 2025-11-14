public class sqrt {
    public static void main(String[] args)
    {
        System.out.println("Sqrt is "+findsqrt(12 ));
    }
    public static int findsqrt(int n)
    {
        int start=1;
        int end=n/2;
        int result=0;
        while(end>=start)
        {

            int mid=end-(end-start)/2;
            if(mid*mid<=n) {

                result=mid;
                start = mid + 1;
            }
            else {
                end=mid-1;
            }

        }

        return result;
    }
}
