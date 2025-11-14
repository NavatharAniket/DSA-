import java.util.*;
public class CheckforBinaryString {
    public static void main(String[] args)
    {
        String s="i got intern at geeksforgeeks";
        StringBuilder b=new StringBuilder(s);
        for(int i=1;i<b.length();i++)
        {
            char c=b.charAt(i-1);
            if(c==' ')
            {

                char p=b.charAt(i);
                p= (char)(p-32);
                b.setCharAt(i,p);
                b.deleteCharAt(i-1);
            }
        }
        System.out.println(b);
    }
}
