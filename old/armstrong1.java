import java.util.Scanner;//INCOMPLETE

public class armstrong1 {
    public static int numpower(int num,int length)
    {
        int i;
        for(i=0;i<length;i++)
        {
            num*=num;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int length=(int)Math.log10(num)+1;
        int n=num;
        int rem;
        int tot=0;
        while(n!=0)
        {
            rem =n%10;
            tot+=numpower(rem,length);
            n=n/10;
        }
        System.out.println(tot);
        if (tot==num)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not armstrong");
        }

    }
}
