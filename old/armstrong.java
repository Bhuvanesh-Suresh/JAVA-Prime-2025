import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();
        int n=num;
        int rem;
        int tot=0;
        int len = (int) Math.log10(num)+1;
        System.out.println(len);
        while(n!=0)
        {
            rem =n%10;
            tot+=(int)Math.pow(rem,len);
            n=n/10;
        }
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
