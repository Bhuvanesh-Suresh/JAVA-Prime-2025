import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num =scan.nextInt();
        int rev=0;
        int rem;
        while(((int) Math.log10(rev) + 1)<((int) Math.log10(num) + 1))
        {
            rem =num%10;
            rev=rev*10 + rem;
            num=num/10;
        }
        System.out.println(rev);
        System.out.println(num);
        if(rev==num)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}
