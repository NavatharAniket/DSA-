import java.util.Map;
import java.util.HashMap;
public class UniqueNumber {
    public static void main(String[] args)
    {
        int[] arr={1 ,8 ,8 ,1 ,5 ,10, 5};
        System.out.println("Unique number is "+findUniqueBetter(arr));
    }
//BruteForce
//Time Complexity O(n2)
    public static int findUniqueBruteForce(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            boolean flag=true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    flag=false;
                }
            }
            if(flag)
            {
                return arr[i];
            }
        }
        return -1;
    }

//Better Solution is
//using hashmap

     public  static int findUniqueBetter(int[] arr)
     {
         Map<Integer,Integer>hm=new HashMap<>();

         for (int i = 0; i < arr.length; i++) {
            Integer val=hm.get(arr[i]);
            if(val==null)
            {
                val=0;
            }
            val++;
            hm.put(arr[i],val);
         }

         System.out.println(hm);
         for (int i = 0; i < arr.length; i++) {

             if (hm.get(arr[i])==1)
             {
                 return arr[i];
             }
         }
         return -1;
     }


//Optimal Solution
//this need xor operations

}
