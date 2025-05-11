import java.util.Scanner;

public class overload {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        System.out.println(calculate(n1,n2));
        System.out.println(calculate(n1));
    }
}
public static int calculate(int a,int b)
{
    return a+b;
}
public static int calculate(int a)
{
    return a*a;
}
 