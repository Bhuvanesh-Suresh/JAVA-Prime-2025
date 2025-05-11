import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int isprime;
        int i;
        int j;
        int iteration=0;
        for(i=2;i<=n;i++)
        {
            isprime=1;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    isprime=0;
                    break;
                }

            }
            if(isprime==1)
            {
                System.out.println(i+"Prime");
                

            }
            iteration++;   
        }
        System.out.println(iteration);

    }

}
