public class FirstOccurence {
    public static void main(String[] args)
    {
        String s="GeeksForGeeks";
        String pat="For";
            System.out.println("First Occurance is "+firstOccuranceBruteForce(s,pat));
    }

//BruteForce Method
    public static int firstOccuranceBruteForce(String s,String pat)
    {
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            char ch1=pat.charAt(0);
            if(ch==ch1)
            {
                System.out.println(ch+" "+ch1);
                boolean flag=true;
                for (int j = 0; j <pat.length() ; j++) {
                    if(s.charAt(i+j)!=pat.charAt(j))
                    {
                        System.out.println(pat.charAt(j)+" "+s.charAt(i));
                        flag=false;
                        break;
                    }

                }

                if (flag)
                {
                    return i;
                }
            }
        }
        return -1;
    }


}
