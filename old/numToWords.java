import java.util.Scanner;

public class numToWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(num);
        int len=(int) Math.log10(num) + 1;
        int rem;
        String[] nums = {"one","two","three","four","five","six","seven","eight","nine","ten"};
        System.out.println("test"+num/1000);
        while(num!=0)
        {
            len=(int) Math.log10(num) + 1;
            System.out.println("lenght"+len);
            switch(len)
            {
                case 4:
                {
                    rem=num%1000;
                    num/=1000;
                    System.out.println(num);
                }
                case 3:
                {
                    rem=num%100;
                    num/=100;
                    System.out.println(num);
                }
                case 2:
                {
                    rem=num%10;
                    num/=10;
                    System.out.println(num);
                }
                case 1:
                {
                    rem=num%1;
                    num/=1;
                    System.out.println(num);
                }
            }
        }
        
}
}
