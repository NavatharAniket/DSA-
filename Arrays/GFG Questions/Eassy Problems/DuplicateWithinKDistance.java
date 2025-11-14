import java.util.Set;
import java.util.HashSet;

public class DuplicateWithinKDistance {
    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4, 1, 2, 3, 4};
        int k=3;
        if(!checkDublicateWithingK(arr,k))
        {
            System.out.print("Contain unique Value Withing Window");
        }
        else
        {
            System.out.println("Contains Dublicate value");
        }

        System.out.println();
        if(!checkDublicateWithingK2(arr,k))
        {
            System.out.print("Contain unique Value Withing Window");
        }
        else
        {
            System.out.println("Contains Dublicate value");
        }

    }

//brute Force Approach
    public static boolean checkDublicateWithingK(int[] arr,int k)
    {

        for (int i = 0; i < arr.length-k+1; i++) {
            for (int j = i+1; j <i+k && j < arr.length ; j++) {
                if (arr[i]==arr[j])
                    return true;
            }
        }
        return false;
    }

//Better Version
//using HashSet
    public static boolean checkDublicateWithingK2(int[] arr,int k)
    {
        Set<Integer>s=new HashSet<Integer>();
        int j=0;
        for (int i = 0 ; i < arr.length; i++) {
             if(s.contains(arr[i]))
             {
                 return true;
             }
             else
             {
                 s.add(arr[i]);
             }

             if(s.size()>k)
             {
                 s.remove(arr[j]);
                 j++;
             }
        }
        return false;
    }
}
