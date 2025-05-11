import java.util.Scanner;

public class trailing0
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int i=5;
        int count=0;
        while(num/i!=0)
        {
            count+=num/i;
            // i*=5;
             num=num/i;
        }
        System.out.println("Total number of trailing 0's="+count);

    }
}