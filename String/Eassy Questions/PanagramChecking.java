import java.util.Locale;

public class PanagramChecking {
    public static void  main(String[] args)
    {
        String s="sdfs";
        System.out.println("is true or not "+BruteForce(s));
    }

//Brute force
    public static boolean BruteForce(String s)
    {
        int[] panagram=new int[26];
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int p=s.charAt(i);
            if(p>='a' && p<='z')
            {
                int c=p-97;
                panagram[c]++;
            }
        }

        for (int i = 0; i < panagram.length; i++) {
            if(panagram[i]==0)
                return false;
        }
        return true;
    }
}
