public class revstr {
    public static void main(String[] args) {
        String str="Hello";
        int n=str.length();
        strrev(str,n);
        
    }
    public static String strrev(String str,int n)
    {
        if(n==0)
        {
            return str.charAt(0);
        }
        else
        {
            return str.charAt(n)+(strrev(str,n-1));
        }
    }
}
