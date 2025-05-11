import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int div=0;
        try
        {
            div=num1/num2;
            System.out.println(div);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Dont divide by 0!!!");
        }
        finally
        {
            System.out.println("Nandrigal pala !!!");
        }
    }
}
