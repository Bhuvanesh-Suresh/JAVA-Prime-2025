import java.util.Scanner;

public class menudriven {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int inp=input();
        int num1=scan.nextInt();
        int num2=scan.nextInt(); 
        while(inp!=5)
        {
            switch(inp)
            {
                case 1:
                System.out.println(add(num1,num2)); 
                break;
                case 2:
                System.out.println(sub(num1,num2)); 
                break;
                case 3:
                System.out.println(mul(num1,num2)); 
                break;
                case 4:
                System.out.println(div(num1,num2));
                break;
            }
            inp=input();
        }
        
    }
    public static int input()
    {
        Scanner scan =new Scanner(System.in);
        int inp=scan.nextInt();
        return inp;
    }
    public static int add(int num1,int num2)
    {
        int res=num1+num2;
        return res;
    }
    public static int sub(int num1,int num2)
    {
        int res=num1-num2;
        return res;
    }
    public static int mul(int num1,int num2)
    {
        int res=num1*num2;
        return res;
    }
    public static int div(int num1,int num2)
    {
        int res=num1/num2;
        return res;
    }
}
