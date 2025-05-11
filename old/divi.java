import java.util.Scanner;

public class divi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int i;
        int count=0;
        for(i=0;i<b;i++)
        {
            a-=b;
            // System.out.println(a);
            // System.out.println(b);
            count++;
        }
        System.out.println(a);
        System.out.println(count);
    }
}
