import java.util.*;
public class MissingAndRepeating {
    public static void main(String[] args)
    {
        int[] arr={4, 3, 6, 2, 1, 1};
        System.out.println("the numbers are "+findTwoNumberHashMap(arr));
    }

//Using Hashmap
//Time Complexity is O(n) and Space Complexity is O(n)
    public static ArrayList findTwoNumberHashMap(int[] arr)
    {
        ArrayList<Integer>al=new ArrayList<>();
        Map<Integer,Integer>hm=new HashMap<>();
         for (int i:arr)
         {

             Integer val=hm.get(i);
             if (val==null)
             {
                 val=0;
             }
             val++;
             hm.put(i,val);
         }

         for (int i=1;i<= arr.length;i++)
         {
             if (hm.get(i)==null)
             {
                 al.add(i);
             }
         }

        for (int i = 1; i < arr.length; i++) {
            if ( hm.get(i)!=null && hm.get(i)==2) {
                al.add(i);
            }
        }
         return al;
    }

//Better solutions

}
