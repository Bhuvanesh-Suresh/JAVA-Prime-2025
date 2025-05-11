public class fact {
    public static void main(String[] args) {
        int fact = fact0(5);
        System.out.println(fact);
    }
    public static int fact0(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n* fact0(n-1);
    }
    
}
