public class BinaryString {
    public static void main(String[] args)
    {
        String str="1111";
        System.out.println("count is "+binarySubstring(str));
    }

    //Brute Force
    public static int binarySubstringBinarySearch(String s) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i)=='1' && s.charAt(j)=='1')
                {
                    count++;
                }
            }
        }

        return count;
    }

    public static int binarySubstring(String s)
    {
        int count=0;

        return count;
    }

}
