public class recloop {
    public static void main(String[] args) {
        rec(1);
        for(int i=1;i<=Integer.MAX_VALUE;i++)
        {
            System.out.println(i);
        }
    }
    public static void rec(int count)
    {
        if(count>Integer.MAX_VALUE)
        {
            return;
        }
        System.out.println(count);
        rec(count+1);
    }
}
