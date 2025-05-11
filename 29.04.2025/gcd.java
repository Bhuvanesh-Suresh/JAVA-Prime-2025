public class gcd
{
    public static void main(String[] args) {
        int a=30;
        int b=18;
        int result=gcd(a,b);
        System.out.println(result);
        
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}