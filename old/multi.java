import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int i;
        int c=0;
        for(i=0;i<a;i++)
        {
            c+=b;
        }
        System.out.println(c);

    }
}
