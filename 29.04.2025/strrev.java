public class strrev {
    public static void main(String[] args) {
        String str="four";
        int n=str.length()-1;
        System.out.println(n);

        String result=rev(str,n);
        System.out.println(result);

    }
    public static String rev(String str,int n)
    {
        if(n==0)
        {
            return str;
        }
        else
        {
        return str.charAt(n)+(rev((str.substring(0,n)),n-1));
        }
    }
}
