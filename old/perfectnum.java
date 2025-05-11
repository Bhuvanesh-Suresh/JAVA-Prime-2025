import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int n=num;
        int tot=0;
        int i;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                tot+=i;
            }
        }
        System.out.println(tot);
        if(tot==num)
        {
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not perfect number");
        }
    }
}
