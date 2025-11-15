import java.util.*;
public class K_Anagram {
    public static void main(String[] args)
    {
        String s1="fodr";
        String s2="gork";
        int k=2;
        System.out.println("it is k Anyagram or not " + kAnyagramOptimal(s1,s2,k));
    }
//Optimal solution
//O(n)
    public static boolean kAnyagramOptimal(String s1,String s2,int k)
    {
        if (s1.length()!=s2.length())
            return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        HashSet<Character>hm1=new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            Integer val=hm.get(s1.charAt(i));
            if (val==null)
                val=0;

            val++;
            hm.put(s1.charAt(i),val);
        }


        int count1=0;
        for (char c : s2.toCharArray()) {
            if (hm.containsKey(c) && hm.get(c) > 0) {
                Integer val=hm.get(c);
                if (val > 1)
                    val--;
                else
                    val = 0;
                hm.put(c,val);
            }
            else
            {
                count1++;
            }
        }
        return count1<=k;
    }
}
