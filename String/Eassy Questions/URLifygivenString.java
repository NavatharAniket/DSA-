public class URLifygivenString {
    public static void main(String[] args)
    {
        String str="Mr Benedict Cumberbatch";
        System.out.println("Result is "+result(str));
    }

    public static String result(String str)
    {

        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ')
            {
                sb.append("%20");
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
